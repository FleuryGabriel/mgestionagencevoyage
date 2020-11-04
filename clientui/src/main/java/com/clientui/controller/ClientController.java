package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientui.beans.VolBean;
import com.clientui.proxies.MicroServiceVolProxies;

@Controller
public class ClientController {

	@Autowired
	private MicroServiceVolProxies msvp;
	
	@RequestMapping("/")
	public String accueil(Model model) {
		
		List<VolBean> vols = msvp.getAllVol();
		
		model.addAttribute("vols", vols);
		
		return "Accueil";
	}
	
	
	
}
