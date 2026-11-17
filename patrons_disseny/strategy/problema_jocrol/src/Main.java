import personatges.*;

public class Main {
    public static void main(String[] args) {

        Personatge guerrer = new Guerrer("Thorin");
        Personatge arquer = new Arquer("Legolas");
        Personatge mag = new Mag("Gandalf");
        Personatge huma = new Huma("Aragorn");
        Personatge elf = new Elf("Elandril");
        Personatge nan = new Nan("Gimli");

        System.out.println("--- Accions inicials ---");
        guerrer.atacar();
        arquer.defensar();
        mag.atacar();

        System.out.println("\n--- El Mag puja de nivell fins 20 ---");
        mag.pujarNivell(19); // ara és nivell 1+19=20

        System.out.println("\n--- El Mag ataca de nou (canvi d'estil) ---");
        mag.atacar();

        System.out.println("\n--- Estadístiques dels personatges ---");
        guerrer.pujarNivell(2);
        guerrer.morir();
        guerrer.pujarNivell(1);
        guerrer.morir();
        guerrer.morir();
        guerrer.mostrarEstadistiques();
    }
}
