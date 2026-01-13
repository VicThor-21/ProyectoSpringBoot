package com.proyecto.spring.protectoracanina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.service.PerroService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PerrosController {
	@Autowired
	private PerroService perroService;
	
	@GetMapping("/perros")  // ruta en el navegador para volver a ver el listado de perros
	@ModelAttribute("Perros")
	public List<Perro> listadoPerros(){
		
		log.info("Inicio: listadoPerros");
		
		List<Perro> perros=perroService.listadoPerros();
		
		return perros;
	}
	

}
