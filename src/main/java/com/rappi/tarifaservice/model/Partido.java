package com.rappi.tarifaservice.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString



public class Partido {
	@Id
	private Integer idPartido;
	private Date fecha;
	private String estado;
	private String estadio;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private String arbitro;
	private ArrayList<Tarifa> tarifa;
	
	
	

}
