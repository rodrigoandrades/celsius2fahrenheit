package com.example.celsius2fahrenheit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureRestController {
	@Autowired
	private TemperatureConverter converter;
	
	@GetMapping("/api/cel2fah")
	private Double cel2fah(@RequestParam Double celsius){
		return converter.cel2far(celsius);
	}
}