package com.hackerrank.weather.controller;

import com.hackerrank.weather.repository.WeatherRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherApiRestController {
    private WeatherRepository weatherRepository;
    @DeleteMapping("/erase")
    public String deleteWeatherdata(@PathVariable long id) {

        weatherRepository.deleteById(id);
        return "Deleted ";
    }

}
