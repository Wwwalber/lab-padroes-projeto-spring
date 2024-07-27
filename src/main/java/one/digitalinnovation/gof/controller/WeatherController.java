package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import one.digitalinnovation.gof.model.WeatherResponse;
import one.digitalinnovation.gof.service.WeatherService;

@RestController
@RequestMapping("weather")
@Tag(name = "Weather API", description = "API to fetch weather information")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    @Operation(summary = "Get weather by city", description = "Fetches weather data for the specified city from OpenWeatherMap API")
    public WeatherResponse getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }
}
