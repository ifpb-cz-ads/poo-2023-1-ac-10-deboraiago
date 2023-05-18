public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fazBarulho();

        System.out.println("____________________________________");
        Mamifero mamifero = new Mamifero();
        mamifero.tipoAlimento();

        System.out.println("_____________________________________");
        Cachorro cachorro = new Cachorro();
        cachorro.fazBarulho();
        cachorro.tipoAlimento();

        System.out.println("_____________________________________");
        Gato gato = new Gato();
        gato.fazBarulho();
        gato.tipoAlimento();

        System.out.println("_____________________________________");
        Rapitil rapitil = new Rapitil();
        rapitil.tipoAtaque();

        System.out.println("_____________________________________");
        Cobra cobra = new Cobra();
        cobra.fazBarulho();
        cobra.tipoAtaque();
    }
}