package com.my.app.guide.repository;

import com.my.app.guide.model.wthrfrcst.WeatherForecastDTO;

import reactor.core.publisher.Mono;

public interface WeatherForecastRepository {
	Mono<WeatherForecastDTO> findByCity(String cityName);
	void add(String city, WeatherForecastDTO weatherForecast);
}
