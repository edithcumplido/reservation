package com.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.entities.ReservationEntity;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Integer> {

}
