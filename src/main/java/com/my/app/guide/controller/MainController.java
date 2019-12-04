package com.my.app.guide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.my.app.guide.model.WeatherCard;
import com.my.app.guide.repository.WeatherForecastRepository;
import com.my.app.guide.repository.WeatherRepository;

import reactor.core.publisher.Mono;

@Controller
public class MainController {
	
	@Autowired
	WeatherRepository weatherRepository;
	@Autowired
	WeatherForecastRepository weatherForecastRepository;
	
	@RequestMapping("/")
	public String index(final Model model) {
		
		Mono<List<WeatherCard>> weatherCard = weatherRepository.findAll().
				flatMap(w -> weatherForecastRepository.findByCity(w.getName())
						.map(f -> new WeatherCard(w.getName(), w, f))
						)
				.collectList();

		IReactiveDataDriverContextVariable reactiveWeatherModel =
                new ReactiveDataDriverContextVariable(weatherCard, 1);
		
		
		model.addAttribute("weatherCard", reactiveWeatherModel);
		
		return "index";
	}
}
