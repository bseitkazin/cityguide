package com.my.app.guide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.my.app.guide.api.client.WeatherClient;
import com.my.app.guide.model.WeatherCard;
import com.my.app.guide.repository.CityRepository;
import com.my.app.guide.repository.WeatherRepository;

import reactor.core.publisher.Flux;

@Controller
public class MainController {
	
	@Autowired
	WeatherRepository weatherRepository;
	@Autowired
	CityRepository cityRepository;
	@Autowired
	WeatherClient weatherClient;
	
	@RequestMapping("/")
	public String index(final Model model) {
		
		Flux<WeatherCard> cards = Flux.just("Almaty", "Dubai")
				.flatMap(f -> weatherClient.getWeather(f));
		
		IReactiveDataDriverContextVariable reactiveWeatherModel =
                new ReactiveDataDriverContextVariable(cards, 1); 
		
		model.addAttribute("weathers", reactiveWeatherModel);		
		
		return "index";
	}
}
