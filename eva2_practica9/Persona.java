//package eva2_practica9;
public abstract class Persona {
    private String Nombre;
    private String Apellido;
    private String Edad;

    public Persona(String Nombre, String Apellido, String Edad){
        this.Nombre = "---";
        this.Apellido = "---";
        this.Edad = "-----";
    }
public String getNombre(){
    return Nombre;
}
public void setNombre(String Nombre){
    this.Nombre = Nombre;
}
public String getApellido(){
    return Apellido;
}
public void setApellido(String Apellido){
    this.Apellido = Apellido;
}
public String getEdad(){
    return Edad;
}
public void setEdad(String Edad){
    this.Edad =Edad;
}
public abstract void imprimirDatos();
    

}
