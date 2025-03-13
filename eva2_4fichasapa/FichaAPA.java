package eva2_4fichasapa;


public class FichaAPA {
    private String autor;
    private String titulo;
    private int year;
 
    public FichaAPA() {
       this.autor = "Sin datos (APA)";
       this.titulo = "Sin dato (APA)";
       this.year = 0;
    }
 
    public FichaAPA(String autor, String titulo, int year) {
       this.autor = autor;
       this.titulo = titulo;
       this.year = year;
    }
 
    public String getAutor() {
       return this.autor;
    }
 
    public void setAutor(String autor) {
       this.autor = autor;
    }
 
    public String getTitulo() {
       return this.titulo;
    }
 
    public void setTitulo(String titulo) {
       this.titulo = titulo;
    }
 
    public int getYear() {
       return this.year;
    }
 
    public void setYear(int year) {
       this.year = year;
    }
 }
