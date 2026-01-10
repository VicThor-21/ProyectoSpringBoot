/*** package com.proyecto.spring.protectoracanina;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.proyecto.spring.protectoracanina.entity.Adopcion;
import com.proyecto.spring.protectoracanina.entity.Adoptante;
import com.proyecto.spring.protectoracanina.entity.HistorialClinico;
import com.proyecto.spring.protectoracanina.entity.Perro;
import com.proyecto.spring.protectoracanina.repository.AdopcionRepo;
import com.proyecto.spring.protectoracanina.repository.AdoptanteRepo;
import com.proyecto.spring.protectoracanina.repository.HCRepo;
import com.proyecto.spring.protectoracanina.repository.PerroRepo;

import jakarta.transaction.Transactional;

@Component
public class DataInitializer implements CommandLineRunner{
	
	private final PerroRepo perroRepo;
    private final AdoptanteRepo adoptanteRepo;
    private final AdopcionRepo adopcionRepo;
    private final HCRepo hcRepo;

    public DataInitializer(
            PerroRepo perroRepo,
            AdoptanteRepo adoptanteRepo,
            AdopcionRepo adopcionRepo,
            HCRepo hcRepo) {

        this.perroRepo = perroRepo;
        this.adoptanteRepo = adoptanteRepo;
        this.adopcionRepo = adopcionRepo;
        this.hcRepo = hcRepo;
    }

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		if (perroRepo.count() > 0) {
            return; // Ya hay datos
        }

        // =========================
        // 1️⃣ PERROS (20)
        // =========================
        List<Perro> listaPerros = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            Perro p = new Perro();
            p.setNombre("Perro" + i);
            p.setEdad(1 + (i % 10));
            p.setRaza("Raza" + (i % 5));
            p.setSexo(i % 2 == 0);
            p.setEstado(1);
            p.setPeso(10 + i);
            p.setFechaIngreso(Date.valueOf("2024-01-01"));            
                            
            listaPerros.add(perroRepo.save(p));
        }

        // =========================
        // 2️⃣ ADOPTANTES (10)
        // =========================
        List<Adoptante> listaAdoptantes = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Adoptante a = new Adoptante();
            a.setNombre("Nombre" + i);
            a.setApellidos("Apellido" + i);
            a.setDni("0000000" + i + "A");
            a.setTelefono("60000000" + i);
            a.setEmail("email" + i + "@mail.com");
            
            listaAdoptantes.add(adoptanteRepo.save(a));
        }

        // =========================
        // 3️⃣ ADOPCIONES (6)
        // =========================
        for (int i = 0; i < 6; i++) {
            Adopcion ad = new Adopcion();
            ad.setFechaAdopcion(Date.valueOf("2024-02-0" + (i + 1)));
            ad.setEstado(1);
            ad.setDonacion(false);
            ad.setPerro(listaPerros.get(i));
            ad.setAdoptante(listaAdoptantes.get(i % listaAdoptantes.size()));
            
            adopcionRepo.save(ad);
        }

        // =========================
        // 4️⃣ HISTORIAL CLÍNICO (30)
        // =========================
        for (int i = 1; i <= 30; i++) {
            HistorialClinico hc = new HistorialClinico();
            hc.setCausa(i + i);
            hc.setDescripcion("Descripción clínica " + i);
            hc.setFecha(Date.valueOf("2024-03-01"));
            hc.setVeterinario("Veterinario " + (i % 5));
            hc.setPerro(listaPerros.get(i % listaPerros.size()));

            hcRepo.save(hc);
        }
		
	}
	
} ***/
