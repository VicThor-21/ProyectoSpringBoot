package com.proyecto.spring.protectoracanina.service;

import java.time.LocalDateTime;
import java.util.List;

import com.proyecto.spring.protectoracanina.CausaHC;
import com.proyecto.spring.protectoracanina.entity.HistorialClinico;
import com.proyecto.spring.protectoracanina.entity.Perro;

public interface HCService {
	
	public HistorialClinico insertarHC(CausaHC causa, String descripcion, LocalDateTime fecha, String veterinario, Perro perro);
	public List<HistorialClinico> listadoHC();
	public HistorialClinico obtenerHC(int id);

}
