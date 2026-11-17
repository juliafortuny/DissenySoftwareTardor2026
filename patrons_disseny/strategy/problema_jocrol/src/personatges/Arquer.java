package personatges;

public class Arquer extends Personatge {

    public Arquer(String nom) {
        super(nom, "Arquer");
    }

    @Override
    public void atacar() {
        System.out.println(nom + " dispara una fletxa.");
    }

    @Override
    public void defensar() {
        System.out.println(nom + " esquiva àgilment.");
    }
}