package velibstreaming.producer.client;

import kong.unirest.Unirest;
import velibstreaming.producer.client.dto.OpenDataDto;

import java.util.HashMap;
import java.util.Map;

public abstract class OpenDataClient<Data extends OpenDataDto> {
    public static final String ROW_COUNT_PARAMETER = "rows";
    public static final String ROW_COUNT_PARAMETER_MAX_VALUE = "10000";
    public static final String BASE_PATH = "https://opendata.paris.fr/api/records/1.0/search/?dataset=";

    private Class<Data> dataClass;
    private String urlPath;
    private Map<String, String> parameters;
    public OpenDataClient(Class<Data> dataClass, String datasetName){
        this.dataClass = dataClass;
        this.urlPath = BASE_PATH+datasetName;
        this.parameters = new HashMap<>();
        this.withParameter(ROW_COUNT_PARAMETER, ROW_COUNT_PARAMETER_MAX_VALUE);
    }

    public OpenDataClient<Data> withParameter(String parameter, String value){
        this.parameters.put(parameter, value);
        return this;
    }
    public Data get() throws OpenDataException{
        String completePath = getCompletePath();
        try{
            return Unirest.get(completePath)
                    .header("accept", "application/json")
                    .asObject(dataClass)
                    .ifFailure(Error.class, r -> {throw r.getBody();})
                    .getBody();
        }catch(Error e){
            throw new OpenDataException("Error when calling "+completePath, e);
        }

    }

    private String getCompletePath() {
        String parametersString = parameters.entrySet().stream()
                .map(e -> "&"+e.getKey() + "=" + e.getValue())
                .reduce((p1, p2) -> p1 + p2)
                .orElse("");
        return urlPath + parametersString;
    }

    public static class OpenDataException extends Exception{
        public OpenDataException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
