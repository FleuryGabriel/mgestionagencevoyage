package com.mvol.service;

import java.util.List;

import com.mvol.entity.Vol;

public interface IVolService {
	
	Vol getVolById(int id);
	List<Vol> getAllVol();
	
	Vol addVol(Vol vIn);
	Vol updateVol(Vol vIn);
	void deleteVol(Vol vIn);

}
