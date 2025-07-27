package de.berlin.htw.webtech.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebTechDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTechDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(NutzerRepository Nutzers, FoodSpotsRepository FoodSpotsList) {
		return args -> {
			Nutzers.save(new Nutzer("Ralf", "male", 7, "none"));
			FoodSpotsList.save(new FoodSpots( "CITY CHICKEN BERLIN","fast food","Sonnenallee 59, 12045 Berlin",5,"https://www.city-chicken-berlin.de/"));
		};
	}

}
