package com.FincaReservas.Reto3Finca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EntityScan(basePackages = {"com.FincaReservas.Reto3Finca.Modelos"})
@SpringBootApplication
public class Reto3FincaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto3FincaApplication.class, args);
	}

}
