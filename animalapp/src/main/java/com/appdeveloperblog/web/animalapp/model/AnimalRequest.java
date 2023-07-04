package com.appdeveloperblog.web.animalapp.model;

public class AnimalRequest {

    private String Especie;
    private String Genero;
    private int Patas;

    public AnimalRequest(String especie, String genero, int patas) {
        Especie = especie;
        Genero = genero;
        Patas = patas;
    }

    public AnimalRequest() {

    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getPatas() {
        return Patas;
    }

    public void setPatas(int patas) {
        Patas = patas;
    }

}
