package com.example.PkCliente;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre,correoElectronico;
    private int numTel,dui;

    public Cliente(String nombre, String correoElectronico, int numTel, int dui){
        this.nombre=nombre;
        this.correoElectronico=correoElectronico;
        this.numTel=numTel;
        this.dui=dui;
    }

    public String setNombre(String nombre){
        this.nombre=nombre;
        return nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String setCorreoElectronico(String correo){
        this.correoElectronico=correo;
        return correo;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }

    public int getNumTel(){
        return numTel;
    }

    public int getDUI(){
        return dui;
    }

}


class ListaCliente{
    private List<Cliente> ListadoCliente = new ArrayList<>(); // Lista para almacenar los clientes

    public void setListaCliente(Cliente cliente){
        ListadoCliente.add(cliente);
    }

    public List<Cliente> getListaCliente(){
        return ListadoCliente;
    }

    @Override
    public String toString() {
        if (ListadoCliente.isEmpty()) {
            return "No hay clientes registrados.";
        }

        StringBuilder resultado = new StringBuilder("=== Lista de Clientes ===\n");
        for (int i = 0; i < ListadoCliente.size(); i++) {
            resultado.append((i + 1))
                     .append(". ")
                     .append(ListadoCliente.get(i).toString())
                     .append("\n");
        }
        return resultado.toString();
    }

}



