/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.ejercicio1parcial3;

/**
 *
 */
public class Estudiante extends Persona {
     private double calificacion;
    private boolean hizoNovillos;

    public Estudiante(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
        this.hizoNovillos = false;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean hizoNovillos() {
        return hizoNovillos;
    }

    public void hacerNovillos() {
        this.hizoNovillos = true;
    }
}
