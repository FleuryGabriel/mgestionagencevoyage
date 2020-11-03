package com.mpaiement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpaiement.entity.Paiement;

@Repository
public interface IPaiementRepository extends JpaRepository<Paiement, Integer>{
	
	

}
