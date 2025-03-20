//package eva2_practica11;

public abstract class Cuenta{
    public static void main(String[] args){
        CuentaCorriente saldo = new CuentaCorriente(10000,800, 1000);
        System.out.println("#############################################");
        System.out.println("---------CUENTA CORRIENTE--------");
        System.out.println("Limite de tu tarjeta: " + saldo.calcularLimiteSaldo());
        System.out.println("Deudas a pagar: " + saldo.calcularDeudas());
        System.out.println("Saldo agregado a cuenta: " + saldo.calcularSaldoAgregado());
        System.out.println("Saldo restante por deudas: " + saldo.calcularadeudo());
        System.out.println("##############################################");
        CuentaAhorro ahorro = new CuentaAhorro(50000,10000);
        System.out.println("---------CUENTA DE AHORRO----------");
        System.out.println("Saldo agregado en tu cuenta de ahorro: " + ahorro.calcularSaldoAgregado());
        System.out.println("Movimientos en la cuenta: " + ahorro.calcularQuitarSaldo());
        System.out.println("Tu saldo restante: " + ahorro.calcularMovimientos());
        System.out.println("###############################################");
    }
}