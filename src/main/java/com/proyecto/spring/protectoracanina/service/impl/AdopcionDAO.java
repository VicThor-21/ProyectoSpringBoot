package com.proyecto.spring.protectoracanina.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.spring.protectoracanina.entity.Adopcion;
import com.proyecto.spring.protectoracanina.entity.Adoptante;
import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.repository.AdopcionRepository;
import com.proyecto.spring.protectoracanina.service.AdopcionService;

@Service
public class AdopcionDAO implements AdopcionService {
	
	@Autowired
	private AdopcionRepository adopcionRepository;

	@Override
	public Adopcion insertarAdopcion(Date fecha, int estado, boolean donacion, Perro perro, Adoptante adoptante) {
		
		Adopcion a=new Adopcion();
		a.setFechaAdopcion(fecha);
		a.setEstado(estado);
		a.setDonacion(donacion);
		a.setPerro(perro);
		a.setAdoptante(adoptante);
		
		return adopcionRepository.save(a);
	}

	@Override
	public List<Adopcion> listadoAdopciones() {
		
		return adopcionRepository.findAll();
	}

	@Override
	public Adopcion obtenerAdopcion(int id) {
		
		return adopcionRepository.findById(id).orElse(null);
	}

}
