package br.falador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"br.falador"})
@SpringBootApplication
public class FaladorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaladorApplication.class, args);
	}
}
