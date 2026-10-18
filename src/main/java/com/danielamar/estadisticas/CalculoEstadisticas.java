
package com.danielamar.estadisticas;

import java.util.ArrayList;


public class CalculoEstadisticas {
    //Guardar la lista de alumnos
    private ArrayList<Alumno>listaAlumnos;
//constructor
    public CalculoEstadisticas(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    //Metodos 
    //% aprobados
    public double getPorcentajeAprobados(){
        int total = listaAlumnos.size();
        int contador = 0;
        for(Alumno a: listaAlumnos){
            if (a.getCalificacion()>=6)
            {
                contador ++;
        }
    }
        return (contador * 100.0)/total;
    }
    //%reprobados
    public double getPorcentajeReprobados(){
        return 100.0 - getPorcentajeAprobados();
    }
    //Mejor calificación
    public int getMejorCalificacion(){
        int mayor = 0;
        for (Alumno a: listaAlumnos ){
            if (a.getCalificacion()>mayor){
                mayor=a.getCalificacion();
            }
        }
        return mayor;
    }
    //Peor calificación
    public int getPeorCalificacion(){
        int menor = 10;
        for (Alumno a: listaAlumnos){
            if (a.getCalificacion()<menor){
                menor=a.getCalificacion();
            }
        }
        return menor;
    }
    //Promedio
    public double getPromedio(){
        int suma=0;
        for (Alumno a: listaAlumnos){
            suma += a.getCalificacion();
        }
        return (suma*1.0)/listaAlumnos.size();
    }
            
}
    