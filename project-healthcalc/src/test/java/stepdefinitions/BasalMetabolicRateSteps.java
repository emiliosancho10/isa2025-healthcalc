package stepdefinitions;

import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.*;
import uma.isa.healthcalc.HealthCalc;

public class BasalMetabolicRateSteps {

    private double peso;
    private double altura;
    private String sexo;
    private int edad;
    private double resultado;
    private String error;

    @Given("que el usuario quiere calcular su tasa metabólica basal")
    public void que_el_usuario_quiere_calcular_su_tasa_metabolica_basal() {
        // No se necesita lógica inicial
    }

    @When("introduce su peso como {double}, su altura como {double}, su sexo como {string} y su edad como {int}")
    public void introduce_sus_datos_para_tasa_metabolica(double peso, double altura, String sexo, Integer edad) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.edad = edad;
        try {
            resultado = HealthCalc.basalMetabolicRate(peso, altura, sexo, edad);
        } catch (IllegalArgumentException e) {
            error = e.getMessage();
        }
    }

    @Then("el sistema devuelve su tasa metabólica basal")
    public void el_sistema_devuelve_su_tasa_metabolica_basal() {
        assertTrue(resultado > 0, "La tasa metabólica basal debe ser positiva");
    }

    @When("introduce una edad negativa")
    public void introduce_una_edad_negativa() {
        this.peso = 70;
        this.altura = 1.75;
        this.sexo = "hombre";
        this.edad = -30;
        try {
            resultado = HealthCalc.basalMetabolicRate(peso, altura, sexo, edad);
        } catch (IllegalArgumentException e) {
            error = e.getMessage();
        }
    }

    @Then("el sistema muestra un mensaje de error indicando que la edad no es válida")
    public void el_sistema_muestra_un_mensaje_de_error_indicando_que_la_edad_no_es_valida() {
        assertNotNull(error);
        assertTrue(error.toLowerCase().contains("edad"));
    }
}
