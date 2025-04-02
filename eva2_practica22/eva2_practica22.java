public class eva2_practica22 {
    public static void main(String[] args) {
        // TODO code application logic here
    Gato garu = new gato();
    Serpiente serpiente = new Serpiente();
    imprimir(garu);
    imprimir (serpiente);
    }

    public static void imprimir(Animal animal){
        animal.tenerPelo();
        if (animal instanceof Gato);
        System.out.println("Objetivo de tipo Gato");
    } else {
        System.out.println("Objetivo de tipo Serpiente");
    }



    }
    class Animal {
        public Animal() {
            System.out.println("Respira oxigeno");
        }
        class Mamifero extends Animal {
            public Mamifero() {
                System.out.println("Mamifero");
    
            }
            public void tenerPelo() {
                System.out.println("Tener Pelo");
            }
            public void tenerSangreCaliente() {
                System.out.println("Tener Sangre Caliente");
            }
        }
        class Reptil extends Animal {
            public Reptil() {
                System.out.println("Reptil");
            }
            public void tenerSangreFria() {
                System.out.println("Tener Sangre Fria");
            }
        }
        class Gato extends Mamifero {
            public Gato() {
                System.out.println("Gato");
            }
            public void maullar() {
                System.out.println("Maullar");
            }
            public void tenergarrasRetractiles() {
                System.out.println("Tener garras");
            }
        }
        class Serpiente extends Reptil {
            public Serpiente() {
                System.out.println("Serpiente");
            }
            public void deslizarse() {
                System.out.println("Deslizarse");
            }
        }
}
