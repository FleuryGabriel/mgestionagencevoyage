package com.mvol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvol.entity.Vol;
import com.mvol.repository.IVolRepository;

@Service
public class VolServiceImpl implements IVolService{
	
	@Autowired
	private IVolRepository vRep;

	@Override
	public Vol getVolById(int id) {
		Optional<Vol> op = vRep.findById(id);
		return op.get();
	}

	@Override
	public List<Vol> getAllVol() {
		return vRep.findAll();
	}

	@Override
	public Vol addVol(Vol vIn) {
		return vRep.save(vIn);
	}

	@Override
	public Vol updateVol(Vol vIn) {
		return vRep.save(vIn);
	}

	@Override
	public void deleteVol(Vol vIn) {
		vRep.delete(vIn);
	}

}
