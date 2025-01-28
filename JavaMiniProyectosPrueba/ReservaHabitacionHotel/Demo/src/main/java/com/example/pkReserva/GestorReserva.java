package com.example.pkReserva;

import java.util.HashMap;

import com.example.Bd.HabitacionesBd;

public class GestorReserva{
    private HashMap<Integer,Datos> detallesReserva =new HashMap<>();
    private Datos datos; //objeto que contendra todos los detalles de reservas individuales
    private CambiarCliente cambiarCliente;
    private HabitacionesBd habitacionesBd;
  
    public GestorReserva(){}

    public void crearReserva(int i){
        datos=new Datos();
        datos.Registro();
        detallesReserva.put(i, datos);
    }

    public HashMap<Integer,Datos> getReserva(){
        
        return detallesReserva;
    }

    public void ActualizarDatos(int i){
        detallesReserva.put(i, datos);
    }


    public void modificarReservaDatosCliente(int i){//posible meter switch
        detallesReserva.get(i);
        cambiarCliente=new CambiarCliente(detallesReserva.get(i).getDatosCliente());//carga los datos de cliente en CambiarCliente
      
        cambiarCliente.cambiarNombre("pablo");
    }

    
    public void modificarReservaHabitacion(int i){
        detallesReserva.get(i);
        
        habitacionesBd=new HabitacionesBd(detallesReserva.get(i).getDatosHabitacion());

        System.out.println("Cambio de habitacion: ");
        habitacionesBd.cambioDeHabitacion();
    }
        
}


