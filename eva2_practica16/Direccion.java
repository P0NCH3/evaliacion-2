public class Direccion {
    private String calle;
    private String colonia;
    private int numero_exterior;
    private int numero_interior;
    public Direccion() {
        calle = "-----";
        colonia = "------";
        this.numero_exterior = 0;
        this.numero_interior = 0;
    }
    
    public Direccion(String calle, String colonia, int numero_exterior, int numero_interior) {
        this.calle = calle;
        this.colonia = colonia;
        this.numero_exterior = numero_exterior;
        this.numero_interior = numero_interior;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public int getNumero_exterior() {
        return numero_exterior;
    }
    public void setNumero_exterior(int numero_exterior) {
        this.numero_exterior = numero_exterior;
    }
    public int getNumero_interior() {
        return numero_interior;
    }
    public void setNumero_interior(int numero_interior) {
        this.numero_interior = numero_interior;
    }
    
}
