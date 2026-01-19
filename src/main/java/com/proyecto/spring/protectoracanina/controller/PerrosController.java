package com.proyecto.spring.protectoracanina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.spring.protectoracanina.EstadoPerro;
import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.service.PerroService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/perros") 
public class PerrosController {
	
	@Autowired
	private PerroService perroService;
	
	@GetMapping 
	public String listadoPerros(@RequestParam(required=false) String nombre, 
								@RequestParam(required=false) EstadoPerro estado, Model model){
		
		log.info("[listadoPerros]");
		
		List<Perro> perros=perroService.obtenerPerro(nombre, estado);
		
		model.addAttribute("Perros", perros);
		model.addAttribute("estados", EstadoPerro.values());
		
		return "/perros";
	} 

}
