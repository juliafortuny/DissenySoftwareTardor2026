package personatges;

public class Elf extends Personatge {

    public Elf(String nom) {
        super(nom, "Elf");
    }

    @Override
    public void atacar() {
        atacComportament = new AtacFletxa();
        atacComportament.atacar(nom);
    }

    @Override
    public void defensar() {
        if (nivell > 10) {
            System.out.println(nom + " esquiva àgilment.");
        } else {
            System.out.println(nom + " crea una barrera màgica.");
        }
    }
}