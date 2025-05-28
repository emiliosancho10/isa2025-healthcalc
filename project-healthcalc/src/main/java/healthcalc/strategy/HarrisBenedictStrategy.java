package healthcalc.strategy;

public class HarrisBenedictStrategy implements BMRStrategy {

    @Override
    public float calculate(float weight, int height, char gender, int age) {
        if (Character.toLowerCase(gender) == 'm') {
            return 10 * weight + 6.25f * height - 5 * age + 5;
        } else {
            return 10 * weight + 6.25f * height - 5 * age - 161;
        }
    }
}
