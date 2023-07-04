package com.appdeveloperblog.web.animalapp.model;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class AnimalRest {

    private String Codigo;
    private String Especie;
    private String Genero;
    private int Patas;

    public AnimalRest(String codigo, String especie, String genero, int patas) {
        Codigo = codigo;
        Especie = especie;
        Genero = genero;
        Patas = patas;
    }

    public AnimalRest() {

    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
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

    @Override
    public String toString() {
        return "AnimalRest{" +
                "Codigo=" + Codigo +
                ", Especie='" + Especie + '\'' +
                ", Genero='" + Genero + '\'' +
                ", Patas=" + Patas +
                '}';
    }
}
