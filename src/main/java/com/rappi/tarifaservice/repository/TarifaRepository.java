package com.rappi.tarifaservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.rappi.tarifaservice.model.Tarifa;

public interface TarifaRepository extends MongoRepository<Tarifa,String>  {

	Tarifa findTarifaById(String TarifaId);
	
}
