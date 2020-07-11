package com.reservation.util;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.reservation.entities.ReservationEntity;
import com.reservation.repositories.ReservationRepository;

@Component
public class DataLoader implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Loading Data...");
		reservationRepository.save(new ReservationEntity("Reservation No. 1", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 2", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 3", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 4", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 5", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 6", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 7", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 8", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 9", LocalDateTime.now()));
		reservationRepository.save(new ReservationEntity("Reservation No. 10", LocalDateTime.now()));

	}

}
