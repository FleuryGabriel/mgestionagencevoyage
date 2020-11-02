package com.mreservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mreservation.entity.Reservation;
import com.mreservation.repository.IReservationRepository;

@Service
public class ReservationServiceImpl implements IReservationService{

	@Autowired
	private IReservationRepository rRep;
	
	@Override
	public Reservation getReservationById(int id) {
		Optional<Reservation> op = rRep.findById(id);
		return op.get();
	}

	@Override
	public List<Reservation> getAllReservation() {
		return rRep.findAll();
	}

	@Override
	public Reservation addReservation(Reservation rIn) {
		return rRep.save(rIn);
	}

	@Override
	public Reservation updateReservation(Reservation rIn) {
		return rRep.save(rIn);
	}

	@Override
	public void deleteReservation(Reservation rIn) {
		rRep.delete(rIn);
	}

}
