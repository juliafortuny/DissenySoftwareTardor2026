package personatges;

public class Nan extends Personatge {

    public Nan(String nom) {
        super(nom, "Nan");
    }

    @Override
    public void atacar() {
        atacComportament = new AtacEspasa();
        atacComportament.atacar(nom);
    }

    @Override
    public void defensar() {
        System.out.println(nom + " es defensa amb un escut.");
    }
}