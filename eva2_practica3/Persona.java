package eva2_practica3;

class Persona {
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int edad;
    private String rfc;

    public Persona(String Nombre, String ApellidoPaterno , String ApellidoMaterno,int edad ,String rfc){
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;

    }
    public Persona(){
        this.Nombre = "Max";
        this.ApellidoPaterno = "Buitimea";
        this.ApellidoMaterno = "Saucedo";
        this.edad = 19;
        this.rfc = "MAXIMILIANO012345";

    }
    public void mostrardatos(){
        System.out.println("Nombre: " + getclaveEmpleado());
        System.out.println("Credito: " + getcredito());
        System.out.println("Razon social: " + getrazonSocial());  
    }

    public String getNombre(){
        return this.Nombre;
    }
    public void setNombre(String nombre){
        this.Nombre = nombre;
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
    public int  getEdad(){
        return this.edad;
    }
    public void setedad(int edad){
        this.edad = edad;
    }
    
    public String getRFC(){
        return this.rfc;
    }
    public void setRFC(String rfc){
        this.rfc = rfc;
    }

}