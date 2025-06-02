package healthcalc;

/**
 * Calculator of some health parameters of persons.
 */
public interface HealthCalc {

    /**
     * Calculate the ideal weight (IW) of a person following the Lorentz formula.
     *
     * @param height Height of the person (cm).
     * @param gender Gender of the person ('m' or 'w').
     * @return The ideal weight of the person (kg).
     * @throws Exception
     */
    float calculateIdealWeight(int height, char gender) throws Exception;

    /**
     * Calculate the Basal Metabolic Rate (BMR) of a person.
     *
     * @param weight Weight in kg.
     * @param height Height in cm.
     * @param gender Gender ('m' or 'w').
     * @param age    Age of the person.
     * @return BMR value.
     * @throws Exception
     */
    float calculateBMR(float weight, int height, char gender, int age) throws Exception;
}
