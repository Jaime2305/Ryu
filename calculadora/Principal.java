import Base.Menu;
public class Principal {
    public static void main(String[] args) {

        Menu mostrar=new Menu();
        String n;

        /*estructura para que Menu.java se ejecute siempre y no haya problemas con el metodo
        de 'anterior()', ya que si no se usa esta manera se ejecutaria un metodo dentro de otro
        infinitamente, con esto se logra terminar cada metodo y volver a iniciarlo
        */

        do{
            mostrar.menu();
            
            /*al obtener el valor '6' insertado en el input de Menu se obtiene ese valor
            para guardar en 'n' y salir del bucle, se asigna 'cerrar' solo para evitar confusion
            y seguir el ritmo del proceso
            */

            n=mostrar.getCaso();
        switch (n) {
            case "6":
           System.out.println("##Programa cerrado##");
           n="cerrar";
            break;

            default:
            break;
        }}while (!n.equals("cerrar"));

        
      
    }
}
