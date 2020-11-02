package com.mpaiement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpaiement.entity.Paiement;
import com.mpaiement.repository.IPaiementRepository;

@Service
public class PaiementServiceImpl implements IPaiementService{
	
	@Autowired
	private IPaiementRepository pRep;
	
	@Override
	public Paiement getPaiementById(int id) {
		Optional<Paiement> op = pRep.findById(id);
		return op.get();
	}

	@Override
	public List<Paiement> getAllPaiement() {
		return pRep.findAll();
	}

	@Override
	public Paiement addPaiement(Paiement pIn) {
		return pRep.save(pIn);
	}

	@Override
	public Paiement updatePaiement(Paiement pIn) {
		return pRep.save(pIn);
	}

	@Override
	public void deletePaiement(Paiement pIn) {
		pRep.delete(pIn);
	}

}
