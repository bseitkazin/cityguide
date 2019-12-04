package com.my.app.guide.repository;

import com.my.app.guide.model.weather.WeatherDTO;

import reactor.core.publisher.Flux;

public interface WeatherRepository {
	Flux<WeatherDTO> findAll();
	void add(WeatherDTO weather);
}
