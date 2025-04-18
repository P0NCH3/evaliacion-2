//package eva2_practica5;

public class Empleado extends Persona{
    private int clave; 
    
public Empleado(){
    super();
    this.clave = 0;
}
public Empleado(String nombre, String apellidos, int edad, int clave){
    super(nombre, apellidos, edad);
    this.clave = clave;
}

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public void imprimirDatos(){
        System.out.println("DATOS DEL EMPLEADO: ");
        System.out.println("Clave: " + clave);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + super.edad);
    }

}

