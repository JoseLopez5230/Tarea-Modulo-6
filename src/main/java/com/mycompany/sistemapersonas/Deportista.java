/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapersonas;

import Helpers.Persona;

/**
 *
 * @author PC
 */
public class Deportista extends Persona {
    // Atributos adicionales específicos de Deportista
    private String deporte;
    
    public Deportista(String nombre, int edad, String genero, String deporte) {
        super(nombre, edad, genero); 
        this.deporte = deporte;
    }
    
    // Método específico de Deportista para obtener su deporte
    public String getDeporte() {
        return deporte;
    }
    
    // Método específico de Deportista para establecer su deporte
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
