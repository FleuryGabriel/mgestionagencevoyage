package com.mreservation.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	
	private Integer volId;
	private Date dateReservation;
	private Integer quantite;
	private Boolean reservationPayee;
	
	
	public Reservation() {
	}
	public Reservation(Integer volId, Date dateReservation, Integer quantite, Boolean reservationPayee) {
		this.volId = volId;
		this.dateReservation = dateReservation;
		this.quantite = quantite;
		this.reservationPayee = reservationPayee;
	}
	public Reservation(int id, Integer volId, Date dateReservation, Integer quantite, Boolean reservationPayee) {
		this.id = id;
		this.volId = volId;
		this.dateReservation = dateReservation;
		this.quantite = quantite;
		this.reservationPayee = reservationPayee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getVolId() {
		return volId;
	}
	public void setVolId(Integer volId) {
		this.volId = volId;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Boolean getReservationPayee() {
		return reservationPayee;
	}
	public void setReservationPayee(Boolean reservationPayee) {
		this.reservationPayee = reservationPayee;
	}
	
	

}
