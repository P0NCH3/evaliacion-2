public class eva2_practica19 {
    public static void main(String[] args) {
   
        Empleado[] empleado = new Empleado[5];
        empleado[0] = new Empleado("Max", "Buitimea", 20, 3);
        empleado[1] = new Empleado("Flor", "XXXX", 69, 2);
        empleado[2] = new Empleado("jackson", "XXXX", 28, 0);
        empleado[3] = new Empleado("Emir", "XXXX", 16, 4);
        empleado[4] = new Empleado("Caseo", "XXXX", 25, 1);
        
        Cliente[] cliente = new Cliente[5];
        cliente[0] = new Cliente("Josue", "XXXX", 28, "----");
        cliente[1] = new Cliente("Carlos", "XXXX", 28, "----");
        cliente[2] = new Cliente("Alberto", "XXXX", 28, "----");
        cliente[3] = new Cliente("Sebas", "XXXX", 28, "----");
        cliente[4] = new Cliente("Erick", "XXXX", 28, "----");
        
        System.out.println("REPORTE DE EMPLEADOS-------------------");
        generarReportes(empleado);
        //for (int i = 0; i<5; i++){
            //emps[i].imprimirDatos();
        //}
        System.out.println("REPORTE DE CLIENTES-------------------");
        generarReportes(cliente);
        //for (int i = 0; i<5; i++){
            //cli[i].imprimirDatos();
        //}
    }
    
    public static void generarReportes(Persona[] personas){
        for (int i = 0; i<5; i++){
            personas[i].imprimirDatos();
        }
    }
    
}