/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.ejercicio1parcial3;
import java.util.Random;
/**
 *
 */
public class Aula {
    private int identificador;
    private int capacidadMaxima;
    private String materiaDestinada;
    private Profesor profesor;
    private Estudiante[] estudiantes;

    public Aula(int identificador, int capacidadMaxima, String materiaDestinada, Profesor profesor, Estudiante[] estudiantes) {
        this.identificador = identificador;
        this.capacidadMaxima = capacidadMaxima;
        this.materiaDestinada = materiaDestinada;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public void mostrarInformacionAula() {
        System.out.println("Aula:");
        System.out.println("Identificador: " + identificador);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Materia destinada: " + materiaDestinada);
        System.out.println();

        System.out.println("Profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("Sexo: " + profesor.getSexo());
        System.out.println("Materia: " + profesor.getMateria());
        System.out.println();

        System.out.println("Estudiantes:");
        int presentes = 0;
        int aprobadosMasculinos = 0;
        int aprobadosFemeninos = 0;

        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Sexo: " + estudiante.getSexo());
            System.out.println("Calificación: " + estudiante.getCalificacion());
            System.out.println("Hizo novillos: " + (estudiante.hizoNovillos() ? "Sí" : "No"));
            System.out.println();

            if (!estudiante.hizoNovillos()) {
                presentes++;

                if (estudiante.getCalificacion() >= 5.0) {
                    if (estudiante.getSexo().equalsIgnoreCase("masculino")) {
                        aprobadosMasculinos++;
                    } else if (estudiante.getSexo().equalsIgnoreCase("femenino")) {
                        aprobadosFemeninos++;
                    }
                }
            }
        }

        System.out.println("Estudiantes presentes: " + presentes);
        System.out.println("Aprobados (Masculinos): " + aprobadosMasculinos);
        System.out.println("Aprobados (Femeninos): " + aprobadosFemeninos);
        System.out.println();

        if (profesorDisponible() && profesorMateriaCorrecta() && alumnosPresentesSuficientes()) {
            System.out.println("¡Se puede dar clase en el aula!");
        } else {
            System.out.println("No se puede dar clase en el aula.");
        }
    }

    private boolean profesorDisponible() {
        double probabilidadNoDisponible = 0.2; // 20% de probabilidad de no estar disponible
        Random random = new Random();
        return random.nextDouble() > probabilidadNoDisponible;
    }

    private boolean profesorMateriaCorrecta() {
        return profesor.getMateria().equalsIgnoreCase(materiaDestinada);
    }

    private boolean alumnosPresentesSuficientes() {
        int cantidadEstudiantes = estudiantes.length;
           int cantidadPresentes = 0;
        for (Estudiante estudiante : estudiantes) {
            if (!estudiante.hizoNovillos()) {
                cantidadPresentes++;
            }
        }

        double porcentajePresentes = (double) cantidadPresentes / estudiantes.length;
        return porcentajePresentes > 0.5;
    }
}
