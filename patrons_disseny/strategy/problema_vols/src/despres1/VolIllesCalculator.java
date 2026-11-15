package despres1;

public class VolIllesCalculator extends CalculadoraPreuVol{
    public VolIllesCalculator(String moneda) {
        super(moneda);
    }

    @Override
    public String calcularVol(double preuVolSenseDesc) {
        return preuVolSenseDesc * (1-0.75) + getMoneda();
    }

    @Override
    public String informacioTargetaEmbarcament() {
        String sortida;
        sortida = "Targeta Ses Illes";
        return sortida;
    }
}
