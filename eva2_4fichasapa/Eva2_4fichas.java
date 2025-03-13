package eva2_4fichasapa;
public class Eva2_4fichas {
    public Eva2_4fichas() {
    }
 
    public static void main(String[] args) {
       System.out.println("----------------------");
       FichaAPA prov = new FichaAPA();
       Libro lib = new Libro();
       System.out.println("----/Libro/-------");
       prov.setTitulo("El principito");
       prov.setYear(2005);
       lib.setEditorial("ediciones");
       System.out.println("Autor: " + prov.getAutor());
       System.out.println("Titulo  : " + prov.getTitulo());
       System.out.println("Lanzamiento: " + prov.getYear());
       System.out.println("Editorial: " + lib.getEditorial());
       Grabacion grabe = new Grabacion();
       System.out.println("------/Grabacion/---------");
       prov.setTitulo("Los amaneceres");
       prov.setYear(2008);
       grabe.setInterprete("stromae");
       System.out.println("Autor: " + prov.getAutor());
       System.out.println("Titulo  : " + prov.getTitulo());
       System.out.println("Lanzamiento: " + prov.getYear());
       System.out.println("Interprete  : " + grabe.getInterprete());
       System.out.println("--------/Enciclopedia/----------");
       Enciclopedia enci = new Enciclopedia();
       enci.setAutor("Sebastian");
       System.out.println("Autor: " + enci.getAutor());
       System.out.println("Titulo: " + enci.getTitulo());
       System.out.println("Lanzamiento: " + enci.getYear());
       System.out.println("Editorial: " + enci.getEditorial());
    }
 }