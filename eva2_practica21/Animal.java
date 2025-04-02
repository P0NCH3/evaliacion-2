//package eva2_practica21;
public class Animal {
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
    class reptil extends Animal {
        public reptil() {
            System.out.println("Reptil");
        }
        public void tenerSangreFria() {
            System.out.println("Tener Sangre Fria");
        }
    }
    class gato extends Mamifero {
        public gato() {
            System.out.println("Gato");
        }
        public void maullar() {
            System.out.println("Maullar");
        }
        public void tenergarrasRetractiles() {
            System.out.println("Tener garras");
        }
    }
    class serpiente extends reptil {
        public serpiente() {
            System.out.println("Serpiente");
        }
        public void deslizarse() {
            System.out.println("Deslizarse");
        }
    }




}