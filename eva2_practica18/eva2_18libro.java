public class eva2_18libro {
    public static void main(String[] args) {

    MateriaBibliografico mat = new MateriaBibliografico("la pascualita", "2008");
    Autor autor = new Autor("Jose Rodriguez", "Colombia");
    Libro lib = new Libro("Terror", "gustavo Almanda" );
    System.out.println("Titulo: " + mat.getTitulo());
    System.out.println("Año de publicacion: " + mat.getYearPublicacion());
    System.out.println("Genero: " + lib.getGenero());
    System.out.println("Autor: " + lib.getAutor());
    System.out.println("Nombre: " + autor.getNombre());
    System.out.println("Nacionalidad: " + autor.getNacionalidad());
    }
}
