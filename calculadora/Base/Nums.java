package Base;
import java.util.Scanner;


//se hereda Menu para usar los colores
public class Nums{
    
    private double num;
    private Scanner input= new Scanner(System.in);
    private String verificacion;
    private boolean sinerror,anterior;

    public void pdirNum(){
        //se inicializa siempre en false porque al terminar un ciclo queda guardado en true
        
        sinerror=false;
        
        while(sinerror==false){
            /*guarda el valor en verifiacion de texto para luego
            pasarlo a entero y en dado caso sea texto obtener un error
            */
        verificacion=input.nextLine();
        try{
            num=Double.parseDouble(verificacion);
            //si elige salirse no se ejecutara lo que sigue del codigo y saltara al error
            sinerror=true;
        
        }
        catch(NumberFormatException a){
            //si el usuario elige salir entonces terminamos el proceso
            if (verificacion.equals("a")){
                anterior=true;
                sinerror=true;
                System.out.print("...");
            //sino se volvera a ejecutar el mismo metodo pedirnumero hasta que sea numero o quiera salir
            }else{
            System.out.println(Menu.ROJO+"Ingrese un valor valido!"+Menu.RESET);}
        }}}
     
   //obtenemos el ultimo valor guardado en num para enviarlo o obtenerlo desde Opera
    public double darNum(){
         return num;
        }

    //lo mismo que darNum
    public boolean anterior(){
        return anterior;
    }
    
       
    }
