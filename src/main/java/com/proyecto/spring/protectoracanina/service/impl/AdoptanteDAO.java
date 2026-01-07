package com.proyecto.spring.protectoracanina.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.spring.protectoracanina.entity.Adoptante;
import com.proyecto.spring.protectoracanina.repository.AdoptanteRepo;
import com.proyecto.spring.protectoracanina.service.AdoptanteService;

@Service
public class AdoptanteDAO implements AdoptanteService {
	
	@Autowired
	private AdoptanteRepo adoptanteRepo;

	@Override
	public Adoptante insertarAdoptante(String nombre, String apellidos, String dni, String telefono, String email) {
		
		Adoptante a=new Adoptante();
		a.setNombre(nombre);
		a.setApellidos(apellidos);
		a.setDni(dni);
		a.setTelefono(telefono);
		a.setEmail(email);
		
		return adoptanteRepo.save(a);
	}

	@Override
	public List<Adoptante> listadoAdoptantes() {
		
		return adoptanteRepo.findAll();
	}

	@Override
	public Adoptante obtenerAdoptante(int id) {
		
		return adoptanteRepo.findById(id).orElse(null);
	}

	@Override
	public Adoptante obtenerAdoptante(String nombre) {
		
		return adoptanteRepo.findByNombre(nombre).orElse(null);
	}

}
