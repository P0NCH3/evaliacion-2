package eva2_practica2;

public class proovedor {
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private boolean credito;

    public proovedor(String nombre, String ApellidoPaterno , String ApellidoMaterno,boolean credito){
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.credito = credito;
    }
    public proovedor(){
        this.nombre = "Max";
        this.ApellidoPaterno = "Buitimea";
        this.ApellidoMaterno = "Saucedo";
        this.credito = false;

    }


    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidoPaterno(){
        return this.ApellidoPaterno;
    }
    public void setApellidoPaterno(String ApellidoPaterno){
        this.ApellidoPaterno = ApellidoPaterno;
    }
    public String getApellidoMaterno(){
        return this.ApellidoMaterno;
    }
    public void setApellidoMaterno(String ApellidoMaterno){
        this.ApellidoMaterno = ApellidoMaterno;
    }
    
    public boolean  getCredito(){
        return this.credito;
    }
    public void settCredito(boolean credito){
        this.credito = credito;
    }
    

}
