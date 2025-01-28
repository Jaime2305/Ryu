package com.example.Bd;

import com.example.Habitaciones.Habitacion;

public class Tiempo {
    private Habitacion habitacion;
    private String fecha;
    private int numPersonas;

    public Tiempo() {

    }

    public Tiempo(Habitacion habitacion, String fecha, int numPersonas) {
        this.habitacion = habitacion;
        this.fecha = fecha;
        this.numPersonas = numPersonas;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

  
}
    

