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
			Nutzers.save(new Nutzer("user", ",male", 7, "none"));
			FoodSpotsList.save(new FoodSpots( "CITY CHICKEN BERLIN","fast food","Sonnenallee 59, 12045 Berlin",5,"https://maps.app.goo.gl/cFYyJB51YQZYaZNd9"));
			FoodSpotsList.save(new FoodSpots( "Nutella Rosé","Café","Karl-Marx-Straße 65, 12043 Berlin",5,"https://maps.app.goo.gl/zEJW37tjee6HW7Hi9"));
			FoodSpotsList.save(new FoodSpots( "Cocolo Ramen","asiatische Küche","Gipsstraße 3, 10119 Berlin",5,"https://maps.app.goo.gl/Xx3JAMToPJUXqgHj8"));
			FoodSpotsList.save(new FoodSpots( "Borchardt","Französische Küche","Französische Straße 47, 10117 Berlin",4,"https://www.borchardt-restaurant.de/"));
		};
	}

}
