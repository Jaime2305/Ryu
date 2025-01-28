package com.example;

import java.util.Scanner;

import com.example.pkReserva.GestorReserva;

public class menu {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
   
        GestorReserva reserva=new GestorReserva();
        boolean salir=false;
        String opcion;

    do {
        System.out.println("Seleccionar una opcion: ");
        System.out.println("1- Crear reserva ");
        System.out.println("2- Modificar reserva ");
        System.out.println("3- Mostrar reservas ");
        System.out.println("4- salir");
        
        opcion =entrada.nextLine();

        switch (opcion) {
            case "1":
            int numeroReserva=reserva.getReserva().size();
            reserva.crearReserva(numeroReserva);
                break;
        
            case "2":
            System.out.println("1- Modificar nombre cliente");
            System.out.println("2- Modificar habitacion cliente");
            opcion=entrada.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Inserte DUI");
                    int DUI=entrada.nextInt();

                    for(int ListaNumeros: reserva.getReserva().keySet()){
                        
                        int buscador=reserva.getReserva().get(ListaNumeros).getDatosCliente().getDUI();

                        if(DUI==buscador){

                         String nombreBuscado=reserva.getReserva().get(ListaNumeros).getDatosCliente().getNombre();
                         System.out.println(nombreBuscado);
                         reserva.modificarReservaDatosCliente(ListaNumeros);

                         String nuevoNombre=reserva.getReserva().get(ListaNumeros).getDatosCliente().getNombre();
                         System.out.println("Nombre: "+nombreBuscado+" cambio a "+ nuevoNombre);
                        }
                        
                    }
                  entrada.nextLine();
            
                    break;
            
                default:
                    entrada.nextLine();
                    break;
            }
            break;


            case "4":
            salir=true;
            break;
            default:
                break;
        }
    
    } while (salir!=true);

    }
}
