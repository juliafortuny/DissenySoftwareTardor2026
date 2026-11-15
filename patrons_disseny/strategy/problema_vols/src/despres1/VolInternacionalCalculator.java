package despres1;

public class VolInternacionalCalculator extends CalculadoraPreuVol {
    public VolInternacionalCalculator(String moneda) {
        super(moneda);
    }

    @Override
    public String calcularVol(double preuVolSenseDesc) {
        return preuVolSenseDesc + getMoneda();
    }

    @Override
    public String informacioTargetaEmbarcament() {
        String sortida;
        sortida = "Targeta Internacional";
        return sortida;
    }
}
