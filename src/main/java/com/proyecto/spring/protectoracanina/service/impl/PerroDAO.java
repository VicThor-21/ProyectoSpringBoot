package com.proyecto.spring.protectoracanina.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.repository.PerroRepository;
import com.proyecto.spring.protectoracanina.service.PerroService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PerroDAO implements PerroService {
	
	@Autowired
	private PerroRepository perroRepository;

	@Override
	public Perro insertarPerro(String nombre, int edad, String raza, boolean sexo, float peso, int estado,
			Date fechaIngreso) {
		Perro p=new Perro();
		p.setNombre(nombre);
		p.setEdad(edad);
		p.setRaza(raza);
		p.setSexo(sexo);
		p.setPeso(peso);
		p.setEstado(estado);
		p.setFechaIngreso(fechaIngreso);
		
		return perroRepository.save(p);
	}

	@Override
	public List<Perro> listadoPerros() {
		
		return perroRepository.findAll();
	}

	@Override
	public Perro obtenerPerro(int id) {
		log.info("[obtenerPerroPorId]");
		return perroRepository.findById(id).orElse(null);
	}

	@Override
	public List<Perro>  obtenerPerro(String nombre) {
		log.info("[obtenerPerroPorNombre]");
		log.info("[nombre]: {}",nombre);
		
		if (nombre == null || nombre.trim().isEmpty())
			return perroRepository.findAll();
		return perroRepository.findByNombre(nombre);
	}

}
