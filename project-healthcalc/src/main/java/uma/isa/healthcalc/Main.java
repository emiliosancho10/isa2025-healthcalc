package uma.isa.healthcalc;

import healthcalc.adapter.HealthAdapter;
import healthcalc.adapter.HealthHospital;
import uma.isa.healthcalc.view.*;
import uma.isa.healthcalc.controller.*;

public class Main {
    public static void main(String[] args) {
        // Interfaz gráfica
        IHealthCalcView view = new HealthCalcView();
        new HealthCalcController(view);
        ((HealthCalcView) view).setVisible(true);

        // Prueba rápida del patrón Adapter
        HealthHospital hospitalCalc = new HealthAdapter();
        double bmr = hospitalCalc.bmr('m', 25, 1.75f, 70000); // altura en metros, peso en gramos
        int ideal = hospitalCalc.pesoIdeal('m', 1.75f);

        System.out.println("BMR para hospital: " + bmr);
        System.out.println("Peso ideal para hospital: " + ideal);
    }
}
