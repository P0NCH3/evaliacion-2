public class Empleado extends Persona{
    private int claveEmpleado;

    public Empleado() {
        super();
        this.claveEmpleado = 0;
    }

    public Empleado(String nombre, String Apellido, int edad,int claveEmpleado) {
        super(nombre, Apellido, edad);
        this.claveEmpleado = claveEmpleado;
    }
    
    

    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(int claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Clave: " + claveEmpleado);
    }
    
    
}
