package com.clientui.beans;

import java.util.Date;

public class ReservationBean {

	private int id;
	
	private Integer volId;
	private Date dateReservation;
	private Integer quantite;
	private Boolean reservationPayee;
	
	
	public ReservationBean() {
	}
	public ReservationBean(Integer volId, Date dateReservation, Integer quantite, Boolean reservationPayee) {
		this.volId = volId;
		this.dateReservation = dateReservation;
		this.quantite = quantite;
		this.reservationPayee = reservationPayee;
	}
	public ReservationBean(int id, Integer volId, Date dateReservation, Integer quantite, Boolean reservationPayee) {
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
	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", volId=" + volId + ", dateReservation=" + dateReservation + ", quantite="
				+ quantite + ", reservationPayee=" + reservationPayee + "]";
	}
	
	
}
