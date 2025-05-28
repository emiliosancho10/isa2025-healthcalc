# Práctica 6 – Patrones de Diseño en la Calculadora de Salud

## 🎯 Objetivo

El objetivo de esta práctica es aplicar diversos **patrones de diseño** a la calculadora de salud desarrollada en prácticas anteriores, mejorando su arquitectura en términos de reutilización, extensibilidad y mantenibilidad. Se han aplicado los siguientes patrones:

- 🧩 **Singleton** (apartado 2)
- 🔌 **Adapter** (apartado 3a)
- 🧠 **Strategy + Proxy** (apartado 3b)
- 🧱 **Bridge + Decorator** (apartado 3c)

---

## 🌿 Apartado 1: Gestión del repositorio

Se ha creado la rama `practica6` a partir de `practica5`. En ella se ha desarrollado toda la implementación de esta práctica, incluyendo el código fuente, los diagramas y este `README.md`.

---

## 🧩 Apartado 2: Patrón Singleton

Se ha aplicado el patrón Singleton a la clase `HealthCalcImpl`, garantizando que solo se cree una única instancia reutilizable durante toda la ejecución de la aplicación.

- **Interfaz**: `HealthCalc`
- **Clase Singleton**: `HealthCalcImpl`
- **Uso**: `HealthCalcImpl.getInstance()`
- **Diagrama UML**:  
  ![Singleton](design_patterns/diagrama_2_singleton.png)
- **Fuente UML**: `design_patterns/src/diagrama_2_singleton.puml`

---

## 🔌 Apartado 3a: Patrón Adapter

Se ha aplicado el patrón Adapter para adaptar la calculadora a una interfaz proporcionada por un sistema hospitalario (`HealthHospital`), manteniendo reutilizable la lógica de la calculadora original.

- **Interfaz externa**: `HealthHospital`
- **Adaptador creado**: `HealthAdapter`
- **Ubicación**: `healthcalc.adapter`
- **Prueba en**: `Main.java`
- **Diagrama UML**:  
  ![Adapter](design_patterns/adapter_healthhospital.png)
- **Fuente UML**: `design_patterns/src/adapter_healthhospital.vpp`

---

## 🧠 Apartado 3b: Patrón Strategy + Proxy

Se ha implementado el patrón Strategy para definir distintas estrategias de cálculo del BMR (por ejemplo, Harris-Benedict y Mifflin-St Jeor). Además, se ha utilizado un Proxy (`BMRCalculatorWithStats`) para registrar el uso anónimo de la calculadora y obtener estadísticas agregadas de los pacientes.

- **Paquetes**: `healthcalc.strategy`, `healthcalc.stats`
- **Clases clave**:
  - `BMRStrategy` (interfaz)
  - `HarrisBenedictStrategy`, `MifflinStJeorStrategy`
  - `BMRCalculator`
  - `BMRCalculatorWithStats`, `Paciente`
- **Prueba en**: `Main.java`
- **Diagrama UML**:  
  ![Strategy + Proxy](design_patterns/strategy_bmr_diagram.png)
- **Fuente UML**: `design_patterns/src/strategy_bmr_diagram.vpp`

---

## 🧱 Apartado 3c: Patrón Bridge + Decorator

Se ha diseñado una estructura extensible para soportar distintas unidades de medida (kilogramos/metros, libras/pies) y distintos idiomas (español e inglés) al generar el mensaje de salida. Para ello, se han aplicado los patrones Bridge (para las conversiones de unidades) y Decorator (para añadir el mensaje multilingüe).

- **Paquete**: `healthcalc.multilang`
- **Componentes**:
  - `UnitConverter` (interfaz), `EuropeanUnitConverter`, `AmericanUnitConverter`
  - `HealthCalculatorBase`
  - `HealthCalculatorWithMessageES`, `HealthCalculatorWithMessageEN`
- **Prueba en**: `Main.java`
- **Diagrama UML**:  
  ![Bridge + Decorator](design_patterns/diagrama_3c_bridge_decorator.png)
- **Fuente UML**: `design_patterns/src/diagrama_3c_bridge_decorator.puml`

---

## 📁 Estructura del proyecto

```plaintext
project-healthcalc/
├── design_patterns/
│   ├── diagrama_2_singleton.png
│   ├── adapter_healthhospital.png
│   ├── strategy_bmr_diagram.png
│   ├── diagrama_3c_bridge_decorator.png
│   └── src/
│       ├── diagrama_2_singleton.puml
│       ├── adapter_healthhospital.puml
│       ├── strategy_bmr_diagram.puml
│       └── diagrama_3c_bridge_decorator.puml
├── src/main/java/
│   ├── healthcalc/
│   ├── healthcalc/adapter/
│   ├── healthcalc/strategy/
│   ├── healthcalc/stats/
│   └── healthcalc/multilang/
└── pom.xml

## ✅ Conclusión

Se han aplicado correctamente cuatro patrones de diseño fundamentales integrados sobre la arquitectura del proyecto original, manteniendo separación de responsabilidades y favoreciendo su extensibilidad.

La práctica cumple con todos los requisitos del guion:

- ✔️ Implementación Java modular y probada
- ✔️ Diagramas UML en formato `.png` + fuente en `.vpp` o `.puml`
- ✔️ Código organizado por paquetes
- ✔️ Pruebas realizadas en la clase `Main.java`
- ✔️ Estructura del repositorio limpia y adecuada para entrega

> 📦 Proyecto listo para evaluación y entrega.
