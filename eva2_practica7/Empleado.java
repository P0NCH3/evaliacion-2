//package eva2_practica7;

public class Empleado{
    private String Nombre;
    private String Apellido;
    protected double Salario;

public Empleado(String Nombre, String Apellido, double Salario){
    this.Nombre = Nombre;
    this.Apellido = Apellido;
    this.Salario = Salario;
}
public Empleado(){
    this.Nombre = "Max";
    this.Apellido = "Saucedo";
    this.Salario = 0.0;
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
public double getSalario(){
    return Salario;
}
public void setSalario(double Salario){
    this.Salario = Salario;
}
protected double calcularSalario(){
    return Salario;
}
@Override
public String toString(){
    String cade = "Nombre: " + Nombre + "\n" + 
            "Apellidos: " + Apellido + "\n" + 
            "Salario (sin calculo): " + Salario;
    return cade;
}

}
