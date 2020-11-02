package com.mvol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvol.entity.Vol;

@Repository
public interface IVolRepository extends JpaRepository<Vol, Integer>{

}
