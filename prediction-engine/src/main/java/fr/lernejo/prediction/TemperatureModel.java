package fr.lernejo.prediction;

import java.time.LocalDate;

public record TemperatureModel(LocalDate date, double temperature) {
    public TemperatureModel(LocalDate date, double temperature){
        this.date = date;
        this.temperature = temperature;
    }
}
