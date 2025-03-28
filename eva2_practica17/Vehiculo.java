
public class Vehiculo {
    private String marca;
    private String modelo;
    private int year;
    private Motor motor;

    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
        this.year = 0;
        this.motor = new Motor();
    }


    public Vehiculo(String marca, String modelo, int year, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.motor = new Motor();
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String toString(){
        return "Datos del vehiculo: " + "\n" +
        "Modelo: " + modelo + "\n" +    
        "Marca: " + marca + "\n" + 
         "Año: " + year + "\n" +
         "Tipo de motor: " + motor.getTipoMotor() + "\n" +
         "Potencia: " + motor.getPotencia() + "\n";
    }
}
