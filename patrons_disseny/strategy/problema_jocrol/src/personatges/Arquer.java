package personatges;

public class Arquer extends Personatge {

    public Arquer(String nom) {
        super(nom, "Arquer");
    }

    @Override
    public void atacar() {
        atacComportament = new AtacFletxa();
        atacComportament.atacar(nom);
    }

    @Override
    public void defensar() {
        System.out.println(nom + " esquiva àgilment.");
    }
}