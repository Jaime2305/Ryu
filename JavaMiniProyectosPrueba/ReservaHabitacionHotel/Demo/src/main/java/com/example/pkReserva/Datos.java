package com.example.pkReserva;

import com.example.PkCliente.*;
import com.example.Habitaciones.*;

interface ItfDatos {
    void setDatos();
    }

//clase con datos empaquetados en uno solo para el hashmap
public class Datos {
    private DatosCliente datosCliente;
    private DatosHabitacion datosHabitacion;
 
    public void Registro(){
        datosCliente=new DatosCliente();
        datosCliente.setDatos();

        datosHabitacion=new DatosHabitacion();
        datosHabitacion.setDatos();
        
    }

    public Cliente getDatosCliente(){
        return datosCliente.getDatos();
    }

    public ReservaHabitacion getDatosHabitacion(){
        return datosHabitacion.getDatos();
    }


    @Override
public String toString() {
    return "Nombre: " + datosCliente.getDatos().getNombre() +
           ", Correo: " + datosCliente.getDatos().getCorreoElectronico()+
           ", Teléfono: " + datosCliente.getDatos().getNumTel() +
           ", DUI: " + datosCliente.getDatos().getDUI();
         // "\nTipo habitacion: "+datosHabitacion.getDatos().getHabitacion().getTipo()+
         // "\nPrecio: "+ datosHabitacion.getDatos().getHabitacion().getPrecioPorNoche();
}

}



/* 
class DatosPagos implements ItfDatos{

}
*/



