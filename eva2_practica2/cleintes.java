package eva2_practica2;
//
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author max
 */
//

 class cleintes {
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int edad;
    private String rfc;

    public cleintes(String nombre, String ApellidoPaterno , String ApellidoMaterno,int edad ,String rfc){
        this.nombre = nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
    }
    public cleintes(){
        this.nombre = "Max";
        this.ApellidoPaterno = "Buitimea";
        this.ApellidoMaterno = "Saucedo";
        this.edad = 19;
        this.rfc = "MAXIMILIANO012345";

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
public void setSApellidoPaterno(String ApellidoPaterno){
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
    this.rfc = nombre;
}


 }
