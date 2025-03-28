
public class eva2_practica16 {
    public static void main(String[] args){
    Cleinte cliente = new Cleinte("Fausto", "villaniega", 10, "Cerro de la cruz", "cerro", 19282, 192983);
    System.out.println(cliente);
    Direccion direccion= new Direccion("Riberas", "arcanceles", 19192, 1192);
    cliente.setDireccion(direccion);
    System.out.println(cliente);
}
}