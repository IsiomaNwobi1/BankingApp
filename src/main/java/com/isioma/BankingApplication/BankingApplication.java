package com.isioma.BankingApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Banking Application",
				description = "Bankend REST APIs for Banking Application",
				version = "v.1.0",
				contact = @Contact(
						name = "Isioma Nwobi",
						email = "stellanwobs@gmail.com",
						url = "https://github.com/IsiomaNwobi1"
				),
				license = @License(
						name = "Banking Application",
						url = "https://github.com/IsiomaNwobi1"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Backend REST APIs for Banking Application",
				url = "https://github.com/IsiomaNwobi1"
		)
)
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

}
