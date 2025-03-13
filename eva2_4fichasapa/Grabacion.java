package eva2_4fichasapa;
public class Grabacion extends FichaAPA {
    private String interprete;
 
    public Grabacion() {
       this.interprete = "Sin interprete";
    }
 
    public Grabacion(String autor, String titulo, int year, String interprete) {
       super(autor, titulo, year);
       this.interprete = interprete;
    }
 
    public String getInterprete() {
       return this.interprete;
    }
 
    public void setInterprete(String interprete) {
       this.interprete = interprete;
    }
 }
 
