package healthcalc.stats;

import healthcalc.strategy.BMRCalculator;
import healthcalc.strategy.BMRStrategy;

import java.util.ArrayList;
import java.util.List;

public class BMRCalculatorWithStats implements HealthStats {
    private BMRCalculator calculator;
    private List<Paciente> pacientes;

    public BMRCalculatorWithStats(BMRStrategy strategy) {
        this.calculator = new BMRCalculator(strategy);
        this.pacientes = new ArrayList<>();
    }

    public void setStrategy(BMRStrategy strategy) {
        calculator.setStrategy(strategy);
    }

    public float calculate(float weight, int height, char gender, int age) {
        float bmr = calculator.calculate(weight, height, gender, age);
        pacientes.add(new Paciente(weight, height, gender, age, bmr));
        return bmr;
    }

    @Override public float pesoMedio() {
        return (float) pacientes.stream().mapToDouble(p -> p.weight).average().orElse(0);
    }

    @Override public float alturaMedia() {
        return (float) pacientes.stream().mapToDouble(p -> p.height).average().orElse(0);
    }

    @Override public float edadMedia() {
        return (float) pacientes.stream().mapToDouble(p -> p.age).average().orElse(0);
    }

    @Override public float bmrMedio() {
        return (float) pacientes.stream().mapToDouble(p -> p.bmr).average().orElse(0);
    }

    @Override public int numSexoH() {
        return (int) pacientes.stream().filter(p -> Character.toLowerCase(p.gender) == 'm').count();
    }

    @Override public int numSexoM() {
        return (int) pacientes.stream().filter(p -> Character.toLowerCase(p.gender) == 'f').count();
    }

    @Override public int numTotalPacientes() {
        return pacientes.size();
    }
}
