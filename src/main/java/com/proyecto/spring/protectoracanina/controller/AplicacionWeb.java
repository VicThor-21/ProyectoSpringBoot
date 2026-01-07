package com.proyecto.spring.protectoracanina.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AplicacionWeb {
	
	@RequestMapping("/")
	String home() {
		return "<h1>Hola mundo</h1> <p>del JPA</p>";
	}

}
