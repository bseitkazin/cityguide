package com.my.app.guide.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.my.app.guide.model.weather.WeatherDTO;

import reactor.core.publisher.Flux;

@Repository
public class ReactiveWeatherRepository implements WeatherRepository{

	private List<WeatherDTO> weathers = new ArrayList<>();
	
	@Override
	public Flux<WeatherDTO> findAll() {
		return Flux.fromIterable(weathers);
	}

	@Override
	public void add(WeatherDTO weather) {
		this.weathers.add(weather);
	}

}
