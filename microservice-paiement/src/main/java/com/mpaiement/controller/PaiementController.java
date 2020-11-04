package com.mpaiement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mpaiement.entity.Paiement;
import com.mpaiement.service.IPaiementService;
import com.mpaiement.service.PaiementServiceImpl;


@RestController
public class PaiementController {
	
	@Autowired
    private IPaiementService pServ = new PaiementServiceImpl();
	
	@GetMapping(value = "/getById/{pId}")
	public Paiement getPaiementById(@PathVariable(name = "pId") int id) {
		return pServ.getPaiementById(id);
	}

	@GetMapping(value = "/getAllPaiement")
	public List<Paiement> getAllPaiement() {
		return pServ.getAllPaiement();
	}

	@PostMapping(value = "/addPaiement")
	public Paiement addPaiement(@RequestBody Paiement vIn) {
		return pServ.addPaiement(vIn);
	}

	@PutMapping(value = "updatePaiement")
	public Paiement updatePaiement(@RequestBody Paiement vIn) {
		return pServ.updatePaiement(vIn);
	}

	@DeleteMapping(value = "deletePaiement/{pId}")
	public void deletePaiement(@PathVariable(value = "pId") int id) {
		pServ.deletePaiement(pServ.getPaiementById(id));
	}

}
