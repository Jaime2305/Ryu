package Base;
import java.util.Scanner;



public class Nums{
    
    private int num;
    private Scanner input= new Scanner(System.in);
    private String verificacion;
    private boolean sinerror,anterior;

    public void pdirNum(){
        //se inicializa siempre en false porque al terminar un ciclo queda guardado en true
        //y por algun error que suceda olvidando eso se deja asi por comodidad
        sinerror=false;
        
        while(sinerror==false){
            /*guarda el valor en verifiacion de texto para luego
            pasarlo a entero y en dado caso sea texto obtener un error
            */
        verificacion=input.nextLine();
        try{
            num=Integer.parseInt(verificacion);
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
            System.out.println("Ingrese un valor valido!");}
        }}}
     
   //obtenemos el ultimo valor guardado en num para enviarlo o obtenerlo desde Opera
    public int darNum(){
         return num;
        }

    //lo mismo que darNum
    public boolean anterior(){
        return anterior;
    }
    
       
    }
