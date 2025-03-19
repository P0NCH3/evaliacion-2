//package eva2_practica10;

public class Circulo extends Figuras{
    private double radio;


    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double clacularPerimetro(){
        return Math.PI * radio * 2;
    }
}
