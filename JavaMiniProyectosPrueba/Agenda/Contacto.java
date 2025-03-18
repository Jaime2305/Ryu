package interfaz;

public class Contacto {
    private String nombre,correo;
    private int edad;

    public Contacto(){}

    public Contacto(String nombre, String correo, int edad){
        this.nombre=nombre;
        this.correo=correo;
        this.edad=edad;
    }

    public String setNombre(String nombre){
        this.nombre=nombre;
        return nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String setCorreo(String correo){
        this.correo=correo;
        return correo;
    }

    public String getCorreo(){
        return correo;
    }

    public int setEdad(int edad){
        this.edad=edad;
        return edad;
    }

    public int getEdad(){
        return edad;
    }


    @Override
    public String toString() {
        return "nombre: "+nombre+"\n   correo: "+correo+"\n   Edad: "+edad;
    }
}
