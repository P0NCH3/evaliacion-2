//package eva2_practica7;


public class eva2_7sobrescritura{
public static void main(String[] args){

     // TODO code application logic here
         System.out.println("---------Empleado Base------------");
         EmpleadoBase empBase = new EmpleadoBase("Max", "Saucedo", 1000, 1, 0.1);
         System.out.println(empBase);
         System.out.println("----------Empleado Tmporal----------");
         EmpleadoTemporal empTempo = new EmpleadoTemporal("Mario", "castillo", 500, "hggLGh122", 8.5);
         System.out.println(empTempo);
     }
}
