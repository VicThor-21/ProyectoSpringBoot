package com.proyecto.spring.protectoracanina.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.spring.protectoracanina.EstadoPerro;
import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.service.PerroService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/perro")
public class PerroRestController {
	@Autowired
	private PerroService perroService;
	
	@PostMapping(value="/add/{perro}") // ruta en el navegador para insertar un nuevo perro
	public void insertarPerro(@PathVariable Perro perro) {
		log.info("Inicio: insertarPerros");
		
		perroService.crearPerro(perro);
		
	}
	
	@GetMapping(value= {"","/"})  // ruta en el navegador para volver a ver el listado de perros
	public List<Perro> listadoPerros(){
		log.info("Inicio: listadoPerros");
		List<Perro> perros=perroService.listadoPerros();
		return perros;
	}
	
	@GetMapping(value="/id/{id}") // busqueda en el navegador por id de perro
	public Perro obtenerPerro(@PathVariable Integer id) {
		log.info("Inicio: obtenerPerro por id");
		
		Perro perro=perroService.obtenerPerro(id);
		
		return perro;
	}
	
	@GetMapping(value="/estado/{estado}") // busqueda en el navegador por id de perro
	public List<Perro> obtenerPerro(@PathVariable EstadoPerro estado) {
		log.info("[Inicio: obtenerPerro]");
		
		List<Perro> perro=perroService.filtroPorEstado(estado);
		
		return perro;
	}

}
