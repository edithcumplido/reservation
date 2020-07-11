package com.reservation.entities;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservations")
@Data
@NoArgsConstructor
public class ReservationEntity {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private LocalDateTime time;

	public ReservationEntity(String name, LocalDateTime time) {
		this.name = name;
		this.time = time;
	}

}
