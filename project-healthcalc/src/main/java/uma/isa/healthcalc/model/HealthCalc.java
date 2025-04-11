package uma.isa.healthcalc.model;

public class HealthCalc {

    public static double calcularPesoIdeal(double altura, String sexo) {
        if (altura <= 0) throw new IllegalArgumentException("Altura inválida");
        return sexo.equalsIgnoreCase("hombre") ? (altura - 100) * 0.9 : (altura - 100) * 0.85;
    }

    public static double calcularTMB(double peso, double altura, int edad, String sexo) {
        if (peso <= 0 || altura <= 0 || edad <= 0) throw new IllegalArgumentException("Datos inválidos");
        return sexo.equalsIgnoreCase("hombre")
            ? 10 * peso + 6.25 * altura - 5 * edad + 5
            : 10 * peso + 6.25 * altura - 5 * edad - 161;
    }

    public static double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) throw new IllegalArgumentException("Datos inválidos");
        return peso / Math.pow(altura / 100, 2);
    }

    public static double calcularRMC(double peso, int edad, String sexo) {
        if (peso <= 0 || edad <= 0) throw new IllegalArgumentException("Datos inválidos");
        return sexo.equalsIgnoreCase("hombre")
            ? 220 - edad - (peso / 20.0)
            : 226 - edad - (peso / 22.0);
    }
}
