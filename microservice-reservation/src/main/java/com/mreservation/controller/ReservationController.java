package com.mreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mreservation.entity.Reservation;
import com.mreservation.service.IReservationService;
import com.mreservation.service.ReservationServiceImpl;


@RestController(value = "/reservation")
public class ReservationController {
	
	@Autowired
	private IReservationService rServ = new ReservationServiceImpl();
	
	@GetMapping(value = "/getById/{pId}")
	public Reservation getReservationById(@PathVariable(name = "pId") int id) {
		return rServ.getReservationById(id);
	}

	@GetMapping(value = "/getAll")
	public List<Reservation> getAllReservation() {
		return rServ.getAllReservation();
	}

	@PostMapping(value = "/add")
	public Reservation addReservation(@RequestBody Reservation vIn) {
		return rServ.addReservation(vIn);
	}

	@PutMapping(value = "update")
	public Reservation updateReservation(@RequestBody Reservation vIn) {
		return rServ.updateReservation(vIn);
	}

	@DeleteMapping(value = "delete/{pId}")
	public void deleteReservation(@PathVariable(value = "pId") int id) {
		rServ.deleteReservation(rServ.getReservationById(id));
	}


}
