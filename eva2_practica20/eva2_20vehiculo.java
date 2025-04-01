public class eva2_20vehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Toyota");
        vehiculo.setModelo("Corolla");
        vehiculo.setYear(2020);
        MotorGasolina motorGasolina = new MotorGasolina();
        vehiculo.setMotor(motorGasolina);
        System.out.println(vehiculo); 
    }
}
