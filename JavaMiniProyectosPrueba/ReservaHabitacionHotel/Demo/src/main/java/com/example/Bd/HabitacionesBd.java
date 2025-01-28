package com.example.Bd;

import com.example.Habitaciones.ReservaHabitacion;
import com.example.Habitaciones.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HabitacionesBd {

    private static List<Habitacion> habitacionesEstandar = new ArrayList<>();
    private static List<Habitacion> habitcionesDeluxe = new ArrayList<>();
    private static List<Habitacion> suites = new ArrayList<>();

    private ReservaHabitacion reservaHabitacion;
    
    private Habitacion nuevaHabitacion;


    private static HabitacionesBd instance;

    public HabitacionesBd(ReservaHabitacion reservaHabitacion){
        this.reservaHabitacion=reservaHabitacion;
    }


    public HabitacionesBd() {
        if (habitacionesEstandar.isEmpty()&&habitcionesDeluxe.isEmpty()&&suites.isEmpty()) {
        for(int i =1; i <= 10; i++){
            habitacionesEstandar.add(new HabitacionEstandar(i,false));
        }

        for(int i=11; i<=15; i++){
            habitcionesDeluxe.add(new HabitacioDeluxe(i,false));
        }

        suites.add(new Suite(16,false));
        suites.add(new Suite(17,false));
    }
}

    public List<Habitacion> getHabitacionesEstandar() {
        return habitacionesEstandar;
    }

    public List<Habitacion> getHabitcionesDeluxe() {
        return habitcionesDeluxe;
    }

    public List<Habitacion> getSuites() {
        return suites;
    }

    public static HabitacionesBd getInstance() {

        if (instance == null){
            instance = new HabitacionesBd();
        }
        return instance;
    }

    public ReservaHabitacion eleccionDeHabitacion(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el tipo de habitacion: ");
        System.out.println("1 - Estandar");
        System.out.println("2 - Deluxe");
        System.out.println("3 - Suite");

        int SelecciondeTipo = scanner.nextInt();
        int habitacionSeleccionada;
        Habitacion habitacion =null;

        switch (SelecciondeTipo){

            case 1:
                System.out.println("Habitaciones Estandar Disponibles");
                mostrarHabitaciones(getHabitacionesEstandar());
                System.out.print("seleccione el numero de habitacion: ");
                habitacionSeleccionada = scanner.nextInt();
                habitacion = obtenerHabitacion(this.getHabitacionesEstandar(),habitacionSeleccionada);

                break;
            case 2:
                System.out.println("Habitaciones Deluxe Disponibles");
                mostrarHabitaciones(getHabitcionesDeluxe());
                System.out.print("seleccione el numero de habitacion: ");
                habitacionSeleccionada = scanner.nextInt();
                habitacion = obtenerHabitacion(this.getHabitcionesDeluxe(),habitacionSeleccionada);
                break;
            case 3:
                System.out.println("Suites Disponibles");
                mostrarHabitaciones(getSuites());
                System.out.print("seleccione el numero de habitacion: ");
                habitacionSeleccionada = scanner.nextInt();
              obtenerHabitacion(this.getSuites(),habitacionSeleccionada);
                break;
            default:
                System.out.println("Elija una opcion Valida");
        }
        
    reservaHabitacion=new ReservaHabitacion(habitacion,"2",3);
    return reservaHabitacion;
    }

    public ReservaHabitacion getReservaHabitacion(){
        return reservaHabitacion;
    }


    public Habitacion obtenerHabitacion(List<Habitacion> habitaciones,int habitacion){

        for(Habitacion ha: habitaciones){
            if(ha.getNumero() == habitacion &&  !ha.getOcupada()){
                ha.setOcupada(true);
                return ha;
            }
        }
        return null;
    }

    public void mostrarHabitaciones(List<Habitacion> habitaciones){
        int i= 0;
        for (Habitacion habitacionesBd : habitaciones) {
            if (!habitacionesBd.getOcupada()) {
                i++;
                System.out.println(i +"- Habitacion" + habitacionesBd.getNumero());

            }
        }


    }

    public void cambioDeHabitacion(){
        HabitacionesBd BD = HabitacionesBd.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el tipo de habitacion: ");
        System.out.println("1 - Estandar");
        System.out.println("2 - Deluxe");
        System.out.println("3 - Suite");

        int CambiodeHabitacion = scanner.nextInt();

        switch (CambiodeHabitacion){

            case 1:
                System.out.println("Habitaciones Disponibles");
                mostrarHabitaciones(getHabitacionesEstandar());
                System.out.print("seleccione el numero de habitacion: ");
                CambiodeHabitacion = scanner.nextInt();
                nuevaHabitacion=obtenerHabitacion(getHabitacionesEstandar(), CambiodeHabitacion);
                BD.getHabitacionesEstandar().get(CambiodeHabitacion-1).setOcupada(true);

                break;
            case 2:
                System.out.println("Habitaciones Disponibles");
                mostrarHabitaciones(getHabitcionesDeluxe());
                System.out.print("seleccione el numero de habitacion: ");
                CambiodeHabitacion = scanner.nextInt();
                nuevaHabitacion=obtenerHabitacion(getHabitcionesDeluxe(), CambiodeHabitacion);
                BD.getHabitcionesDeluxe().get(CambiodeHabitacion-1).setOcupada(true);
                break;
            case 3:
                System.out.println("Habitaciones Disponibles");
                mostrarHabitaciones(getSuites());
                System.out.print("seleccione el numero de habitacion: ");
                CambiodeHabitacion = scanner.nextInt();
                nuevaHabitacion=obtenerHabitacion(getSuites(), CambiodeHabitacion);
                BD.getSuites().get(CambiodeHabitacion-1).setOcupada(true);
                break;


        }

    
    reservaHabitacion.setHabitacion(nuevaHabitacion);
    //reservaHabitacion=new ReservaHabitacion(nuevaHabitacion, null, CambiodeHabitacion);
    getReservaHabitacion();
    getReservaHabitacion().getHabitacion();
    }

   

}



