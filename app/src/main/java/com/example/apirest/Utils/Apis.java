package com.example.apirest.Utils;

public class Apis {

    public static final String URL_001="https://app-backend-d1iw.onrender.com/personas/";

    public static PersonaService getPersonaService(){
        return  Cliente.getClient(URL_001).create(PersonaService.class);
    }
}
