package com.clientui.beans;

public class PaiementBean {

	private int id;
	
	private Integer idReservation;
	private Integer montant;
	private Long numeroCarte;
	
	
	public PaiementBean() {
	}
	public PaiementBean(Integer idReservation, Integer montant, Long numeroCarte) {
		this.idReservation = idReservation;
		this.montant = montant;
		this.numeroCarte = numeroCarte;
	}
	public PaiementBean(int id, Integer idReservation, Integer montant, Long numeroCarte) {
		this.id = id;
		this.idReservation = idReservation;
		this.montant = montant;
		this.numeroCarte = numeroCarte;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}
	public Integer getMontant() {
		return montant;
	}
	public void setMontant(Integer montant) {
		this.montant = montant;
	}
	public Long getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(Long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	
	
	@Override
	public String toString() {
		return "Paiement [id=" + id + ", idReservation=" + idReservation + ", montant=" + montant + ", numeroCarte="
				+ numeroCarte + "]";
	}
	
	
	
}
