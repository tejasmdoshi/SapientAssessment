package com.sapient.assessment.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.assessment.model.WeatherSummary;
import com.sapient.assessment.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@RequestMapping("/{city}")
	public WeatherSummary getWeather(@PathVariable String city) {
		
		WeatherSummary weatherSummary = weatherService.getWeatherSummary(city);
		
		return weatherSummary;
	}
}
