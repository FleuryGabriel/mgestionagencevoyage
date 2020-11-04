package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clientui.beans.PaiementBean;

@FeignClient(name = "microservice-paiement", url = "localhost:9091")
public interface MicroServicePaiementProxies {
	
	@GetMapping(value = "/getAllPaiement")
	List<PaiementBean> getAllPaiement();

}
