package one.digitalinnovation.gof.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import one.digitalinnovation.gof.model.WeatherResponse;

@Service
public class WeatherService {

    @Autowired
    private OpenWeatherMapService openWeatherMapService;

    @Value("${openweathermap.apikey}")
    private String apiKey;

    public WeatherResponse getWeather(String city) {
        return openWeatherMapService.getWeatherByCity(city, apiKey);
    }
}
