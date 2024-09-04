import Base.Opera;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Opera mostrar=new Opera();
        Scanner input=new Scanner(System.in);
        String caso;
        

      do {
        System.out.println("Escriba que operacion desea realizar:");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicacion");
        System.out.println("4- Division");
        System.out.println("4- Exponencial");
        System.out.println("5- Cerrar");

        caso=input.nextLine();
        
        switch (caso) {
            case "Suma":
            mostrar.Suma();
            break;

            case "Resta":
            mostrar.Resta();
            break;

            case "Multiplicacion":
            mostrar.Multiplicacion();
            break;

            case "Cerrar":
            System.out.println("##Programa finalizado##");
                break;

            default:
            System.out.println("##Opcion no disponible o error en digitacion###");
                
        

        }}while (!caso.equalsIgnoreCase("Cerrar"));
        input.close();
    
        
      
    }
}
