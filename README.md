# Calculadora de Salud  

Este proyecto implementa una calculadora de salud con las funciones de cálculo de peso ideal y tasa metabólica basal (*Basal Metabolic Rate* - BMR). Se ha desarrollado siguiendo la metodología de **Desarrollo Guiado por Pruebas** (*Test-Driven Development* - TDD), asegurando la calidad y fiabilidad del código mediante pruebas unitarias.

<details>
  <summary>Práctica 1</summary>

## 📌 Objetivos  
El objetivo principal ha sido implementar los métodos `idealWeight` y `basalMetabolicRate`, garantizando que funcionen correctamente a través de pruebas exhaustivas.  

### 🔹 Flujo de trabajo  
1. Definir los casos de prueba.  
2. Implementar los tests.  
3. Desarrollar los métodos y refinar el código según los resultados de los tests.  

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




</details>

# Práctica 2

---


---
# **Casos de Uso y Especificación en HealthCalc**

## **Diagrama de Casos de Uso - Versión Básica**

En la siguiente imagen se representa un diagrama básico de los casos de uso dentro del sistema. Se han modelado las funciones principales `calculoPesoIdeal` y `tasaMetabolicaBasal`.

Se ha utilizado una estructura jerárquica para facilitar futuras ampliaciones en el sistema, asegurando que cualquier funcionalidad adicional que requiera cálculos y entrada de datos pueda integrarse sin dificultad.

## **Diagrama de Casos de Uso - Versión Extendida**

Esta versión ampliada del diagrama incorpora dos nuevos métodos que también requieren datos ingresados por el usuario para realizar cálculos:

1. **Índice de Masa Corporal (IMC)**  
   - Se calcula mediante la fórmula:  
     ```
     IMC = peso / altura^2
     ```

2. **Frecuencia Cardíaca Máxima (FCM)**  
   - Fórmulas utilizadas:
     ```
     FCM_hombre = 220 - edad - (peso / 20)
     FCM_mujer = 226 - edad - (peso / 22)
     ```
   
   Donde:
   - `FCM_hombre` y `FCM_mujer` representan la frecuencia cardíaca máxima estimada para hombres y mujeres, respectivamente.
   - `edad` es la edad de la persona en años.
   - `peso` es el peso en kilogramos.

## **Especificación de Casos de Uso: Cálculo de Peso Ideal (AAA)**

### **Actor**
- **Usuario:** Desea conocer su peso ideal.

### **Acción**
1. El usuario selecciona la opción "Calcular Peso Ideal" en la aplicación.
2. El sistema solicita los datos necesarios.
3. El usuario introduce los valores requeridos.
4. El sistema procesa la información y aplica la fórmula.
5. El sistema muestra el resultado al usuario.

### **Ámbito**
- **Aplicación:** HealthCalc.
- **Precondiciones:**  
  - El usuario debe poder ejecutar la aplicación correctamente.
- **Garantías:**  
  - **Mínima:** Se muestra un mensaje de error si ocurre un problema.  
  - **Éxito:** Se devuelve el resultado del peso ideal.  
- **Disparador:** El usuario selecciona la opción de cálculo de peso ideal.

### **Extensiones**

- **3a. Entrada de datos inválida:**  
  - 3a.1. El sistema muestra un mensaje de error especificando los campos incorrectos.  
  - 3a.2. Se regresa al paso 2.  

- **4a. Resultado fuera de rango:**  
  - 4a.1. Se muestra un mensaje de error si el resultado es negativo o cero.  
  - 4a.2. Se regresa al paso 2.  

## **Gestión de Git y GitHub en la Práctica 2**

Para el desarrollo de esta práctica se han gestionado las versiones del proyecto utilizando Git y GitHub de la siguiente manera:

- Se creó la rama `practica1`, que contiene la primera versión estable del proyecto.
- Se generó una nueva rama `practica2`, donde se han desarrollado las nuevas funcionalidades.
- Hasta el momento, `practica2` aún no se ha fusionado con `main`, pero los cambios están disponibles en esta rama para revisión.

Este enfoque permite mantener un historial organizado y facilita la integración de nuevas mejoras sin afectar la versión principal del sistema.

## 🔄 Resultados de las Pruebas  

Las pruebas fueron ejecutadas correctamente, asegurando que la implementación es estable y cumple con los requerimientos.  


