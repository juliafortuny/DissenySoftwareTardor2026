package personatges;

public abstract class Personatge {

    protected String nom;
    protected String tipus;

    protected int nivell;
    protected int morts;

    public Personatge(String nom, String tipus) {
        this.nom = nom;
        this.tipus = tipus;

        this.nivell = 1;
        this.morts = 0;
    }

    public abstract void atacar();

    public abstract void defensar();

    public void descansar() {
        System.out.println(nom + " descansa una estona.");
    }

    public void mostrarEstadistiques() {
        System.out.println("Estadístiques de " + nom + " (" + tipus + ").");
        System.out.println(
                "Ha mort de mitjana "
                + ((float) morts) / nivell
                + " vegades per nivell pujat."
        );
    }

    public void menjar() {
        System.out.println(nom + " menja per recuperar energia.");
    }

    public void pujarNivell(int punts) {
        nivell += punts;
        System.out.println(nom + " ha pujat a nivell " + nivell);
    }

    public void morir() {
        morts++;
        System.out.println(nom + " ha mort " + morts + " vegades.");
    };
}