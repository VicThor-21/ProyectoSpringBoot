package com.proyecto.spring.protectoracanina.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.repository.PerroRepo;
import com.proyecto.spring.protectoracanina.service.PerroService;

@Service
public class PerroDAO implements PerroService {
	
	@Autowired
	private PerroRepo perroRepo;

	@Override
	public Perro insertarPerro(String nombre, int edad, String raza, boolean sexo, float peso, int estado,
			LocalDate fechaIngreso) {
		Perro p=new Perro();
		p.setNombre(nombre);
		p.setEdad(edad);
		p.setRaza(raza);
		p.setSexo(sexo);
		p.setPeso(peso);
		p.setEstado(estado);
		p.setFechaIngreso(fechaIngreso);
		
		return perroRepo.save(p);
	}

	@Override
	public List<Perro> listadoPerros() {
		
		return perroRepo.findAll();
	}

	@Override
	public Perro obtenerPerro(int id) {
		
		return perroRepo.findById(id).orElse(null);
	}

	@Override
	public Perro obtenerPerro(String nombre) {
		
		return perroRepo.findByNombre(nombre).orElse(null);
	}

}
