package com.mpaiement.service;

import java.util.List;

import com.mpaiement.entity.Paiement;

public interface IPaiementService {
	
	Paiement getPaiementById(int id);
	List<Paiement> getAllPaiement();
	
	Paiement addPaiement(Paiement pIn);
	Paiement updatePaiement(Paiement pIn);
	void deletePaiement(Paiement pIn);

}
