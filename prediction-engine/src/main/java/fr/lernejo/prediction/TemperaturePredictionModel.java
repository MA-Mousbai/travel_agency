package fr.lernejo.prediction;

import java.util.List;

public record TemperaturePredictionModel(String country, List<TemperatureModel> temperatures) {
    public TemperaturePredictionModel(String country, List<TemperatureModel> temperatures){
        this.country = country;
        this.temperatures = temperatures;
    }
}
