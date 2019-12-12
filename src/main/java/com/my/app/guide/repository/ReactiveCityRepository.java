package com.my.app.guide.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

@Repository
public class ReactiveCityRepository implements CityRepository{

	private List<String> cities = new ArrayList<>();
	
	@Override
	public Flux<String> getAll() {
		return Flux.fromIterable(cities);
	}
	
	@Override
	public void addCity(String city) {
		this.cities.add(city);
	}

}
