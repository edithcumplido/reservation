package com.reservation.model.response;

import java.time.LocalDateTime;

import lombok.Data;

public @Data class ReservationRest {

	private Integer id;
	private String name;
	private LocalDateTime time;

}
