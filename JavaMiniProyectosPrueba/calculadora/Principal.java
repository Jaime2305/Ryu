import Base.Menu;
public class Principal {
    public static void main(String[] args) {

        Menu mostrar=new Menu();
        boolean exit=false;

        /*estructura para que Menu.java se ejecute siempre y no haya problemas con el metodo
        de 'anterior()', ya que si no se usa esta manera se ejecutaria un metodo dentro de otro
        infinitamente, con esto se logra terminar cada metodo y volver a iniciarlo
        */

        do{
            mostrar.menu();
            
            /*al obtener el valor 'true' insertado en el input de Menu se obtiene ese valor
            para guardar en 'exit' y salir del bucle
            */
            exit=mostrar.getCaso();

        }while (!exit);

        
      
    }
}
