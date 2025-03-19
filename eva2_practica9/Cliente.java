//package eva2_practica9;
public class Cliente extends Persona{
    private String tipoPersona;
public Cliente(String Nombre, String Apellido, String Edad, String tipoPersona){
    super(Nombre, Apellido, Edad);
    this.tipoPersona = tipoPersona;
}
    public String getTipoPersona(){
        return tipoPersona;
    
    }
    public void settipoPersona(String tipoPersona){
        this.tipoPersona = tipoPersona;
    }
    public void imprimirDatos(){
        System.out.println("Cliente");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Tipo de Persona: " + getTipoPersona());
    }
}
