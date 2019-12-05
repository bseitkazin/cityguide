package com.my.app.guide.repository;

import reactor.core.publisher.Flux;

public interface CityRepository {
	Flux<String> getAll();
	void addCity(String city);
}
