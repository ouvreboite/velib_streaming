/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package velibstreaming.avro.record;
@org.apache.avro.specific.AvroGenerated
public enum Status implements org.apache.avro.generic.GenericEnumSymbol<Status> {
  TO_COME, ONGOING, HALTED, EXTENDED, FINISHED, NONE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Status\",\"namespace\":\"velibstreaming.avro.record\",\"symbols\":[\"TO_COME\",\"ONGOING\",\"HALTED\",\"EXTENDED\",\"FINISHED\",\"NONE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}