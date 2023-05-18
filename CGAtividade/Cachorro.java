import org.w3c.dom.ls.LSOutput;

public class Cachorro extends Mamifero{
    @Override
    public void fazBarulho() {
        System.out.println("Cachorro: au au");
    }

    @Override
    public void tipoAlimento() {
        System.out.println("Alimenta: ração");
    }
}
