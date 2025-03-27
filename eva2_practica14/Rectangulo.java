public class Rectangulo implements Figura , mostrarDatos {
    private int Base;
    private int altura;
    public Rectangulo() {
        Base = 0;
        this.altura = 0;
    }
    public Rectangulo(int base, int altura) {
        Base = base;
        this.altura = altura;
    }
    public int getBase() {
        return Base;
    }
    public void setBase(int base) {
        Base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    @Override
    public double ClalcularPerimetro() {
        // TODO Auto-generated method stub
        return Base * altura;
    }
    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return Base *2 + altura * 2;
    }
    public void mostrarDatos(){
        System.out.println("Rectangulo: ");
        System.out.println("Base: " + Base);
        System.out.println("Altura: " + altura);
        System.out.println("Perimetro: " + ClalcularPerimetro());
        System.out.println("Area: " + calcularArea());
    }
   
}
