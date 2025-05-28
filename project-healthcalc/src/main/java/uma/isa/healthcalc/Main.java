package uma.isa.healthcalc;

import healthcalc.adapter.HealthAdapter;
import healthcalc.adapter.HealthHospital;
import uma.isa.healthcalc.view.*;
import uma.isa.healthcalc.controller.*;
import healthcalc.strategy.*; // Estrategias BMR
import healthcalc.stats.*;    // Proxy con estadísticas

public class Main {
    public static void main(String[] args) {
        // --- Interfaz gráfica ---
        IHealthCalcView view = new HealthCalcView();
        new HealthCalcController(view);
        ((HealthCalcView) view).setVisible(true);

        // --- Prueba rápida del patrón Adapter ---
        HealthHospital hospitalCalc = new HealthAdapter();
        double bmr = hospitalCalc.bmr('m', 25, 1.75f, 70000); // altura en metros, peso en gramos
        int ideal = hospitalCalc.pesoIdeal('m', 1.75f);

        System.out.println("BMR para hospital: " + bmr);
        System.out.println("Peso ideal para hospital: " + ideal);

        // --- Prueba rápida del patrón Strategy ---
        BMRCalculator calculator = new BMRCalculator(new HarrisBenedictStrategy());
        System.out.println("BMR (Harris-Benedict): " + calculator.calculate(70, 175, 'm', 25));

        calculator.setStrategy(new MifflinStJeorStrategy());
        System.out.println("BMR (Mifflin-St Jeor): " + calculator.calculate(70, 175, 'm', 25));

        // --- Prueba del patrón Proxy con estadísticas (apartado 3b) ---
        BMRCalculatorWithStats calcStats = new BMRCalculatorWithStats(new HarrisBenedictStrategy());

        calcStats.calculate(70, 175, 'm', 25); // peso (kg), altura (cm), género, edad
        calcStats.calculate(60, 160, 'f', 30);

        System.out.println("--- Estadísticas ---");
        System.out.println("Peso medio: " + calcStats.pesoMedio());
        System.out.println("Altura media: " + calcStats.alturaMedia());
        System.out.println("Edad media: " + calcStats.edadMedia());
        System.out.println("BMR medio: " + calcStats.bmrMedio());
        System.out.println("Nº Hombres: " + calcStats.numSexoH());
        System.out.println("Nº Mujeres: " + calcStats.numSexoM());
        System.out.println("Total pacientes: " + calcStats.numTotalPacientes());
    }
}
