package com.my.app.guide.api.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.my.app.guide.model.WeatherCard;
import com.my.app.guide.model.weather.WeatherDTO;
import com.my.app.guide.model.wthrfrcst.WeatherForecastDTO;

import reactor.core.publisher.Mono;

@Service
public class WeatherClient {
	
	private static final String WEATHER_API_URI = "http://api.openweathermap.org/data/2.5";
	
	@Value("${weatherSecretApiKey}")
	private String weather_secret_api_key;
	
	WebClient weatherClient = WebClient.create(WEATHER_API_URI);
	
	private Mono<WeatherDTO> getWeatherByCityName(String cityName) {
		return weatherClient.get()
				.uri(builder -> builder.path("/weather")
						.queryParam("q", cityName)
						.queryParam("units", "metric")
						.queryParam("appid", weather_secret_api_key)
						.build())
				.accept(MediaType.APPLICATION_JSON)
				.exchange()
				.flatMap(r -> r.bodyToMono(WeatherDTO.class));
	}
	
	private Mono<WeatherForecastDTO> getWeatherForecast(String cityName) {
		return weatherClient.get()
				.uri(builder -> builder.path("/forecast")
						.queryParam("q", cityName)
						.queryParam("units", "metric")
						.queryParam("appid", weather_secret_api_key)
						.build())
				.accept(MediaType.APPLICATION_JSON)
				.exchange()
				.flatMap(r -> r.bodyToMono(WeatherForecastDTO.class));
	}
	
	public Mono<WeatherCard> getWeather(String cityName) {
		return getWeatherByCityName(cityName)
				.zipWith(
						getWeatherForecast(cityName), 
						(a, b) -> new WeatherCard(cityName, a, b)
						);
	}
}
