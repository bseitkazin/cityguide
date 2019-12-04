package com.my.app.guide.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.app.guide.api.client.WeatherClient;
import com.my.app.guide.model.weather.WeatherDTO;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class WeatherController {
	
	@Autowired
	private WeatherClient weatherClient;
	
	@GetMapping("/weather/{city-name}")
	private Mono<WeatherDTO> getWeatherByCityName(@PathVariable(name = "city-name") String cityName) {
		return weatherClient.getWeatherByCityName(cityName);
	}
}
