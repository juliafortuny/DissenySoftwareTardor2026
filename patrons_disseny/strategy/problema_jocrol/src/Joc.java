import personatges.*;

import java.util.Random;

public class Joc {

    public static void main(String[] args) {

        Personatge heroi = new Guerrer(
                "Thorin"
        );

        Random dau = new Random();

        for (int torn = 0; torn < 10; torn++) {

            int resultat = dau.nextInt(3) + 1;

            switch (resultat) {
                case 1: heroi.atacar(); break;
                case 2: heroi.defensar(); break;
                default: heroi.pujarNivell(4); break;
            }
            heroi.mostrarEstadistiques();
        }
    }
}