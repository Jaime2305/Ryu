import Base.Menu;
public class Principal {
    public static void main(String[] args) {
        Menu mostrar=new Menu();
        String n;
        
        mostrar.menu();
        n=mostrar.getCaso();

        do{
        switch (n) {
            case "6":
           System.out.println("Saliendo...");
           n="cerrar";
            break;

            default:
            break;
        }}while (!n.equals("cerrar"));
      
    ///comentario
        
      
    }
}
