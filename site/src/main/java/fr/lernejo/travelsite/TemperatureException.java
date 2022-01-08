package fr.lernejo.travelsite;

public class TemperatureException extends RuntimeException{
    public TemperatureException(){
        super("Bornes de temperature dépassés");
    }
}
