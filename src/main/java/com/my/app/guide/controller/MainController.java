package com.my.app.guide.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.my.app.guide.api.client.WeatherClient;
import com.my.app.guide.model.WeatherCard;
import com.my.app.guide.model.weather.WeatherDTO;
import com.my.app.guide.model.wthrfrcst.WeatherForecastDTO;
import com.my.app.guide.repository.CityRepository;
import com.my.app.guide.repository.WeatherForecastRepository;
import com.my.app.guide.repository.WeatherRepository;

import reactor.core.publisher.Mono;

@Controller
public class MainController {
	
	@Autowired
	WeatherRepository weatherRepository;
	@Autowired
	WeatherForecastRepository weatherForecastRepository;
	@Autowired
	CityRepository cityRepository;
	@Autowired
	WeatherClient weatherClient;
	
	@RequestMapping("/")
	public String index(final Model model) {
		
		Map<String, WeatherDTO> weatherMap = new HashMap<>();
		
		cityRepository
		.getAll()
		.flatMap(x -> weatherClient.getWeatherByCityName(x)
				.map(f -> weatherMap.put(x, f))
				)
		;
		
		Map<String, WeatherForecastDTO> forecastMap = cityRepository.getAll()
				.collectMap(
						item -> {return item;},
						item -> {return weatherClient.getWeatherForecast(item).block();})
				.block();
		
		
//		Mono<List<WeatherCard>> weatherCard = weatherRepository.findAll().
//				flatMap(w -> weatherForecastRepository.findByCity(w.getName())
//						.map(f -> new WeatherCard(w.getName(), w, f))
//						)
//				.collectList();

		IReactiveDataDriverContextVariable reactiveWeatherModel =
                new ReactiveDataDriverContextVariable(weatherMap, 1);
		IReactiveDataDriverContextVariable reactiveForecastModel =
                new ReactiveDataDriverContextVariable(forecastMap, 1);
		
		
		model.addAttribute("weatherModel", reactiveWeatherModel);
		model.addAttribute("forecastModel", reactiveForecastModel);
		
		return "index";
	}
}
