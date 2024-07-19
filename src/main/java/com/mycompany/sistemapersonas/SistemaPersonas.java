/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemapersonas;

import Helpers.Persona;

/**
 *
 * @author PC
 */
public class SistemaPersonas {

// EjemploUso.java (Clase principal para probar el funcionamiento)
//public class SistemaPersona {
    public static void main(String[] args) {
        // Creación de instancias de Doctor y Deportista
        Doctor doctor1 = new Doctor("Dr. Jose Lopez", 21, "Masculino", "Cardiologia");
        Deportista deportista1 = new Deportista("Astrid Lohany", 25, "Femenino", "Natacion");
        
        // Obtener información usando métodos de la superclase
        System.out.println("Informacion del Doctor:");
        System.out.println("Nombre: " + doctor1.getNombre());
        System.out.println("Edad: " + doctor1.getEdad());
        System.out.println("Genero: " + doctor1.getGenero());
        System.out.println("Especialidad: " + doctor1.getEspecialidad());
        
        System.out.println("\nInformacion del Deportista:");
        System.out.println("Nombre: " + deportista1.getNombre());
        System.out.println("Edad: " + deportista1.getEdad());
        System.out.println("Genero: " + deportista1.getGenero());
        System.out.println("Deporte: " + deportista1.getDeporte());
        
        // Ejemplo de polimorfismo
        Persona personaDeportista = new Deportista("Andy Rodriguez", 30, "Masculino", "Fútbol");
        System.out.println("\nPolimorfismo - Informacion del Deportista (a traves de Persona):");
        System.out.println("Nombre: " + personaDeportista.getNombre());
        System.out.println("Edad: " + personaDeportista.getEdad());
        System.out.println("Genero: " + personaDeportista.getGenero());
   
   }
}

