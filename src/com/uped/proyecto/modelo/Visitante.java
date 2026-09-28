package com.uped.proyecto.modelo;

public class Visitante extends Persona {

    public Visitante(String nombre, String dui){
        super(nombre, dui); //Invoca Persona(String)
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Visitante{"+ presentarse() + "}";
    }
    public double calcularBeneficioAnual(){
        return 8.9;
    }
}
