//package eva2_practica9;
public class eva2_9clasesabstrac {
    
    public static void main(String[] args){
        System.out.println("-------Cliente-------");
        Cliente cliente = new Cliente("Jose", "torres", "45", "si");
        cliente.imprimirDatos();
        System.out.println("------Empleado------");
        Empleado emp = new Empleado("Max", "saus", "nose", 30);
            emp.imprimirDatos();
        
    }
}
