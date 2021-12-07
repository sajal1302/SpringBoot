package com.sajal.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.sajal.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{
	
	

}
