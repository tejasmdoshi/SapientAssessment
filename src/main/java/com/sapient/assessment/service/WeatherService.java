package com.sapient.assessment.service;

import java.util.function.DoubleToLongFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.assessment.model.Weather;
import com.sapient.assessment.model.WeatherData;
import com.sapient.assessment.model.WeatherInfo;
import com.sapient.assessment.model.WeatherSummary;

@Service
public class WeatherService {

	@Autowired
	private RestTemplate restTemplate;

	public WeatherSummary getWeatherSummary(String city) {
		WeatherSummary weatherSummary = new WeatherSummary();

		Weather weather = restTemplate.getForObject(
				"https://samples.openweathermap.org/data/2.5/forecast?q="+city+",us&appid=d2929e9483efc82c82c32ee7e02d5\n"
						+ "63e",
				Weather.class);

		double maxTemp = 0, minTemp = Double.MAX_VALUE;

		for (WeatherInfo weatherInfo : weather.getList()) {

			if (weatherInfo.getMain().getTemp_max() > maxTemp) {
				maxTemp = weatherInfo.getMain().getTemp_max();
			}

			if (weatherInfo.getMain().getTemp_min() < minTemp) {
				minTemp = weatherInfo.getMain().getTemp_min();
			}

			if (weatherInfo.getMain().getTemp() > 40) {
				weatherSummary.addSuggestion("Use sunscreen lotion");
			}

			for (WeatherData weatherData : weatherInfo.getWeather()) {

				if (weatherData.getMain().equals("Rain")) {
					weatherSummary.addSuggestion("Carry umbrella");

				}
			}
		}

		weatherSummary.setHigh(maxTemp);
		weatherSummary.setLow(minTemp);

		return weatherSummary;
	}
}
