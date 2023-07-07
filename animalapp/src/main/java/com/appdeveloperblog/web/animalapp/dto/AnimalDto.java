package com.appdeveloperblog.web.animalapp.dto;

public class AnimalDto {

    private String Codigo;
    private String Especie;
    private String Genero;
    private int Patas;

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
}
