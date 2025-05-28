package healthcalc.multilang;

public class HealthCalculatorWithMessageEN extends HealthCalculatorBase {

    public HealthCalculatorWithMessageEN(BMRStrategy strategy, UnitConverter converter) {
        super(strategy, converter);
    }

    @Override
    public String getMessage() {
        return String.format("The person with height %.2f %s and weight %.2f %s has a BMR of %.2f.",
                lastAltura, converter.getUnidadAltura(),
                lastPeso, converter.getUnidadPeso(),
                lastBMR);
    }
}
