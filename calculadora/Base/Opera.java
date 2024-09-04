package Base;


public class Opera {
    private Nums nums=new Nums();
    private int num1,num2,res;
    


    public void Suma(){     
    System.out.println("Ingrese el primer numero a sumar:");
    nums.pdirNum();
    num1=nums.darNum();
  
    System.out.println("Ingrese el segundo numero a sumar:");
    nums.pdirNum();
    num2=nums.darNum();

    res=num1+num2;
    
    System.out.println("El resultado es: "+res);
    }

    public void Resta(){     
        System.out.println("Ingrese el primer numero a restar:");
        nums.pdirNum();
        num1=nums.darNum();
      
        System.out.println("Ingrese el segundo numero a restar:");
        nums.pdirNum();
        num2=nums.darNum();
    
        res=num1-num2;
        
        System.out.println("El resultado es: "+res);
      
        }

    }

