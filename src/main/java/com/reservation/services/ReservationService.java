package com.reservation.services;

import java.util.List;

import com.reservation.dto.ReservationDTO;

public interface ReservationService {
	List<ReservationDTO> getReservationsList();
}
