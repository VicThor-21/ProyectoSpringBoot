package com.proyecto.spring.protectoracanina.service;

import java.util.Date;
import java.util.List;

import com.proyecto.spring.protectoracanina.entity.HistorialClinico;
import com.proyecto.spring.protectoracanina.entity.Perro;

public interface HCService {
	
	public HistorialClinico insertarHC(int causa, String descripcion, Date fecha, String veterinario, Perro perro);
	public List<HistorialClinico> listadoHC();
	public HistorialClinico obtenerHC(int id);

}
