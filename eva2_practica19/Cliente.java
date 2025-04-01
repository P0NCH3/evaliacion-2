public class Cliente extends Persona{
    private String rfc;

    public Cliente(){
        super();
        this.rfc = "-----";
    }

    public Cliente(String nombre, String Apellido, int edad, String rfc) {
        super(nombre, Apellido, edad);
        this.rfc = rfc;
    }
    
    public String getRFC() {
        return rfc;
    }

    public void setRFC(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: " + rfc);
    }
}
