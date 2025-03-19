//package eva2_practica10;
public abstract class Figuras {
    public static void main(String[] args) {
        
    
    Circulo circulo = new Circulo(100);
    System.out.println("Circulo" );
    System.out.println("Radio: "+ circulo.calcularArea());
    System.out.println("Perimetro: " + circulo.clacularPerimetro());
    System.out.println("-----------");

Rectangula rectangulo = new Rectangula(29, 14);
System.out.println("Rectangulo");
System.out.println("Resultado: " + rectangulo.calcularAre());
System.out.println("Perimetro: " + rectangulo.calcularPerimetr());

}
}