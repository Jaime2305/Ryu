package com.example.pkReserva;

import com.example.Bd.HabitacionesBd;
import com.example.Habitaciones.Habitacion;
import com.example.Habitaciones.ReservaHabitacion;

public class DatosHabitacion implements ItfDatos{

    ReservaHabitacion reservaHabitacion;
    Habitacion habitacion;
    HabitacionesBd habitacionesBd;
    

    @Override
    public void setDatos() {
        habitacionesBd=new HabitacionesBd();
        habitacionesBd.eleccionDeHabitacion();
    }


    public ReservaHabitacion getDatos(){
        return habitacionesBd.getReservaHabitacion();
    }
    
}
