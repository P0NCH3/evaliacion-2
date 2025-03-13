//package eva2_practica5;
public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;

public Persona(){
    this.nombre = "-Sin nombre-";
    this.apellidos = "-Sin ape-";
    this.edad = 0;
}    
public Persona(String nombre, String apellidos, int edad){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}