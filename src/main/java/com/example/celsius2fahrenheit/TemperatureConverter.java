package com.example.celsius2fahrenheit;

public class TemperatureConverter {
    public Double cel2far(Double celsius) {
    	return (celsius * 9 / 5.0) + 32;
    }

    public Double far2cel(Double Fahrenheit) {
    	return (Fahrenheit - 32) * (5 / 9.0);
    }
}