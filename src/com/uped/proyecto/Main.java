package com.uped.proyecto;


import com.uped.proyecto.modelo.*;

public class Main{
    public static void main(String[] args){
        //Instancia la clase Cliente en Main
        Cliente cliente = new Cliente("Steven Díaz", "06030968-4","7724-1255",9.1 );
        System.out.println(cliente.presentarse());
        //Instancia la clase Visitante en la clase Main
        Visitante v = new Visitante("Kevin", "68754739-0");
        System.out.println(v);
        //Instancia de la clase Empleado en la clase Main
        Empleado empleado = new Empleado("Carlos Serrano", "06030968-4", 850.3);
        System.out.println(empleado.presentarse());
        //Utilizamos el método actualizarNombre para ponerlo en practica
        empleado.actualizarNombre("Pedro de la Mar");
        System.out.println(empleado.presentarse());

        Persona[] personas = {
                new Cliente("Ana García", "08060578-4", "77665544", 4000.0),
                new Empleado("Luis Perez", "877574-5", 850.0),
                new Estudiante("Steven", "07080969-5", "UPED-254", "Ing. Sistemas", 9.1),
        };

        for(Persona p : personas){
            System.out.println(p.presentarse() + " -> $" + p.calcularBeneficioAnual());
        }

        Estudiante e = new Estudiante(
                "Carlos Ramírez", "07080969-4",
                "UPED-2026-045", "Ing. en Sistemas", 9.1
        );
        System.out.println(e);
        e.matricular("Programación III");
    }
}