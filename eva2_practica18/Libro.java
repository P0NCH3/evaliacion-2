public class Libro extends MateriaBibliografico {
    private String Genero;
    private String Autor;

  
    public Libro() {
        this.Genero = "---";
        this.Autor = "---";
    }

    public Libro(String Genero, String Autor) {
        this.Genero = Genero;
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
}
