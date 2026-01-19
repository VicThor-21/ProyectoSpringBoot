package com.proyecto.spring.protectoracanina.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.spring.protectoracanina.CausaHC;
import com.proyecto.spring.protectoracanina.entity.HistorialClinico;
import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.repository.HCRepository;
import com.proyecto.spring.protectoracanina.service.HCService;

@Service
public class HCServiceImpl implements HCService {
	
	@Autowired
	private HCRepository hcRepo;

	@Override
	public HistorialClinico insertarHC(CausaHC causa, String descripcion, LocalDateTime fecha, String veterinario, Perro perro) {
		
		HistorialClinico hc=new HistorialClinico();
		hc.setCausa(causa);
		hc.setDescripcion(descripcion);
		hc.setFecha(fecha);
		hc.setVeterinario(veterinario);
		hc.setPerro(perro);
		
		return hcRepo.save(hc);
	}

	@Override
	public List<HistorialClinico> listadoHC() {
		
		return hcRepo.findAll();
	}

	@Override
	public HistorialClinico obtenerHC(int id) {
		
		return hcRepo.findById(id).orElse(null);
	}

}
