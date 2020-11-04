package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.PaiementBean;
import com.clientui.beans.ReservationBean;
import com.clientui.beans.VolBean;
import com.clientui.proxies.MicroServicePaiementProxies;
import com.clientui.proxies.MicroServiceReservationProxies;
import com.clientui.proxies.MicroServiceVolProxies;

@Controller
public class ClientController {

	@Autowired
	private MicroServiceVolProxies msvp;
	
	@Autowired
	private MicroServiceReservationProxies msrp;
	
	@Autowired
	private MicroServicePaiementProxies mspp;
	
	@RequestMapping("/")
	public String accueil(Model model) {
		
		List<VolBean> vols = msvp.getAllVol();
		model.addAttribute("vols", vols);
		
		List<ReservationBean> reservations = msrp.getAllReservation();
		model.addAttribute("reservations", reservations);
		
		List<PaiementBean> paiements = mspp.getAllPaiement();
		model.addAttribute("paiements", paiements);
		
		return "Accueil";
	}
	
	
	
}
