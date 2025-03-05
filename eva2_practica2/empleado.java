package eva2_practica2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author max
 */
public class empleado {
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int edad;
    private String rfc;
    private int claveEmpleado;

    public empleado(String nombre, String ApellidoPaterno , String ApellidoMaterno,int edad ,String rfc, int  claveEmpleado){
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
        this.claveEmpleado = claveEmpleado;
    }
    public empleado(){
        this.nombre = "Max";
        this.ApellidoPaterno = "Buitimea";
        this.ApellidoMaterno = "Saucedo";
        this.edad = 19;
        this.rfc = "MAXIMILIANO012345";
        this.claveEmpleado = 123;

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
        public int getclaveEmpleado(){
        return this.claveEmpleado;
    }
    public void setclaveEmpleado(int claveEmpleado){
        this.claveEmpleado = claveEmpleado;
    }
    
}
