//package eva2_practica14;
public class Circulo implements Figura , mostrarDatos {
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
       return Math.PI * Math.pow(radio, radio);
    }

    @Override
    public double ClalcularPerimetro() {
      return Math.PI * radio * 2;

    }
    public void mostrarDatos(){
        System.out.println("Circulo:"); 
        System.out.println("Radio: " + radio);
        System.out.println("Perimetro: " + ClalcularPerimetro());
        System.out.println("Area: " + calcularArea());
    }

}
