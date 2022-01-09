package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TemperaturePredictionController {
    private final TemperatureService tempService = new TemperatureService();

    @GetMapping("/api/temperature")
    @ResponseBody
    public TemperaturePredictionModel grabTemperature(@RequestParam String country){
        List<TemperatureModel> temperaturesList = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            LocalDate choosenDate = LocalDate.now().minusDays(i);
            temperaturesList.add(new TemperatureModel(choosenDate, tempService.getTemperature(country)));
        }

        return new TemperaturePredictionModel(country,temperaturesList);
    }
}
