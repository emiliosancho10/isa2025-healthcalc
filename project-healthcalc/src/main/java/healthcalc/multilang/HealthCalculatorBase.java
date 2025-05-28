package healthcalc.multilang;

import healthcalc.strategy.BMRStrategy;

public class HealthCalculatorBase {
    protected BMRStrategy strategy;
    protected UnitConverter converter;
    protected float lastPeso;
    protected float lastAltura;
    protected float lastBMR;

    public HealthCalculatorBase(BMRStrategy strategy, UnitConverter converter) {
        this.strategy = strategy;
        this.converter = converter;
    }

    public float calculate(float pesoOriginal, float alturaOriginal, char genero, int edad) {
        lastPeso = converter.convertPeso(pesoOriginal);
        lastAltura = converter.convertAltura(alturaOriginal);
        lastBMR = strategy.calculate(lastPeso, (int) lastAltura, genero, edad);
        return lastBMR;
    }

    public String getMessage() {
        return ""; // se sobrescribe en subclases
    }
}
