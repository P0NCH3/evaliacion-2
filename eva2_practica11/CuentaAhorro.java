//package eva2_practica10;
public class CuentaAhorro {
    private int agregarSaldo;
    private int quitarSaldo;

    public CuentaAhorro(int agregarSaldo, int quitarSaldo){
        this.agregarSaldo = agregarSaldo;
        this.quitarSaldo = quitarSaldo;
    }
    public int getAgregarSaldo(){
        return agregarSaldo;
    }
    public void setAgregarSaldo(int agregarSaldo){
        this.agregarSaldo = agregarSaldo;
    }
    public int getquitarsaldo(){
        return quitarSaldo;
    }
    public void setquitarsdaldo(int quitarSaldo){
        this.quitarSaldo = quitarSaldo;
    }
    public double calcularSaldoAgregado(){
        return agregarSaldo;
    }
    public double calcularQuitarSaldo(){
        return  quitarSaldo;
    }
    public double calcularMovimientos(){
        return agregarSaldo - quitarSaldo;
    }
}
