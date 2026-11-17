package personatges;

public class Nan extends Personatge {

    public Nan(String nom) {
        super(nom, "Nan");
    }

    @Override
    public void atacar() {
        System.out.println(nom + " ataca amb una espasa.");
    }

    @Override
    public void defensar() {
        System.out.println(nom + " es defensa amb un escut.");
    }
}