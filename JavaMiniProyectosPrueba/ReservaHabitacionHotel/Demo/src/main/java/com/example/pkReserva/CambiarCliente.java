package com.example.pkReserva;

import com.example.PkCliente.Cliente;

public class CambiarCliente {
     private Cliente cliente;

      public CambiarCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void cambiarNombre(String nuevoNombre) {
        cliente.setNombre(nuevoNombre);
    }

    public void cambiarCorreo(String nuevoCorreo) {
        cliente.setCorreoElectronico(nuevoCorreo);
    }

    public String obtenerNombre() {
        return cliente.getNombre();
    }

    public String obtenerCorreo() {
        return cliente.getCorreoElectronico();
    }

    public int obtenerDUI() {
        return cliente.getDUI();
    }

    public int obtenerTelefono() {
        return cliente.getNumTel();
    }
}
