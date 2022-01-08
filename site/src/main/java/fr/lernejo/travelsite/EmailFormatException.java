package fr.lernejo.travelsite;

import java.io.IOException;

public class EmailFormatException extends RuntimeException {
    public EmailFormatException(){
        super("Mauvais formattage de l'adresse mail");
    }

}
