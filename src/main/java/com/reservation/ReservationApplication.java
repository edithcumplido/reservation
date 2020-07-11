package com.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.reservation.repositories.ReservationRepository;

@SpringBootApplication
public class ReservationApplication {

	@Autowired
	ReservationRepository reservationRepository;

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}

}
