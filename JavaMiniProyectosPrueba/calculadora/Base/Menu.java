package Base;
import java.util.Scanner;


public class Menu {
    
    private Scanner input=new Scanner(System.in);
    private boolean salir;
    private String caso;
    //se usa final para no poder cambiar el color en cualquier lugar del codigo
    
    public static final String ROJO = "\033[31m"; // Rojo
    public static final String VERDE = "\033[32m"; // Verde
    public static final String AZUL = "\033[34m"; // Azul
    public static final String RESET = "\033[0m";  // blanco
 

    public void menu(){

        Opera mostrar=new Opera();
      
        System.out.println("Escriba el numero de la operacion que desea realizar:");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicacion");
        System.out.println("4- Division");
        System.out.println("5- Exponencial");
        System.out.println("6- Raiz");
        System.out.println("7- Cerrar");
        
        //input o entrada para elegir el metodo que se desea ejecutar
        caso=input.nextLine();
     

        switch (caso) {
            case "1":
            mostrar.Suma();
            break;

            case "2":
            mostrar.Resta();
            break;

            case "3":
            mostrar.Multiplicacion();
            break;

            case "4":
            mostrar.Division();
            break;

            case "5":
            mostrar.Potencia();
            break;

            case "6":
            mostrar.Raiz();
            break;

            case "7":
            System.out.println(VERDE+"Saliendo..."+RESET);
            salir=true;
            break;

            default:
            System.out.println("##"+ROJO+"Opcion no disponible"+RESET+" o error en digitacion###");
            break;
        }
    }

    //usado para obtener el ultimo valor insertado 
    public boolean getCaso(){
        return salir;
    }
}
