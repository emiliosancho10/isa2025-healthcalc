package healthcalc.calculators;

public class BMICalculator {
    public float calculate(float weight, int height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("El peso y la altura deben ser positivos.");
        }

        float heightMeters = height / 100f; // convertir cm a metros
        return weight / (heightMeters * heightMeters);
    }
}
