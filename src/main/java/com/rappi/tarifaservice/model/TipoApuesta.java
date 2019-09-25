package com.rappi.tarifaservice.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

@Document(collection="TipoApuesta")
public class TipoApuesta {
	@Id
	private Integer idTipo_Apuesta;
	private String descripcionApuesta;
	private String categoria;
	private ArrayList<Tarifa> tarifa;
	
	

}
