package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    // Atributo estático para la instancia única
    private static HealthCalcImpl instance;

    // Constructor privado para evitar instanciación externa
    private HealthCalcImpl() {
    }

    // Método público para obtener la instancia única (Singleton)
    public static HealthCalcImpl getInstance() {
        if (instance == null) {
            instance = new HealthCalcImpl();
        }
        return instance;
    }

    @Override
    public float idealWeight(int height, char gender) throws Exception {

        if (height <= 0) {
            throw new IllegalArgumentException("La altura debe ser un número positivo.");
        }
        if (height >= Integer.MAX_VALUE) { 
            throw new IllegalArgumentException("La altura proporcionada es demasiado grande.");
        }
        if (Character.toLowerCase(gender) != 'm' && Character.toLowerCase(gender) != 'w') {
            throw new IllegalArgumentException("El género debe ser 'm' (hombre) o 'w' (mujer).");
        }

        float pesoIdeal;
        if (Character.toLowerCase(gender) == 'm') {
            pesoIdeal = height - 100 - (height - 150) / 4f;
        } else {
            pesoIdeal = height - 100 - (height - 150) / 2.5f;
        }

        if (pesoIdeal <= 0) {
            throw new IllegalArgumentException("El peso ideal es cero o menor que cero.");
        }

        return pesoIdeal;
    }

    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {

        if (weight <= 0 || weight >= Float.MAX_VALUE) {
            throw new IllegalArgumentException("El peso debe ser un valor positivo y razonable.");
        }

        if (height <= 0 || height >= Integer.MAX_VALUE) {
            throw new IllegalArgumentException("La altura debe ser un valor positivo y razonable.");
        }

        if (age <= 0 || age >= Integer.MAX_VALUE) {
            throw new IllegalArgumentException("La edad debe ser un valor positivo y razonable.");
        }

        if (Character.toLowerCase(gender) != 'm' && Character.toLowerCase(gender) != 'w') {
            throw new IllegalArgumentException("El género debe ser 'm' (hombre) o 'w' (mujer).");
        }

        float metabolicrate;
        if (Character.toLowerCase(gender) == 'm') {
            metabolicrate = 10 * weight + 6.25f * height - 5 * age + 5;
        } else {
            metabolicrate = 10 * weight + 6.25f * height - 5 * age - 161;
        }

        if (metabolicrate <= 0) {
            throw new IllegalArgumentException("El metabolismo basal es cero o menor que cero.");
        }

        return metabolicrate;
    }
}
