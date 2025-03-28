public class eva2_practica17 {
    

public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.setMarca("Toyota");
        v1.setModelo("Corolla");
        v1.setYear(2015);
        Motor m1 = new Motor(8, 2000);
        v1.setMotor(m1);
        v1.setMotor(m1);
        System.out.println(v1);
        
    }
}