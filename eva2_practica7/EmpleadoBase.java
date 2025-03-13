//package eva2_practica7;

public class EmpleadoBase extends Empleado{
    private int numeroEmpleado;
    private double bono;

public EmpleadoBase(){
    super();
    this.numeroEmpleado = 0;
    this.bono = 0.0;
}
public EmpleadoBase(String Nombre, String Apellido, double Salario, int numeroEmpleado, double bono){
    this.numeroEmpleado = 10294747;
    this.bono = 100;
}
public double calcularSalario(){
    return super.calcularSalario() * (1 + bono) ;
}
public String toString(){
    String cade = super.toString();
    cade = cade + "Numero de empleado: " + numeroEmpleado + "\n" +
     "Bono: " + bono + "\n" +
     "Salario Total: " + calcularSalario();
    return cade;
}

}