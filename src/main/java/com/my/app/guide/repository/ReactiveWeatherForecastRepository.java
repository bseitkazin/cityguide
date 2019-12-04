package com.my.app.guide.repository;

import java.util.HashMap;
import java.util.Map;

import com.my.app.guide.model.wthrfrcst.WeatherForecastDTO;

import reactor.core.publisher.Mono;

public class ReactiveWeatherForecastRepository implements WeatherForecastRepository{

	private Map<String, WeatherForecastDTO> weatherForecasts = new HashMap<>();
	
	public Mono<WeatherForecastDTO> findByCity(String cityName) {
		return Mono.just(weatherForecasts.get(cityName));
	}

	@Override
	public void add(String city, WeatherForecastDTO weatherForecast) {
		this.weatherForecasts.put(city, weatherForecast);
	}

}
