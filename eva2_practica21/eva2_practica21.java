//package eva2_practica21;
public class eva2_practica21 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("######Serpiente######");
        serpiente serp = new serpiente();
        serp.RespiraOxigeno();
        serp.tenerSangreFria(); 
        serp.deslizarse();

        System.out.println("######Gato######");
        gato gat = new gato();
        gat.RespiraOxigeno();
        gat.tenerPelo(); 
        gat.tenerSangreCaliente();
        gat.maullar();
        
        System.out.println("######Plimorfismo######");
        reptil rept = new serpiente();
        rept.RespiraOxigeno();
        rept.tenerSangreFria();

        System.out.println("######Polimorfismo fallido######");
         Animal animal2 = new serpiente();

        System.out.println("######objeto serpiente######");
         serpiente objserp = (serpiente) rept;
         objserp.RespitraOxigeno();
         objserp.tenerSangreFria();
         objserp.deslizarse();
    }



}
