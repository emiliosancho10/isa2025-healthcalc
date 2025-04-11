package uma.isa.healthcalc.controller;

import uma.isa.healthcalc.model.HealthCalc;
import uma.isa.healthcalc.view.IHealthCalcView;

public class HealthCalcController {
    public HealthCalcController(IHealthCalcView view) {
        view.addCalcularPesoIdealListener(e -> {
            try {
                double altura = Double.parseDouble(view.getAltura());
                String sexo = view.getSexo();
                double res = HealthCalc.calcularPesoIdeal(altura, sexo);
                view.setResultado("Peso Ideal: " + res + " kg");
            } catch (Exception ex) {
                view.mostrarError(ex.getMessage());
            }
        });

        view.addCalcularTMBListener(e -> {
            try {
                double peso = Double.parseDouble(view.getPeso());
                double altura = Double.parseDouble(view.getAltura());
                int edad = Integer.parseInt(view.getEdad());
                String sexo = view.getSexo();
                double res = HealthCalc.calcularTMB(peso, altura, edad, sexo);
                view.setResultado("TMB: " + res + " kcal");
            } catch (Exception ex) {
                view.mostrarError(ex.getMessage());
            }
        });

        view.addCalcularIMCListener(e -> {
            try {
                double peso = Double.parseDouble(view.getPeso());
                double altura = Double.parseDouble(view.getAltura());
                double res = HealthCalc.calcularIMC(peso, altura);
                view.setResultado("IMC: " + res);
            } catch (Exception ex) {
                view.mostrarError(ex.getMessage());
            }
        });

        view.addCalcularRMCListener(e -> {
            try {
                double peso = Double.parseDouble(view.getPeso());
                int edad = Integer.parseInt(view.getEdad());
                String sexo = view.getSexo();
                double res = HealthCalc.calcularRMC(peso, edad, sexo);
                view.setResultado("RMC: " + res + " bpm");
            } catch (Exception ex) {
                view.mostrarError(ex.getMessage());
            }
        });
    }
}
