package fr.lernejo.travelsite;

public record Travel(String country, double temperature) {
    public Travel(String country, double temperature){
        this.country = country;
        this.temperature = temperature;
    }
}
