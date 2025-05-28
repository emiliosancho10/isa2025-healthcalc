package healthcalc.strategy;

public interface BMRStrategy {
    float calculate(float weight, int height, char gender, int age);
}
