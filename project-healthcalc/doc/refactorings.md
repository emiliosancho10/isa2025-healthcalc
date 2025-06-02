# Documentación de Refactorings – Práctica 7

Este documento recoge los tres refactorings principales aplicados al proyecto HealthCalc para mejorar su mantenibilidad, modularidad y legibilidad, siguiendo las buenas prácticas del diseño orientado a objetos.

---

## 1. Refactoring: **Split Interface**

### ✴️ Bad Smell:
La interfaz `HealthCalc` agrupaba demasiadas responsabilidades (cálculo de peso ideal, IMC, TMB, etc.), violando el principio de segregación de interfaces.

### 🔧 Refactoring Aplicado:
Se dividió la interfaz `HealthCalc` en varias interfaces más específicas:
- `IdealWeightCalculator`
- `BMICalculator`
- `BMRCalculator`

La clase `HealthCalcImpl` ahora implementa todas ellas, permitiendo que otras clases dependan solo de la funcionalidad que necesitan.

### 📁 Categoría:
Diseño orientado a objetos (OO Design)

### 🎯 Objetivo:
Reducir el acoplamiento y aumentar la cohesión de las interfaces, facilitando su uso selectivo por parte de clientes que solo requieren parte de su funcionalidad.

---

## 2. Refactoring: **Extract Class**

### ✴️ Bad Smell:
La clase `HealthCalcImpl` contenía múltiples responsabilidades, incluyendo lógica de cálculo y validación de entrada.

### 🔧 Refactoring Aplicado:
Se extrajo una nueva clase `Validator` encargada únicamente de validar los parámetros de entrada (peso, altura, edad, género, etc.).

La clase `HealthCalcImpl` ahora delega la validación en esta nueva clase, lo que mejora la separación de responsabilidades.

### 📁 Categoría:
Diseño orientado a objetos (OO Design)

### 🎯 Objetivo:
Aplicar el principio de responsabilidad única (SRP) y mejorar la legibilidad y reutilización de código de validación.

---

## 3. Refactoring: **Rename Methods**

### ✴️ Bad Smell:
Algunos nombres de métodos eran ambiguos o no expresaban claramente su propósito, como `idealWeight` o `basalMetabolicRate`.

### 🔧 Refactoring Aplicado:
Se renombraron los métodos para que reflejaran mejor su funcionalidad:
- `idealWeight` → `calculateIdealWeight`
- `basalMetabolicRate` → `calculateBasalMetabolicRate`

Se actualizaron todas las referencias en el proyecto, incluyendo tests y controladores.

### 📁 Categoría:
Mejora de legibilidad (Naming / Clarity)

### 🎯 Objetivo:
Hacer el código más expresivo y autoexplicativo, facilitando su mantenimiento por otros desarrolladores.

---
