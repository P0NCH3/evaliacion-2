//package eva2_practica9;
public class Empleado extends Persona {
    private double Salario;

 
    public Empleado() {
        super(Nombre, Apellido, Edad);
        this.Salario = 0.0;
    }
    public Empleado(String Nombre, String Apellido, String Edad, double salario) {
        super(Nombre, Apellido, Edad);
        Salario = salario;
    }
public double getSalario() {
    return Salario;
}
public void setSalario(double Salario) {
    this.Salario = Salario;
}


@Override
        public void imprimirDatos(){
        System.out.println("Empleado");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());

}
}