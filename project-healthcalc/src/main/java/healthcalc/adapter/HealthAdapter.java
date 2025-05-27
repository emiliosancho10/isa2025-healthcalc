package healthcalc.adapter;

import healthcalc.HealthCalcImpl;

public class HealthAdapter implements HealthHospital {

    private HealthCalcImpl calc;

    public HealthAdapter() {
        this.calc = HealthCalcImpl.getInstance(); // Patrón Singleton
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        try {
            // Convertir altura de metros a cm, y peso de gramos a kg
            return calc.basalMetabolicRate(peso / 1000f, (int)(altura * 100), genero, edad);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int pesoIdeal(char genero, float altura) {
        try {
            // Convertir altura de metros a cm
            return (int) calc.idealWeight((int)(altura * 100), genero);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
