package Base;
import java.util.Scanner;



public class Nums{
    
    private int num;
    private Scanner input= new Scanner(System.in);
    private String verificacion;
    private boolean sinerror,Anterior;

    public void pdirNum(){
        sinerror=false;
        
        while(sinerror==false){
        verificacion=input.nextLine();
        try{
            num=Integer.parseInt(verificacion);
            sinerror=true;
        
        }
        catch(NumberFormatException a){
            if (verificacion.equals("a")){
                Anterior=true;
                sinerror=true;
                System.out.print("...");
            }else{
            System.out.println("Ingrese un valor valido!");}
        }}}
     
   
    public int darNum(){
         return num;
        }

    public boolean Anterior(){
        return Anterior;
    }
    
       
    }
