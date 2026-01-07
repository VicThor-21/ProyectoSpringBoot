package com.proyecto.spring.protectoracanina.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="HISTORIAL_CLINICO")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class HistorialClinico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hc_id")
	private int id;
	@Column(name="causa")
	private int causa;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="veterinario")
	private String veterinario;
	
	@ManyToOne
	@JoinColumn(name="perro_id")
	private Perro perro;
	
}
