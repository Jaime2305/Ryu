package com.example.Habitaciones;

public abstract class Habitacion {

    private int numero;
    private Boolean ocupada= false;
    private Double precioPorNoche;
    private String tipo;

    public Habitacion(int numero, Boolean ocupada, Double precioPorNoche, String tipo) {
        this.numero = numero;
        this.ocupada = ocupada;
        this.precioPorNoche = precioPorNoche;
        this.tipo = tipo;
    }

    public Boolean getOcupada() {
        return ocupada;
    }

    public Double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void mostrarInformacion(){

        System.out.println("Habitacion "+ numero +"("+tipo+")");
        System.out.println("Diponibilidad: "+ocupada);
        System.out.println("Precio por noche: "+precioPorNoche);
    }

}


