package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import one.digitalinnovation.gof.model.WeatherResponse;

@FeignClient(name = "openweathermap", url = "http://api.openweathermap.org/data/2.5")
public interface OpenWeatherMapService {

    @GetMapping("/weather")
    WeatherResponse getWeatherByCity(@RequestParam("q") String city, @RequestParam("appid") String apiKey);
}
