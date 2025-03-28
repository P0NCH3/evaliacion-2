public class Cleinte {
    private String Nombre;
    private String Apellido;
    private int edad;
    private Direccion direccion;// cliente has a (tiene una) direccion






    public Cleinte() {
        Nombre = "------";
        Apellido = "-------";
        this.edad = 0;
        this.direccion = new Direccion();
    }
    
    public Cleinte(String nombre, String apellido, int edad, String Calle, String Colonia, int numero_exterior, int numero_interior) {
        Nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion(Calle, Colonia, 0, 0);
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String toString(){
        return "Datos del Cliente: " + " \n" + 
        "Nombre: " + Nombre + "\n" + 
        "Apellido: " + Apellido + "\n"+ 
        "Edad: " + edad + "\n" + 
        "Calle: " + direccion.getCalle() + "\n" + 
        "Colonia: " + direccion.getColonia() + "\n" + 
        "Numero Exterior: " + direccion.getNumero_exterior() +"\n" +
        "Numero Interior: " + direccion.getNumero_interior() + "\n";

    }
    
    
}


