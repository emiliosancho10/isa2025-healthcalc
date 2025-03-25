<!--HEAD-->
# isa2025 - healthcalc

# Práctica 1

## Objetivos
Se desea desarrollar una calculadora que permita estimar varios parámetros de salud de una persona, como su peso ideal o su tasa metabólica basal (TMB).

## Introducción
En esta práctica, se ha desarrollado una calculadora de parámetros de salud siguiendo las metodologías TDD (Test-Driven Development) y el patrón AAA (Arrange, Act, Assert) en los tests. Para ello, hemos utilizado Git, GitHub, Maven y JUnit5 para la gestión del proyecto y la ejecución de las pruebas automatizadas.

### Contenidos a tener en cuenta
* idealWeight: Calcula el peso ideal de un individuo a partir de su altura y género.
* basalMetabolicRate: Estima la tasa metabólica basal utilizando peso, altura, género y edad.

## Test utilizados en idealWeight():

Todos los tests siguen el patrón AAA (Arrange, Act, Assert) para garantizar claridad y estructura en las pruebas.

* *Test de altura negativa:* testAlturaNegativaIW()
   - Arrange: Configuramos una altura negativa.
   - Act: Llamamos al método idealWeight().
   - Assert: Verificamos que se lanza la excepción esperada.

* *Test de altura demasiado baja:* testAlturaMenor()
   - Arrange: Usamos una altura por debajo del umbral mínimo (110 para hombres, 100 para mujeres).
   - Act: Ejecutamos el método.
   - Assert: Comprobamos que se lanza la excepción correspondiente.

* *Test de género incorrecto:* testGenderProblemIW()
   - Arrange: Introducimos un valor de género no válido.
   - Act: Llamamos al método idealWeight().
   - Assert: Validamos que se genera la excepción adecuada.

* *Test de géneros válidos:* CorrectGender()
   - Arrange: Probamos con todas las combinaciones correctas de género (M, W, mayúsculas y minúsculas).
   - Act: Ejecutamos el método.
   - Assert: Confirmamos que no se lanza ninguna excepción.

* *Test de altura demasiado alta:* testAlturaMayor()
   - Arrange: Introducimos una altura superior al máximo permitido (260 cm).
   - Act: Llamamos al método.
   - Assert: Comprobamos que se lanza una excepción.

* *Test de cálculo promedio (hombres y mujeres):* HombrePromedioIW() y testMujerPromedio()
   - Arrange: Usamos valores límites y el promedio.
   - Act: Ejecutamos los cálculos.
   - Assert: Validamos que los resultados sean los esperados.

## Test utilizados en basalMetabolicRate():

* *Test de peso incorrecto:* PesoIncorrecto()
   - Arrange: Valores de peso negativos o fuera del rango permitido.
   - Act: Llamamos al método.
   - Assert: Se lanza la excepción adecuada.

* *Test de altura incorrecta:* alturaIncorrecta()
   - Arrange: Usamos alturas negativas, demasiado bajas o altas.
   - Act: Ejecutamos el método.
   - Assert: Validamos las excepciones correspondientes.

* *Test de género incorrecto:* IncorrectoSexo()
   - Arrange: Géneros distintos a "M" o "W".
   - Act: Llamamos al método.
   - Assert: Confirmamos la aparición de una excepción.

* *Test de sexos válidos:* ComprobacionSexo()
   - Arrange: Probamos con los géneros correctos.
   - Act: Ejecutamos el cálculo.
   - Assert: No se debe lanzar excepción.

* *Test de valores promedio (hombres y mujeres):* testMenBMR() y testWomanBRM()
   - Arrange: Utilizamos límites y valores promedio.
   - Act: Ejecutamos la función.
   - Assert: Validamos la salida correcta.

## Ejecución de los Test
Para realizar la ejecución de Maven en Visual Studio Code, utilizamos el siguiente comando:


`mvn test`


Resultado: Todos los tests se ejecutan y pasan correctamente.

![](https://github.com/emiliosancho10/isa2025-healthcalc/blob/practica1/Captura.PNG)

## Metodología TDD en los commits
En el desarrollo, se ha seguido la metodología TDD (Test-Driven Development). Cada funcionalidad ha sido implementada creando primero los tests y, posteriormente, desarrollando el código que los satisface. Este enfoque ha quedado reflejado en el historial de commits, donde cada cambio corresponde a una nueva funcionalidad o una corrección de errores.



