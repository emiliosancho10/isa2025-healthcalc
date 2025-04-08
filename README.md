<details>
  <summary>Práctica 3</summary>

## 📌 Objetivos

En esta práctica se ha trabajado con la integración de pruebas funcionales mediante el enfoque BDD (Behaviour-Driven Development), utilizando Cucumber y Maven. El objetivo principal ha sido definir historias de usuario y escenarios que sirvan como base para pruebas automatizadas con Gherkin.

---

## ⚙️ Configuración del Proyecto

Para la realización de esta práctica se han seguido estos pasos:

1. Se creó la rama `práctica3` a partir de `main` para mantener un flujo de trabajo ordenado.
2. Se añadió la dependencia de Cucumber al `pom.xml`.
3. Se creó la estructura de directorios bajo `src/test` para ubicar:
   - Archivos `.feature` (Gherkin)
   - Clases `StepDefinitions`
   - Clases `Runner` para ejecución de los tests
4. Se ejecutaron los tests con Maven y se guardó la salida en el archivo `output_tests.txt`.

---

## 📝 Historias de Usuario y Escenarios

Las siguientes historias de usuario definen el comportamiento esperado del sistema desde el punto de vista del usuario final.

### Historia de Usuario 1: Cálculo del Peso Ideal

**Como** usuario de la calculadora de salud  
**Quiero** calcular mi peso ideal en función de mi altura, género y edad  
**Para** tener una referencia de salud adecuada

#### Escenario 1: Cálculo para hombre
- Dado que el usuario es un hombre de 30 años con una altura de 1.75 metros  
- Cuando solicita el cálculo del peso ideal  
- Entonces el sistema muestra un resultado estimado

#### Escenario 2: Cálculo para mujer
- Dado que el usuario es una mujer de 25 años con una altura de 1.65 metros  
- Cuando solicita el cálculo del peso ideal  
- Entonces el sistema muestra un resultado estimado

---

### Historia de Usuario 2: Cálculo de Tasa Metabólica Basal (TMB)

**Como** usuario de la calculadora de salud  
**Quiero** conocer mi tasa metabólica basal  
**Para** tener información sobre las calorías mínimas que necesito en reposo

#### Escenario 1: TMB para hombre
- Dado que el usuario es un hombre de 70 kg, 1.80 m y 28 años  
- Cuando solicita la TMB  
- Entonces el sistema muestra el resultado calculado con la fórmula adecuada

#### Escenario 2: TMB para mujer
- Dado que el usuario es una mujer de 60 kg, 1.65 m y 32 años  
- Cuando solicita la TMB  
- Entonces el sistema muestra el resultado calculado correctamente

---

## 🧪 Resultados de las Pruebas

Las pruebas se han ejecutado correctamente utilizando el comando:

```bash
mvn test

