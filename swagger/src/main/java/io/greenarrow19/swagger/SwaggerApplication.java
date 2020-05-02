package io.greenarrow19.swagger;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {

	@Bean
	public Docket swaggerConfig(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
//				.paths(PathSelectors.ant("/app/*"))
				.apis(RequestHandlerSelectors.basePackage("io.greenarrow19"))
				.build()
				.apiInfo(apiDetails());
	}
	
	public ApiInfo apiDetails(){
		return new ApiInfo("App Api",
		                   "Learning Swagger Implementation",
		                   "1.0",
		                   "Free to use",
		                   new springfox.documentation.service.Contact("Nakul Goyal","http://github.com/nakulGoyal19"
				                   ,"..."),
		                   "...",
		                   "...",
		                   Collections.emptyList());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
