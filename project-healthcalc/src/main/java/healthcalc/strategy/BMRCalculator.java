package healthcalc.strategy;

public class BMRCalculator {
    private BMRStrategy strategy;

    public BMRCalculator(BMRStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(BMRStrategy strategy) {
        this.strategy = strategy;
    }

    public float calculate(float weight, int height, char gender, int age) {
        return strategy.calculate(weight, height, gender, age);
    }
}
