//package eva2_practica10;
public class Rectangula extends Figuras {
    private int base;
    private int altura;

    public Rectangula(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public double calcularAre(){
        return base * altura;
    }
    public double calcularPerimetr(){
        return base *2 + altura * 2;
    }
}