package com.proyecto.spring.protectoracanina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.spring.protectoracanina.CausaHC;
import com.proyecto.spring.protectoracanina.entity.HistorialClinico;
import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.repository.HCRepository;
import com.proyecto.spring.protectoracanina.service.PerroService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/fichaperro")
public class FichaPerroController {
	@Autowired
	private PerroService perroService;
	@Autowired
	private HCRepository hcRepository;	
	
	@GetMapping("/{id}")  // ruta en el navegador para volver a ver el perro pasado por id
	public String fichaPerro(@PathVariable Integer id, Model model) {
		log.info("[fichaPerro]");
		log.debug("[id: {}]",id);
		
		Perro perro=perroService.obtenerPerro(id);
		
		List<HistorialClinico> listHC=hcRepository.findByPerro(perro);
		
		model.addAttribute("FichaPerro", perro);
		model.addAttribute("HC", listHC);
		model.addAttribute("causa", CausaHC.values());
		
		
		return "fichaperro";
	}
	
	@PostMapping("/{id}")
	public String guardarHC(@PathVariable Integer id, HistorialClinico hc) {
		log.info("[guardarHC]");
		
		hc.setId(0);
		Perro perro=perroService.obtenerPerro(id);
		hc.setPerro(perro);
		
		hcRepository.save(hc);
		log.debug("["+hc.toString()+"]" );
		
		return "redirect:/fichaperro/" + id;
	}
	
/*	@GetMapping("/{id}")
	@ModelAttribute("HC")
	public List<HistorialClinico> listadoHC(@PathVariable Integer id) {
		log.info("Inicio: fichaHistorialClinico");
		
		List<HistorialClinico> listHC=hcRepository.findByPerro(perroService.obtenerPerro(id));
		
		return listHC;
	} */
	
	
}
