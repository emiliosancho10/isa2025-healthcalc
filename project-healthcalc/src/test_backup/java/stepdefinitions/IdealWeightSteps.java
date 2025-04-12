package stepdefinitions;

import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.*;
import uma.isa.healthcalc.HealthCalc;

public class IdealWeightSteps {

    private double altura;
    private String sexo;
    private double resultado;
    private String error;

    @Given("que el usuario quiere calcular su peso ideal")
    public void que_el_usuario_quiere_calcular_su_peso_ideal() {
        // No se necesita lógica aquí
    }

    @When("introduce su altura como {double} y su sexo como {string}")
    public void introduce_su_altura_y_su_sexo(double altura, String sexo) {
        this.altura = altura;
        this.sexo = sexo;
        try {
            resultado = HealthCalc.idealWeight(altura, sexo);
        } catch (IllegalArgumentException e) {
            error = e.getMessage();
        }
    }

    @When("introduce una altura negativa")
    public void introduce_una_altura_negativa() {
        this.altura = -1.70;
        this.sexo = "hombre";
        try {
            resultado = HealthCalc.idealWeight(altura, sexo);
        } catch (IllegalArgumentException e) {
            error = e.getMessage();
        }
    }

    @Then("el sistema devuelve su peso ideal")
    public void el_sistema_devuelve_su_peso_ideal() {
        assertTrue(resultado > 0);
    }

    @Then("el sistema muestra un mensaje de error indicando que la altura no es válida")
    public void el_sistema_muestra_error_por_altura() {
        assertNotNull(error);
        assertTrue(error.toLowerCase().contains("altura"));
    }
}
