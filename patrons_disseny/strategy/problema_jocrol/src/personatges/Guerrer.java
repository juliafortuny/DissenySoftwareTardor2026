package personatges;

public class Guerrer extends Personatge {

    public Guerrer(String nom) {
        super(nom, "Guerrer");
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