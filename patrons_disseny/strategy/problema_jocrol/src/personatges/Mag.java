package personatges;

public class Mag extends Personatge {


    public Mag(String nom) {
        super(nom, "Mag");
    }

    @Override
    public void atacar() {
        if (nivell < 20) {
            System.out.println(nom + " ataca amb una espasa.");
        } else {
            System.out.println(nom + " llança una bola de foc.");
        }
    }

    @Override
    public void defensar() {
        System.out.println(nom + " crea una barrera màgica.");
    }
}