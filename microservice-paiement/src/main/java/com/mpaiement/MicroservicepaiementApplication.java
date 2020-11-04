package com.mpaiement;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mpaiement.entity.Paiement;
import com.mpaiement.repository.IPaiementRepository;

@SpringBootApplication
public class MicroservicepaiementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicepaiementApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(IPaiementRepository pRep) {
		return (args) -> {
			Stream.of(new Paiement(3000, 158456l), new Paiement(5000, 9785455l)).forEach( (p) -> pRep.save(p));
		};
	}

}
