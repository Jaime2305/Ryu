package Base;


public class Opera extends Menu{
    private Nums mensajero = new Nums();
    private double num1, num2, res;
    private boolean ant;

    public void Suma() {
        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a sumar:");
        //iniciar metodo de Nums para verificar si es un numero o no
        mensajero.pdirNum();
        
        /*se guarda en una variable el valor obtenido en dado caso el
        usuario desea regresar al metodo anterior y se utiliza "if" para terminar este metodo
        sin ejecutar mucho codigo
        */
        ant=mensajero.anterior();
        
        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
            num1 = mensajero.darNum();
            System.out.println("Ingrese el segundo numero a sumar:");
             mensajero.pdirNum();

            //en dado caso el usuario quiera probar regresar por segunda vez
            //nada mas por precaucion

            ant=mensajero.anterior();

                if(ant==true){
                 System.out.println("regresando...");
                 ant=false;
                }else{
                num2 = mensajero.darNum();
                res = num1 + num2;
                System.out.println("El resultado es: "+Menu.VERDE+ res +Menu.RESET);
        }}}

        //el resto de codigo es un copia y pega con cambios en enunciados

    public void Resta() {
        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a restar:");
        mensajero.pdirNum();

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num1 = mensajero.darNum();
        System.out.println("Ingrese el segundo numero a restar:");
        mensajero.pdirNum();

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num2 = mensajero.darNum();
        res = num1 - num2;
        System.out.println("El resultado es: "+Menu.VERDE+ res+Menu.RESET);
        }}}

    public void Multiplicacion() {
        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a multiplicar:");
        mensajero.pdirNum();

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num1 = mensajero.darNum();
        System.out.println("Ingrese el segundo numero a multiplicar:");
        mensajero.pdirNum();

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num2 = mensajero.darNum();
        res = num1 * num2;
        System.out.println("El resultado es: "+Menu.VERDE+ res+Menu.RESET);
        }}}

    public void Division() {
        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a dividir:");
        mensajero.pdirNum();
     

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num1 = mensajero.darNum();
        System.out.println("Ingrese el segundo numero a dividir:");
        mensajero.pdirNum();
        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num2 = mensajero.darNum();
        
        //division por 0 no esta definida
        if(num2==0){
            System.out.println("Operacion indefinida");
            }else{
            res=num1/num2;
            System.out.println("El resultado es: "+Menu.VERDE+ res+Menu.RESET);
            }
        }}}

    public void Potencia() {
        double num1;
        double num2;
        double res;

        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a base:");
        mensajero.pdirNum();
        num1 = mensajero.darNum();

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
       
        System.out.println("Ingrese el segundo numero de exponente:");
        mensajero.pdirNum();
        }

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
            num2 = mensajero.darNum();

            /*dado que en matematica la potencia de 0^0 es indefinida
             *en este caso se mantendria por la siguiente demostracion
             0^0= 0^(1-1)= 0^1 * 0^-1 donde se sabe que 1/0 no esta definido,

             solamente en conjuntos vacios si se toma como 1
             */
            
            if(num1==0 &&  num2==0){
            System.out.println("Operacion indefinida");
            }else{
                if(num1<0 && num2%1!=0){
                    System.out.println(Menu.ROJO+"operacion no disponible"+Menu.RESET);
                }else{
                 res = Math.pow(num1, num2);
                 System.out.println("El resultado es: "+Menu.VERDE+ res+Menu.RESET);
                }
            }
        }    
    }

    public void Raiz() {

        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a base:");
        mensajero.pdirNum();
        num1 = mensajero.darNum();

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
       
        System.out.println("Ingrese el segundo numero de raiz:");
        mensajero.pdirNum();
        }

        ant=mensajero.anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
            num2 = mensajero.darNum();
            //verificaciones por numeros imaginarios, si se intenta sacar raiz de un negativo
            if(num2==0|| num1<0&&num2%2==0){
            System.out.println("Operacion indefinida");
            }else{
                if(num1<0){
                    System.out.println(Menu.ROJO+"Solucion definida"+"\nen el conjunto imaginario"+Menu.RESET);
                }else{
                res = Math.pow(num1, 1/num2);
                System.out.println("El resultado es: "+Menu.VERDE+ res+Menu.RESET);
                }
            }
        }    
    }
    

}
