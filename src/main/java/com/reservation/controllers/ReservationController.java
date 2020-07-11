package com.reservation.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.dto.ReservationDTO;
import com.reservation.model.response.ReservationRest;
import com.reservation.services.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

	@Autowired
	ReservationService reservationService;

	@GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> getReservations() {
		List<ReservationRest> reservationsListResult = new ArrayList<>();
		ModelMapper modelMapper = new ModelMapper();

		List<ReservationDTO> reservationsList = reservationService.getReservationsList();

		reservationsList.forEach(
				reservation -> reservationsListResult.add(modelMapper.map(reservation, ReservationRest.class)));

		return ResponseEntity.ok().body(reservationsListResult);
	}

}
