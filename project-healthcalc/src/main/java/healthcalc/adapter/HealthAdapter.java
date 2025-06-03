package healthcalc.adapter;

import healthcalc.HealthCalcImpl;

public class HealthAdapter implements HealthHospital {

    private final HealthCalcImpl calc;

    public HealthAdapter() {
        this.calc = HealthCalcImpl.getInstance(); // Singleton
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        try {
            // altura de metros a cm, peso de gramos a kg
            return calc.calculateBMR(peso / 1000f, (int) (altura * 100), genero, edad);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int pesoIdeal(char genero, float altura) {
        try {
            // altura de metros a cm
            return (int) calc.calculateIdealWeight((int) (altura * 100), genero);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
