package com.appdeveloperblog.web.animalapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="animals")
public class AnimalEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String Codigo;

    @Column(nullable=false, length = 50)
    private String Especie;

    @Column(nullable=false, length = 5)
    private String Genero;

    @Column(nullable=true)
    private int Patas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
