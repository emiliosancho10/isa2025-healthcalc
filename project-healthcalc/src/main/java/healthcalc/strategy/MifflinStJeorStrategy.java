package healthcalc.strategy;

public class MifflinStJeorStrategy implements BMRStrategy {

    @Override
    public float calculate(float weight, int height, char gender, int age) {
        if (Character.toLowerCase(gender) == 'm') {
            return 66.5f + (13.75f * weight) + (5.003f * height) - (6.755f * age);
        } else {
            return 655.1f + (9.563f * weight) + (1.850f * height) - (4.676f * age);
        }
    }
}
