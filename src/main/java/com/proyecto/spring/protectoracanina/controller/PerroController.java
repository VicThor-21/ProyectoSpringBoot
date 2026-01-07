package com.proyecto.spring.protectoracanina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.service.PerroService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/perro")
public class PerroController {
	@Autowired
	private PerroService perroService;
	
	@GetMapping(value="/add/{nombre}")
	public Perro insertarPerro(@PathVariable String nombre) {
		log.info("Inicio: insertarPerros");
		
		Perro perro=perroService.insertarPerro(nombre, 0, nombre, false, 0, 0, null);
		return perro;
	}
	
	@GetMapping(value= {"","/"})
	public List<Perro> listadoPerros(){
		log.info("Inicio: listadoPerros");
		List<Perro> perros=perroService.listadoPerros();
		return perros;
	}
	
	@GetMapping(value="/{id}")
	public Perro obtenerPerro(@PathVariable Integer id) {
		log.info("Inicio: obtenerPerro");
		
		Perro perro=perroService.obtenerPerro(id);
		
		return perro;
	}
}
