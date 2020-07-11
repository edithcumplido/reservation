package com.reservation.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.dto.ReservationDTO;
import com.reservation.entities.ReservationEntity;
import com.reservation.repositories.ReservationRepository;
import com.reservation.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public List<ReservationDTO> getReservationsList() {
		List<ReservationDTO> reservationDTOList = new ArrayList<>();
		ModelMapper modelMapper = new ModelMapper();

		List<ReservationEntity> reservationEntityList = reservationRepository.findAll();

		reservationEntityList
				.forEach(reservation -> reservationDTOList.add(modelMapper.map(reservation, ReservationDTO.class)));

		return reservationDTOList;
	}

}
