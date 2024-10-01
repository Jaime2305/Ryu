package Extra;

import java.util.ArrayList;

public class Binario {
 
    ///////colores para textos//////////////////////////////////////////////
    public static final String ROJO = "\033[31m"; // Rojo
    public static final String VERDE = "\033[32m"; // Verde
    public static final String AZUL = "\033[34m"; // Azul
    public static final String RESET = "\033[0m";  // blanco
    ////////////////////////////////////////////////////////////////////////

    private ArrayList<Integer> lis=new ArrayList<>();
    private int promedio,i=0,f,b;  //promedio de las posiciones, i de inicio, f de final , b de buscado

    public void Bbinaria(int buscar, ArrayList<Integer> en_arreglo){
        this.b=buscar;
        this.lis=en_arreglo;
        
        f=lis.size();//tamano lista

        double itiempo=System.currentTimeMillis();//medidor tiempo
        
        try{
        do {
            
            promedio=(int)((i+f)/2); //quita la parte decimal, ejemplo 5.5 = 5, redondea al mas abajo por decirlo

            if (lis.get(promedio) == b) {
                System.out.println("Se encontro: " + b + " en la posicion " + promedio);
                i = f+1; //para salir del bucle
            } else {
                if (b < lis.get(promedio)) {
                    f = promedio-1; //se resta 1 porque es el valor en el que acaba de hacer la primera comparacion y se moveria a la izquierda
                } else {
                    if (b > lis.get(promedio)) {
                        i = promedio+1;// se mueve a la derecha
                    }
                }
            }
        } while (i<=f);

        if (i>f && lis.get(promedio)!=b) //comparando si el ultimo valor encontrado no es igual al buscado.
        {
            System.out.println(ROJO+"!!Valor no encontrado!!"+RESET);
        }
    }catch(IndexOutOfBoundsException e){
        System.out.println(ROJO+"Valor mayor al tamano lista"+RESET);
    }

    double ftiempo=System.currentTimeMillis();
    double tiempo=((ftiempo-itiempo)/1000);
   
    System.out.println("tiempo ejecucion: "+VERDE+tiempo+RESET+" milisegundos");
    }
}
