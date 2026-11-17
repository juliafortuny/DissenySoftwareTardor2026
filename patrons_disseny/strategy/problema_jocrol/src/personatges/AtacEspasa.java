package personatges;

public class AtacEspasa implements AtacComportament{

    @Override
    public void atacar(String nom) {
        System.out.println(nom + "  ataca amb una espasa.");    }
    }
