package com.mreservation.service;

import java.util.List;

import com.mreservation.entity.Reservation;

public interface IReservationService {
	
	Reservation getReservationById(int id);
	List<Reservation> getAllReservation();
	
	Reservation addReservation(Reservation rIn);
	Reservation updateReservation(Reservation rIn);
	void deleteReservation(Reservation rIn);

}
