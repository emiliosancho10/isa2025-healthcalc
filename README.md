# Práctica 7 - Refactorización del código HealthCalc

## 🔄 Objetivo

El objetivo de esta práctica es aplicar refactorizaciones al código de la calculadora de salud desarrollada previamente, con el fin de mejorar su claridad, mantenibilidad y extensibilidad. Para ello se han seguido los principios de refactorización definidos por Martin Fowler, aplicando "bad smells" reconocibles y usando patrones como "Extract Class", "Rename Method" y "Split Interface".

---

## 🔧 Refactorings principales aplicados

### 📝 1. Split Interface

**Bad smell**: Interface demasiado genérica.

**Refactoring aplicado**: No se ha dividido en interfaces múltiples, pero se ha mejorado la semántica de `HealthCalc` para que refleje métodos más descriptivos y específicos.

**Categoría**: Organización

**Motivo**: Aunque no se dividió en varias interfaces, los nombres de los métodos fueron mejorados para clarificar el propósito.

**Clase afectada**:

* `HealthCalc.java`

---

### ✍️ 2. Rename Methods

**Bad smell**: Nombres de métodos poco expresivos como `idealWeight()` o `basalMetabolicRate()`.

**Refactoring aplicado**: Renombrado a `calculateIdealWeight()` y `calculateBMR()` para mejorar la claridad y coherencia con el estándar Java.

**Categoría**: Comportamiento

**Motivo**: Mejora de legibilidad y comprensión del código.

**Clases afectadas**:

* `HealthCalc`
* `HealthCalcImpl`
* `HealthAdapter`
* Tests unitarios y de Cucumber

---

### 🛠️ 3. Extract Class

**Bad smell**: Clases con demasiadas responsabilidades ("God Class").

**Refactoring aplicado**: Extracción de los cálculos en clases independientes:

* `BMICalculator`: calcula el índice de masa corporal (IMC)
* `BMRCalculator`: calcula la tasa metabólica basal
* `IdealWeightCalculator`: calcula el peso ideal

**Categoría**: Comportamiento / organización

**Motivo**: Separar responsabilidades, facilitar testing y reutilización.

**Carpeta creada**: `healthcalc.calculators`

**Clases afectadas**:

* `HealthCalcImpl.java` modificada para delegar los cálculos

---


## 🎓 Validación de los refactorings

* ✅ El proyecto compila correctamente (`mvn clean install` finalizado con éxito tras las correcciones).
* ✅ La funcionalidad del sistema sigue siendo la misma.
* ✅ Los tests unitarios (`HealthCalcTest`) y los de Cucumber (`RunCucumberTest`) han sido adaptados.
* ✅ Se ha actualizado la clase `HealthAdapter` para usar los nuevos nombres de métodos.

---

## 📑 Documentación

El archivo `project-healthcalc/doc/refactorings.md` contiene la documentación detallada de los refactorings principales aplicados, incluyendo:

* Bad smell detectado
* Refactoring aplicado
* Categoría
* Motivo
* Clases afectadas

---

## 🔍 Commits y rama

* Rama creada: `practica7`
* Commits realizados siguiendo convenciones de `Conventional Commits` (feat:, refactor:, fix:, docs:)
* Commits atómicos y lógicos según los cambios realizados por refactoring

---

## ✅ Conclusión

Se han aplicado correctamente los principales refactorings solicitados en el guion, manteniendo el sistema funcional y bien documentado. Se han seguido buenas prácticas de desarrollo y uso adecuado de Git.
El código final es más modular, legible y mantenible.

