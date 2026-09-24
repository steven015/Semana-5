package com.uped.proyecto.modelo;

public class Estudiante extends Persona {
    private String carnet;
    private String carrera;

    public Estudiante(String nombre, String dui, String carnet, String carrera){
        super(nombre, dui);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    //Este es el método matricular de la clase Estudiante
    public void matricular(String materia){
        System.out.println(carnet + " Matriculo: " + materia);
    }

    @Override
    public String toString(){
        return presentarse() + " | " + carrera + " (" + carnet + ")";
    }
}
