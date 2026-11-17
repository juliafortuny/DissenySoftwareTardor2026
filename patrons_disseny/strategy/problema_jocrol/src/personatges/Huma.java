package personatges;

public class Huma extends Personatge {

    public Huma(String nom) {
        super(nom, "Huma");
    }

    @Override
    public void atacar() {
        System.out.println(nom + " ataca amb espasa.");
    }

    @Override
    public void defensar() {
        System.out.println(nom + " es defensa amb un escut.");
    }
}