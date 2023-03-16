package de.qualityminers.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import de.qualityminers.statistics.rest.StatisticsCalculationController;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "QM Cloud", version = "1.0.82-Moon"), servers = {
	@Server(url = "/", description = "QM Cloud") }) //TODO : Is this necessary?
@ComponentScan(basePackageClasses = {
		StatisticsCalculationController.class
})
public class StatisticsCalculationApp {

	public static void main(String[] args) {
		SpringApplication.run(StatisticsCalculationApp.class, args);
	}

}
