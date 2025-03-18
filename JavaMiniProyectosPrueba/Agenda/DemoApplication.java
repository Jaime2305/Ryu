package interfaz;

import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
   
        boolean salir=false;
        String opcion;

    do {
        
        System.out.println("Seleccionar una opcion: ");
        System.out.println("1- Agregar contacto ");
        System.out.println("2- Mostrar todo");
        System.out.println("3- Buscar Contacto");
        System.out.println("4- Borrar Contacto");
        System.out.println("5- salir");
        
        opcion=entrada.nextLine();
        
        
        switch (opcion) {
            case "1":
			System.out.println("Ingrese nombre");
			String nombre=entrada.nextLine();

			System.out.println("Ingrese correo");
			String correo=entrada.nextLine();

			System.out.println("Ingrese edad");
			int edad=entrada.nextInt();
            entrada.nextLine(); //consume salto de linea por nextInt \n

			Agenda.getInstancia().AgregarContacto(nombre, correo, edad);

            break;
 
			case "2":
			Agenda.getInstancia().MostrarTodo();
			break;

			case "3":
			System.out.println("Ingrese nombre a buscar");
			String buscar=entrada.nextLine();
			Agenda.getInstancia().BuscarContacto(buscar);
			break;

            case "4":
            System.out.println("Ingrese numero a borrar");
            int borrar=entrada.nextInt();
            entrada.nextLine(); //consume salto de linea por nextInt \n
            Agenda.getInstancia().BorrarContacto(borrar);
            break;


            case "5":
            salir=true;
            entrada.close();
            break;
            default:
            break;
        }
    
    } while (salir!=true);


	}

}
