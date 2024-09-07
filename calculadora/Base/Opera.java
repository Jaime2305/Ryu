package Base;


public class Opera{
    private Nums mensajero = new Nums();
    private int num1, num2, res;
    private boolean ant;

    public void Suma() {
        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a sumar:");
        mensajero.pdirNum();
        
        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num1 = mensajero.darNum();
        System.out.println("Ingrese el segundo numero a sumar:");
        mensajero.pdirNum();

        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num2 = mensajero.darNum();
        res = num1 + num2;
        System.out.println("El resultado es: " + res);
        }}}

    public void Resta() {
        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a restar:");
        mensajero.pdirNum();

        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num1 = mensajero.darNum();
        System.out.println("Ingrese el segundo numero a restar:");
        mensajero.pdirNum();

        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num2 = mensajero.darNum();
        res = num1 - num2;
        System.out.println("El resultado es: " + res);
        }}}

    public void Multiplicacion() {
        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a multiplicar:");
        mensajero.pdirNum();

        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num1 = mensajero.darNum();
        System.out.println("Ingrese el segundo numero a multiplicar:");
        mensajero.pdirNum();

        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num2 = mensajero.darNum();
        res = num1 * num2;
        System.out.println("El resultado es: " + res);
        }}}

    public void Division() {
        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a dividir:");
        mensajero.pdirNum();
     

        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num1 = mensajero.darNum();
        System.out.println("Ingrese el segundo numero a dividir:");
        mensajero.pdirNum();
        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
        num2 = mensajero.darNum();
        try{
            res = num1/num2;
            System.out.println("El resultado es: " + res);
        }catch(ArithmeticException e){System.out.println("No se puede dividir por 0");
    }}}}

    public void Potencia() {
        double num1;
        double num2;
        double res;

        System.out.println("##Si desea regresar insertar 'a'##");
        System.out.println("Ingrese el primer numero a base:");
        mensajero.pdirNum();
        num1 = mensajero.darNum();

        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
       
        System.out.println("Ingrese el segundo numero de exponente:");
        mensajero.pdirNum();
        }

        ant=mensajero.Anterior();

        if(ant==true){
            System.out.println("regresando...");
            ant=false;
        }else{
            num2 = mensajero.darNum();
            if(num1==0 &&  num2==0){
            System.out.println("Operacion indefinida");
            }else{
            res = Math.pow(num1, num2);
            System.out.println("El resultado es: " + res);
            }
        }    
    }

}
