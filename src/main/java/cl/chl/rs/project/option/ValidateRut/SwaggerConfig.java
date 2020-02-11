package cl.chl.rs.project.option.ValidateRut;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * Metodo encargado de configurar Swagger, indicando el package al cual debe buscar
	 * los servicios REST
	 */
	@Bean
	public Docket api() {
		return new Docket(
				DocumentationType.SWAGGER_2).select().
				apis(RequestHandlerSelectors.basePackage("cl.chl.rs.project.option.controller")).
				paths(PathSelectors.any()).build()
				.tags(new Tag("Validate Name", "Servicios REST de aplicacion Validate Name"));
	}
}