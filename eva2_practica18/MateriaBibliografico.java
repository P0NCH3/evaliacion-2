public class MateriaBibliografico {
    private String Titulo;
    private String yearPublicacion;

    public MateriaBibliografico() {
        super();
        this.Titulo = "-.--";
        this.yearPublicacion = "--";
    }
    public MateriaBibliografico(String Titulo, String yearPublicacion) {

        this.Titulo = Titulo;
        this.yearPublicacion = yearPublicacion;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getYearPublicacion() {
        return yearPublicacion;
    }
    public void setYearPublicacion(String yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

}
