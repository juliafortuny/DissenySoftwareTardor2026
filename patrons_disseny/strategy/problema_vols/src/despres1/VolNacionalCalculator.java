package despres1;

public class VolNacionalCalculator extends CalculadoraPreuVol {
    public VolNacionalCalculator(String moneda) {
        super(moneda);
    }

    @Override
    public String calcularVol(double preuVolSenseDesc) {
        return preuVolSenseDesc * (1 - 0.05) + getMoneda();
    }

    @Override
    public String informacioTargetaEmbarcament() {
        String sortida;
        sortida = "Targeta Nacional";
        return sortida;
    }
}
