package healthcalc.multilang;

public class AmericanUnitConverter implements UnitConverter {
    @Override
    public float convertPeso(float pesoLibras) {
        return pesoLibras * 0.453592f; // libras a kg
    }

    @Override
    public float convertAltura(float alturaPies) {
        return alturaPies * 30.48f; // pies a cm
    }

    @Override
    public String getUnidadPeso() {
        return "lbs";
    }

    @Override
    public String getUnidadAltura() {
        return "feet";
    }
}
