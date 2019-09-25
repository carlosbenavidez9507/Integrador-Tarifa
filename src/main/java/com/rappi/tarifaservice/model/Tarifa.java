package com.rappi.tarifaservice.model;

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

@Document(collection="Tarifa")
public class Tarifa {
	
	@Id
	private String id;
	private float tarifa_actual;
	private String idTipoApuesta;
	private String idPartido;
	private String estadoTarifa;	
	private TipoApuesta tipo;
	private Partido partido;
	private String tarifa;
	
	
	

}
