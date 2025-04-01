public class Autor {
    private String nombre;
    private String nacionalidad;

    //Constructor por defecto
    public Autor() {
        this.nombre = "---";
        this.nacionalidad = "---";
    }
    //Constructor con parámetros
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
