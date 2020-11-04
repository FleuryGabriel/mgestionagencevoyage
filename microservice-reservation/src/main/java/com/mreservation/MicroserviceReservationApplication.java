package com.mreservation;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mreservation.entity.Reservation;
import com.mreservation.repository.IReservationRepository;

@SpringBootApplication
public class MicroserviceReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceReservationApplication.class, args);
	}

	@Bean
	CommandLineRunner start(IReservationRepository rRep) {
		return (args) -> {
			Stream.of(new Reservation(new Date(), 3), new Reservation(new Date(), 8)).forEach((r) -> rRep.save(r));
		};
	}

}
