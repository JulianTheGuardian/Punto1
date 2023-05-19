/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.ejercicio1parcial3;

/**
 *
 */
public class Ejercicio1Parcial3 {

    public static void main(String[] args) {
       Profesor profesor = new Profesor("Juan", 35, "Masculino", "Matemáticas");

        Estudiante estudiante1 = new Estudiante("María", 18, "Femenino");
        Estudiante estudiante2 = new Estudiante("Pedro", 19, "Masculino");
        Estudiante estudiante3 = new Estudiante("Laura", 20, "Femenino"); 
        estudiante1.hacerNovillos();
        estudiante1.setCalificacion(8.5);
        estudiante2.setCalificacion(6.2);
        estudiante3.setCalificacion(4.9);

        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3};
        Aula aula = new Aula(1, 30, "Matemáticas", profesor, estudiantes);

        aula.mostrarInformacionAula();
    }
}
