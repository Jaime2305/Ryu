package com.example.pkReserva;

import com.example.PkCliente.Cliente;
import com.example.PkCliente.pkverificador.Verificador;

public class DatosCliente implements ItfDatos{
    private Cliente cliente;
    private String nombre,correo;
    private int numTel,dui;
  
public void setDatos(){
    System.out.println("Ingrese nombre: ");
    nombre="juan";

    System.out.println("Ingrese correo: ");
        do {
            correo="kdkd@gmail.com";
        }while (Verificador.setVerificar("correo", correo)==false);

    System.out.println("Ingrese telefono");
    numTel=34;

    System.out.println("Ingrese DUI: ");
    dui=554;

    cliente=new Cliente(nombre, correo, numTel, dui);    
}

public Cliente getDatos(){
    return cliente;
}


}
