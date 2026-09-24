package com.uped.proyecto;


import com.uped.proyecto.modelo.Cliente;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Persona;
import com.uped.proyecto.modelo.Visitante;

public class Main{
    public static void main(String[] args){
        //Instancia la clase Cliente en Main
        Cliente cliente = new Cliente("Steven Díaz", "06030968-4","7724-1255" );
        System.out.println(cliente.presentarse());
        //Instancia la clase Visitante en la clase Main
        Visitante v = new Visitante("Kevin");
        System.out.println(v);
        //Instancia de la clase Empleado en la clase Main
        Empleado empleado = new Empleado("Carlos Serrano", "06030968-4", 850.3);
        System.out.println(empleado.presentarse());
        //Utilizamos el método actualizarNombre para ponerlo en practica
        empleado.actualizarNombre("Pedro de la Mar");
        System.out.println(empleado.presentarse());

        Persona[] personas = {
                new Cliente("Ana García", "08060578-4", "77665544"),
                new Empleado("Luis Perez", "877574-5", 567.8),
        };

        for(Persona p : personas){
            System.out.println(p.presentarse());
        }
    }
}