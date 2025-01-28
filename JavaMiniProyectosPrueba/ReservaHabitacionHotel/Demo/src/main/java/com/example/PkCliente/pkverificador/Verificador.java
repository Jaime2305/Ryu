package com.example.PkCliente.pkverificador;

interface Verificacion {
    boolean esValido(String variable);

    boolean getValidacion();
}

public class Verificador {

    public static boolean setVerificar(String tipo, String dato){

        Verificacion verificacion;
        tipo.toLowerCase();
        
        if(tipo.equals("correo")){
            verificacion=new ValidarCorreo();
            verificacion.esValido(dato);
            return verificacion.getValidacion();
        }else{
            throw new IllegalArgumentException("Valor desconocido "+ dato);
        }

    }
   
}


class ValidarCorreo implements Verificacion{
    private recolectorDominios dominios = new recolectorDominios();
    private boolean validador=false;

    @Override
    public boolean esValido(String correo) {
        if (!correo.isEmpty()) {
            for (String dominio : dominios.getDominios()) {

                String regex = "^[a-zA-Z0-9._%+-]+@" + dominio.replace(".", "\\.") + "$";

                // Validar usando el patrón
                if (correo.matches(regex)) {
                    validador=true;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean getValidacion(){
        return validador;
    }

}



