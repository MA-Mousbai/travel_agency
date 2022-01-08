package fr.lernejo.travelsite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public record User(String userEmail, String userName, String userCountry, WeatherEnum weatherExpectation,
                   int minimumTemperatureDistance) {

    public User(String userEmail, String userName, String userCountry, WeatherEnum weatherExpectation, int minimumTemperatureDistance) {
        final String EMAIL_REGEX = "^(.+)@(\\S+)$";
        final Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Matcher emailMatcher = emailPattern.matcher(userEmail);
        if (!emailMatcher.matches()) throw new EmailFormatException();
        else
            this.userEmail = userEmail;

        this.userName = userName;
        this.userCountry = userCountry;
        this.weatherExpectation = weatherExpectation;

        if (minimumTemperatureDistance <= 0 || minimumTemperatureDistance > 40) throw new TemperatureException();
        else this.minimumTemperatureDistance = minimumTemperatureDistance;
    }

}

