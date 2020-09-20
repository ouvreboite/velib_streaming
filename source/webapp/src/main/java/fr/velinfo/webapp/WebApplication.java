package fr.velinfo.webapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import fr.velinfo.properties.ConnectionConfiguration;

import java.io.IOException;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Value("${connection.file}")
	private String connectionFile;

	@Bean
	@Scope("singleton")
	public ConnectionConfiguration connectionConfiguration() throws IOException {
		return new ConnectionConfiguration(this.connectionFile);
	}
}
