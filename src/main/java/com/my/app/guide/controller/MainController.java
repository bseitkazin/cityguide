package com.my.app.guide.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.my.app.guide.model.WeatherCard;
import com.my.app.guide.model.weather.WeatherDTO;
import com.my.app.guide.repository.WeatherForecastRepository;
import com.my.app.guide.repository.WeatherRepository;

import reactor.core.publisher.Flux;

@Controller
public class MainController {
	
	@Autowired
	WeatherRepository weatherRepository;
	@Autowired
	WeatherForecastRepository weatherForecastRepository;
	
	@RequestMapping("/")
	public String index(final Model model) {
		
		List<WeatherCard> weatherCard = new ArrayList<>();
		
		Flux<WeatherDTO> weathers = weatherRepository.findAll();

		IReactiveDataDriverContextVariable reactiveWeatherModel =
                new ReactiveDataDriverContextVariable(weatherRepository.findAll(), 1);
		
		
		model.addAttribute("weathers", reactiveWeatherModel);
		
		return "index";
	}
}
