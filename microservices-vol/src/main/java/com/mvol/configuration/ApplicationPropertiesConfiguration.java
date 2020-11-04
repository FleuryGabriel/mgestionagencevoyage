package com.mvol.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Demo de la nécessité de spring cloud

@Component
@ConfigurationProperties("mes-configs")
public class ApplicationPropertiesConfiguration {
	
	private int limitDeVols;

	public int getLimitDeVols() {
		return limitDeVols;
	}

	public void setLimitDeVols(int limitDeVols) {
		this.limitDeVols = limitDeVols;
	}
	
	

}
