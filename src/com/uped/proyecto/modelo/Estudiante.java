package com.uped.proyecto.modelo;

public class Estudiante extends Persona {
    private String carnet;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String dui, String carnet, String carrera, double promedio){
        super(nombre, dui);
        this.carnet = carnet;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    //Este es el método matricular de la clase Estudiante
    public void matricular(String materia){
        System.out.println(carnet + " Matriculo: " + materia);
    }

    @Override
    public String toString(){
        return presentarse() + " | " + carrera + " (" + carnet + ")";
    }
    public double calcularBeneficioAnual(){
        return promedio >= 8 ? 500.0 : 0.0; //Beca
    }
}
