package com.rappi.tarifaservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rappi.tarifaservice.model.Partido;
import com.rappi.tarifaservice.model.Tarifa;
import com.rappi.tarifaservice.repository.TarifaRepository;

@RestController
@RequestMapping("/")

public class TarifaController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	 @Autowired
	 private TarifaRepository repository;
	 
	 
	
	@GetMapping(value = "/tarifa")
	public Iterable<Tarifa> all (){
	   return repository.findAll();
		
	}
	
	
	 @GetMapping(value = "/tarifa/{tarifaId}")
		public Tarifa findByApostadortId (@PathVariable String tarifaId){
		 Tarifa tarifa=repository.findTarifaById(tarifaId);
		 //Partido partido=restTemplate.getForObject("http://partido-service/partido/{idPartido}",Partido.class,tarifa.getIdPartido());
	     //tarifa.setPartido(partido);
		 return tarifa;
		}
	
	
	 @PostMapping(value = "/tarifa")
		public Tarifa save (@RequestBody Tarifa tarifa){
			
		 
		 return repository.save(tarifa);
		}
	 
	 @PutMapping(value = "/tarifa")
		public Tarifa update (@RequestBody Tarifa tarifa){
			return repository.save(tarifa);
			
		    
		}
	
	 @DeleteMapping(value = "/tarifa")
		public void delete (@RequestBody Tarifa tarifa){
			repository.delete(tarifa);
			
		}
	 
	
	

}
