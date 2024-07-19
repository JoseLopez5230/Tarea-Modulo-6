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
public class Doctor extends Persona {
    // Atributos adicionales específicos de Doctor
    private String especialidad;
    
    public Doctor(String nombre, int edad, String genero, String especialidad) {
        super(nombre, edad, genero);
        this.especialidad = especialidad;
    }
    
    // Método específico de Doctor para obtener su especialidad
    public String getEspecialidad() {
        return especialidad;
    }
    
    // Método específico de Doctor para establecer su especialidad
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
