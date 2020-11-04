package com.mvol;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mvol.entity.Vol;
import com.mvol.repository.IVolRepository;

@SpringBootApplication
public class MicroservicesVolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesVolApplication.class, args);
	}
	
	@Bean
    CommandLineRunner start(IVolRepository volRepository) {
        return (args) -> {
            Stream.of(new Vol("Madrid","Vol pour Madrid"), new Vol("Paris","Vol pour Paris")).forEach((v) -> {
                volRepository.save(v);
            });
        };
    }

}
