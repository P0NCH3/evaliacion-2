
public class Motor  {
    private int tipoMotor;
    private int potencia;


    public Motor() {
        this.tipoMotor = 0;
        this.potencia = 0;
    }
    public Motor(int tipoMotor, int potencia) {
        this.tipoMotor = tipoMotor; //gasolina
        this.potencia = potencia;
    }
    public int getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(int tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String toString(){
        return "Tipo de Motor: " + tipoMotor + "\n" + "Potencia: " + potencia + "\n";
    }
}
