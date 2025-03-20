

public class Empleado extends Persona implements MostrarDatos{
 private String clave;


 public Empleado(){
    super();
    this.clave = "----";
}
public Empleado(String clave){
    super(Nombre, Apellidos);
    this.clave = clave;
}
public String getClave() {
    return clave;
}

public void setClave(String clave) {
    this.clave = clave;
}
    public void imprimirDatos(){
        System.out.println("Nombre:"  + getNombre()Nombre);
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Clave: " + clave);
    }
}
