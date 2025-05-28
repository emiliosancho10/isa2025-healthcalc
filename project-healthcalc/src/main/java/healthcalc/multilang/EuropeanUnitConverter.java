package healthcalc.multilang;

public class EuropeanUnitConverter implements UnitConverter {
    @Override
    public float convertPeso(float pesoGramos) {
        return pesoGramos / 1000f; // gramos a kg
    }

    @Override
    public float convertAltura(float alturaMetros) {
        return alturaMetros * 100; // metros a cm
    }

    @Override
    public String getUnidadPeso() {
        return "kg";
    }

    @Override
    public String getUnidadAltura() {
        return "metros";
    }
}
