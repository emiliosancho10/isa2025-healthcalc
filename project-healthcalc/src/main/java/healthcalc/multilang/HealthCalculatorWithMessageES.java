package healthcalc.multilang;

public class HealthCalculatorWithMessageES extends HealthCalculatorBase {

    public HealthCalculatorWithMessageES(BMRStrategy strategy, UnitConverter converter) {
        super(strategy, converter);
    }

    @Override
    public String getMessage() {
        return String.format("La persona con altura %.2f %s y %.2f %s tiene un BMR de %.2f.",
                lastAltura / 100f, converter.getUnidadAltura(), // convertimos cm a metros
                lastPeso, converter.getUnidadPeso(),
                lastBMR);
    }
}
