package healthcalc; 

import healthcalc.HealthCalc;
import healthcalc.calculators.BMICalculator;
import healthcalc.calculators.BMRCalculator;
import healthcalc.calculators.IdealWeightCalculator;

public class HealthCalcImpl implements HealthCalc {

    private static HealthCalcImpl instance;

    private final BMRCalculator bmrCalculator;
    private final IdealWeightCalculator idealWeightCalculator;
    private final BMICalculator bmiCalculator;

    private HealthCalcImpl() {
        this.bmrCalculator = new BMRCalculator();
        this.idealWeightCalculator = new IdealWeightCalculator();
        this.bmiCalculator = new BMICalculator();
    }

    public static HealthCalcImpl getInstance() {
        if (instance == null) {
            instance = new HealthCalcImpl();
        }
        return instance;
    }

    @Override 
public float calculateIdealWeight(int height, char gender) throws Exception {
    return idealWeightCalculator.calculate(height, gender);
}

    @Override
public float calculateBMR(float weight, int height, char gender, int age) throws Exception {
    return bmrCalculator.calculate(weight, height, gender, age);
}
    @Override
public float calculateBMI(float weight, int height) throws Exception {
    return bmiCalculator.calculate(weight, height);
}


}

 