//package eva2_practica10;
public class CuentaCorriente extends Cuenta{
    private int LimiteSaldo;
    private int Deudas;
    private int agregarSaldo;

    public CuentaCorriente(int LimiteSaldo, int Deudas, int agregado){
        this.agregarSaldo = agregado;
        this.LimiteSaldo = LimiteSaldo;
        this.Deudas = Deudas;
    }
    public int getLimiteSaldo(){
        return LimiteSaldo;
    }
    public void setLimiteSaldo(int LimiteSaldo){
        this.LimiteSaldo = LimiteSaldo;
    }
    public int getDeudas(){
return Deudas;
    }
    public void setDeudas(int Deudas){
        this.Deudas = Deudas;
    }
    public int getAgregarSaldo(){
        return agregarSaldo;
    }
    public void setAgregarsaldo(int agregarSaldo){
        this.agregarSaldo = agregarSaldo;
    }

    public double calcularLimiteSaldo(){
    return LimiteSaldo;    
}
    public double calcularDeudas(){
    return Deudas;
}
    public double calcularSaldoAgregado(){
        return agregarSaldo;
    }
    public double calcularadeudo(){
        return agregarSaldo - Deudas;
    }
    
}
