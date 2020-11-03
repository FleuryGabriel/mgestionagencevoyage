package com.mvol.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvol.entity.Vol;
import com.mvol.service.IVolService;
import com.mvol.service.VolServiceImpl;

@RestController(value = "/vol")
public class VolController {

	private IVolService vServ = new VolServiceImpl();
	
	@GetMapping(value = "/getById/{pId}")
	public Vol getVolById(@PathVariable(name = "pId") int id) {
		return vServ.getVolById(id);
	}

	@GetMapping(value = "/getAll")
	public List<Vol> getAllVol() {
		return vServ.getAllVol();
	}

	@PostMapping(value = "/add")
	public Vol addVol(@RequestBody Vol vIn) {
		return vServ.addVol(vIn);
	}

	@PutMapping(value = "update")
	public Vol updateVol(@RequestBody Vol vIn) {
		return vServ.updateVol(vIn);
	}

	@DeleteMapping(value = "delete/{pId}")
	public void deleteVol(@PathVariable(value = "pId") int id) {
		vServ.deleteVol(vServ.getVolById(id));
	}

	
	
}
