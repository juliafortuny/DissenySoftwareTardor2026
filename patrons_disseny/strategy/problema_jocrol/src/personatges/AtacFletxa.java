package personatges;

public class AtacFletxa implements AtacComportament{

    @Override
    public void atacar(String nom) {
        System.out.println(nom + " dispara una fletxa.");    }
    }
