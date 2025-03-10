package eva2_practica3;


public class eva2_3herencias{
    
public static void Main(String[] args){
//empleado

    Empleados emp = new Empleados();
    emp.setNombre("Maximiliano");
      
    
    
//proovedor
    Provedor prov = new Provedor(); 
        prov.setcredito(false);
    
    
    //cliente
    Cliente clientes = new Cliente();
    clientes.setrazonSocial("La gallina turuleca");

    

public void mostrardatos(){
    System.out.println("Nombre: " + emp.getNombre());
    System.out.println("Credito: " + prov.getcredito());
    System.out.println("Razon social: " + clientes.getrazonSocial());
}


}
}