package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

    private HealthCalcImpl healthCalc;

    @BeforeEach
    public void setUp() {
        // Inicializamos el objeto antes de cada test
        healthCalc = new HealthCalcImpl();
    }
    
    // Tests para el método "idealWeight" de la clase HealthCalcImpl

    @Test
    @DisplayName("Test altura negativa para idealWeight")
    public void testAlturaNegativaIdealWeight() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
        () -> healthCalc.idealWeight(-5, 'm'), 
        "La altura debe ser un número positivo.");
    }

    @Test
    @DisplayName("Test altura cero para idealWeight")
    public void testAlturaCeroIdealWeight() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
        () -> healthCalc.idealWeight(0, 'm'), 
        "La altura debe ser un número positivo.");
    }

    @Test
    @DisplayName("Test peso ideal negativo para hombre -valor de salida")
    public void testPesoIdealNegativoHombre() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
        () -> healthCalc.idealWeight(50, 'm'), 
        "El peso debe ser un valor positivo.");
    }

    @Test
    @DisplayName("Test peso ideal negativo para mujer -valor de salida")
    public void testPesoIdealNegativoMujer() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
        () -> healthCalc.idealWeight(50, 'w'), 
        "El peso debe ser un valor positivo.");
    }

    @Test
    @DisplayName("Test género no válido para idealWeight")
    public void testGeneroNoValidoIdealWeight() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
        () -> healthCalc.idealWeight(100, 'x'), 
        "El género debe ser 'm' (hombre) o 'w' (mujer).");
    }

    @Test
    @DisplayName("Test peso ideal hombre")
    public void testPesoIdealHombre() throws Exception {
        // Arrange
        int altura = 180;
        char genero = 'm';
        float pesoIdealEsperado = altura - 100 - (altura - 150) / 4f;
        
        // Act y Assert
        assertEquals(pesoIdealEsperado, healthCalc.idealWeight(altura, genero), 
        "El cálculo del peso ideal para hombre no es correcto.");
    }

    @Test
    @DisplayName("Test peso ideal mujer")
    public void testPesoIdealMujer() throws Exception {
        // Arrange
        int altura = 180;
        char genero = 'w';
        float pesoIdealEsperado = altura - 100 - (altura - 150) / 2.5f;
        
        // Act y Assert
        assertEquals(pesoIdealEsperado, healthCalc.idealWeight(altura, genero), 
        "El cálculo del peso ideal para mujer no es correcto.");
    }

    // Tests para el método "basalMetabolicRate" de la clase HealthCalcImpl

    @Test
    @DisplayName("Test altura negativa basalMetabolicRate")
    public void testAlturaNegativaBasalMetabolicRate() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
        () -> healthCalc.basalMetabolicRate(60, -1, 'm', 20), 
        "La altura debe ser un número positivo.");
    }

    @Test
    @DisplayName("Test peso negativo basalMetabolicRate")
    public void testPesoNegativoBasalMetabolicRate() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
            () -> healthCalc.basalMetabolicRate(-1, 170, 'm', 20), 
            "El peso debe ser un número positivo.");
    }

    @Test
    @DisplayName("Test edad negativa basalMetabolicRate")
    public void testEdadNegativaBasalMetabolicRate() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
            () -> healthCalc.basalMetabolicRate(60, 170, 'm', -1), 
            "La edad debe ser un número positivo.");
    }

    @Test
    @DisplayName("Test peso ideal negativo para hombre -valor de salida")
    public void testbasalMetabolicRateNegativoHombre() {
        // Arrange
        // Act y Assert
        assertThrows(IllegalArgumentException.class, 
        () -> healthCalc.basalMetabolicRate(1, 1, 'M', 50), 
        "El metabolismo basal es cero o menor que cero.");
    }

    @Test
    @DisplayName("Test metabolismo basal mujer")
    public void testMetabolismoBasalMujer() throws Exception {
        // Arrange
        int height = 180;
        float weight = 60;
        int age = 20;
        char genero = 'w';
        float metabolismoEsperado = 10 * weight + 6.25f * height - 5 * age - 161;

        // Act y Assert
        assertEquals(metabolismoEsperado, healthCalc.basalMetabolicRate(weight, height, genero, age), 
        "El cálculo del metabolismo basal para mujer no es correcto.");
    }

    @Test
    @DisplayName("Test metabolismo basal hombre")
    public void testMetabolismoBasalHombre() throws Exception {
        // Arrange
        int height = 180;
        float weight = 60;
        int age = 20;
        char genero = 'm';
        float metabolismoEsperado = 10 * weight + 6.25f * height - 5 * age + 5;

        // Act y Assert
        assertEquals(metabolismoEsperado, healthCalc.basalMetabolicRate(weight, height, genero, age), 
        "El cálculo del metabolismo basal para hombre no es correcto.");
    }
}
