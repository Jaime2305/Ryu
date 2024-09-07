package Base;
import java.util.Scanner;

public class Menu {
    public Scanner input=new Scanner(System.in);
    public String caso;

    public void menu(){

        Opera mostrar=new Opera();
      
        System.out.println("Escriba el numero de la operacion que desea realizar:");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicacion");
        System.out.println("4- Division");
        System.out.println("5- Exponencial");
        System.out.println("6- Cerrar");
        
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
            System.out.println("Saliendo...");
            break;

            default:
            System.out.println("##Opcion no disponible o error en digitacion###");
            break;
        }
    }

    //usado para obtener el ultimo valor insertado, el cual seria '6'
    public String getCaso(){
        return caso;
    }
}
