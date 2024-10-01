package Extra;

import java.util.Random;

public class Generador {
    private int a,num;
    private Random obj=new Random();
    
    public void Aleatorio(int tamano){
        this.a=tamano;
        num=obj.nextInt(a);
    }

    public int NumAl(){
        return num;
    }
}
