package eva2_4fichasapa;

public class Libro extends FichaAPA {
    private String editorial;
 
    public Libro() {
       this.editorial = "Sin editorial";
    }
 
    public Libro(String autor, String titulo, int year, String editorial) {
       super(autor, titulo, year);
       this.editorial = editorial;
    }
 
    public String getEditorial() {
       return this.editorial;
    }
 
    public void setEditorial(String editorial) {
       this.editorial = editorial;
    }
 }
 
