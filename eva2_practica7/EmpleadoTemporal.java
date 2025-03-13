//package eva2_practica7;


public class EmpleadoTemporal extends Empleado {
    private String numeroContrato;
    private double Horas;


public EmpleadoTemporal(){
    super();
    this.numeroContrato = "------";
    this.Horas = 0.0;
}
public EmpleadoTemporal(String Nombre, String Apellido, double Salario, String numeroContrato, double Horas){
    super(Nombre, Apellido, Salario);
    this.numeroContrato = numeroContrato;
    this.Horas = Horas;
}
public String getNumeroContrato(){
    return numeroContrato;
}
public void setNumeroContraro(String numeroContrato){
    this.numeroContrato = numeroContrato;
}
public double getHoras(){
    return Horas;
}
public void setHoras(double Horas){
    this.Horas = Horas;
}
@Override
public double calcularSalario(){
    return super.getSalario() * Horas;
}

@Override
public String toString(){
    String cade = super.toString() + "\n";
    cade = cade + "Contrato: " + numeroContrato + "\n" +
            "Horas: " + Horas + "\n" +
            "Salario real: " + calcularSalario();
    return cade; 
}
}
