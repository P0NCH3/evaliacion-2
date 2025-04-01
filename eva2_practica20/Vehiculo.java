public class Vehiculo {
    private String marca;
    private String modelo;  
    private int year;
    private Motor motor;

    // Constructor por defecto
    public Vehiculo() {
        this.marca = "---";
        this.modelo = "_--";
        this.year = 0;
        this.motor = null;
    }
    // Constructor con parámetros
    public Vehiculo(String marca, String modelo, int year, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.motor = motor;
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

    public String toString() {
        String cade = "##########Vehiculo#######" + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Year: " + year + "\n" +
                "Motor: " + motor.TipoMotor() + "\n" +
                "########################";

                return cade;
                
    }
}
