package interfaz;

import java.util.HashMap;
import java.util.Map;

public class Agenda{
    
    private Contacto contacto;
    private Map<Integer,Contacto> agenda= new HashMap<>();
    private int contador=0;

    private boolean valido=false;

    private static Agenda instancia;

    private Agenda() {}

    public static Agenda getInstancia() {
        if (instancia == null) {
            instancia = new Agenda();
        }
        return instancia;
    }

   
    public void AgregarContacto(String nombre,String correo,int edad){

        valido=CorreoVerificador.getInstancia().getVerificacion("correo",correo);

        if (valido==true) {
            contacto=new Contacto(nombre, correo, edad);
            agenda.put(contador++,contacto);
        }
    
    }


    public void BuscarContacto(String nombreBuscar){
        for (Contacto listaContacto : agenda.values()) {
            
         if(listaContacto.getNombre().contains(nombreBuscar)){
            System.out.println(listaContacto.toString());
         };
        }

        
    
    }

    public Map<Integer,Contacto> getContacto(){
        return agenda;
    }

    public void MostrarTodo(){
        int i=0;
        for (Object listaContacto : agenda.values()) {
            i++;
            System.out.println(i+"- "+listaContacto+"\n ___________");
        }
    
    }


    public void BorrarContacto(int numero){
        if(agenda.containsKey(numero) && agenda.size()>0){
            agenda.remove(numero-1);
        }else{
            System.out.println("Lista vacia o numero no valido");
        }
    }

    @Override
    public String toString() {
        return ""+agenda.values();
    }
}

