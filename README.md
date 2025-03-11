 HEAD
 HEAD
# Práctica 4 - Interfaz Gráfica en Java (MVC + Swing)

📌 **Objetivos**  
El objetivo principal de esta práctica ha sido implementar una interfaz gráfica funcional para la calculadora de salud desarrollada en las prácticas anteriores. Se ha seguido el patrón de diseño **Modelo-Vista-Controlador (MVC)**, utilizando **Java + Swing**, con una estructura de proyecto organizada y modular.



🖌️ **Diseño de Interfaz (Mockup)**  
Se ha diseñado un prototipo previo de la interfaz gráfica utilizando una herramienta de diseño, que refleja las principales historias de usuario del sistema. Este mockup puede encontrarse en:

```
doc/mockup.png
```



💻 **Implementación técnica**  

- Se ha desarrollado una interfaz gráfica con Java Swing, utilizando `JFrame`, `JTextField`, `JLabel`, `JButton`, `JComboBox` y `JTextArea`, entre otros componentes.
- Se ha seguido fielmente el patrón **MVC**:
  - **Modelo**: clase `HealthCalc` con la lógica de negocio (peso ideal, TMB, IMC, RMC).
  - **Vista**: `HealthCalcView` e interfaz `IHealthCalcView` para la interacción.
  - **Controlador**: `HealthCalcController` gestiona los eventos y errores.
- El código fuente se ha organizado en paquetes:
  - `model/`
  - `view/`
  - `controller/`
- El proyecto incluye una clase `Main` para lanzar la aplicación.



🧪 **Pruebas y Control de Errores**  
- Se ha validado que todos los campos numéricos se introducen correctamente (altura, peso, edad).
- Se controlan errores como campos vacíos, datos no válidos o conversiones erróneas.
- Se muestran mensajes de error claros mediante `JOptionPane`.



📦 **Exportación del Proyecto**  

Se ha generado un archivo `.jar` ejecutable a partir del proyecto con Maven. Para ejecutarlo:

```bash
java -jar target/HealthCalc-0.0.1-SNAPSHOT.jar
```

📁 El archivo `.jar` se encuentra en:

```
target/HealthCalc-0.0.1-SNAPSHOT.jar
```



📚 **Estructura del Proyecto**  
```
project-healthcalc/
├── src/
│   └── main/
│       └── java/
│           └── uma/
│               └── isa/
│                   └── healthcalc/
│                       ├── model/
│                       ├── view/
│                       ├── controller/
│                       └── Main.java
├── pom.xml
└── doc/
    └── mockup.png
```



✅ **Resumen**  
La aplicación se ha implementado con éxito utilizando Swing y el patrón MVC. Se ha validado su funcionalidad, el control de errores y su correcta empaquetación en un `.jar`. Se ha seguido un flujo de trabajo organizado mediante ramas, commits descriptivos y estructura modular.

# isa2025-healthcalc
Health calculator used in Ingeniería del Software Avanzada
 19752dc (Initial commit)


# Calculadora de Salud  

Este proyecto implementa una calculadora de salud con las funciones de cálculo de peso ideal y tasa metabólica basal (*Basal Metabolic Rate* - BMR). Se ha desarrollado siguiendo la metodología de **Desarrollo Guiado por Pruebas** (*Test-Driven Development* - TDD), asegurando la calidad y fiabilidad del código mediante pruebas unitarias.

## 📌 Objetivos  
El objetivo principal ha sido implementar los métodos `idealWeight` y `basalMetabolicRate`, garantizando que funcionen correctamente a través de pruebas exhaustivas.  

### 🔹 Flujo de trabajo  
1. Definir los casos de prueba.  
2. Implementar los tests.  
3. Desarrollar los métodos y refinar el código según los resultados de los tests.  



## 🧪 Pruebas Implementadas  

Se han desarrollado pruebas siguiendo **dos enfoques**:  

🔹 **Caja Negra**: Se verifican los resultados sin conocer la implementación interna.  
🔹 **Caja Blanca**: Se examinan caminos internos del código para asegurar una correcta ejecución.  

### ✅ Tests para `idealWeight()`  
- **Altura negativa / Altura cero** → Debe lanzar una excepción.  
- **Peso ideal negativo** → No debe ser posible.  
- **Altura fuera de rango** → Se previene overflow en cálculos.  
- **Género no válido** → Solo se aceptan valores específicos.  
- **Cálculo correcto de peso ideal** para hombres y mujeres.  

### ✅ Tests para `basalMetabolicRate()`  
- **Altura, peso o edad negativos / cero** → Debe lanzar una excepción.  
- **Valores fuera de rango** → Se previenen desbordamientos en cálculos.  
- **Género no válido** → Se valida correctamente la entrada.  
- **Cálculo correcto de BMR** según las fórmulas establecidas.  



## 🔄 Resultados de las Pruebas  

Las pruebas fueron ejecutadas correctamente, asegurando que la implementación es estable y cumple con los requerimientos.  

HEAD
![Resultados de los Tests](Captura/test-results.png)
 d1fe7a0 (Subiendo proyecto isa2025-healthcalc)


![Descripción de la imagen](Captura)
6cbf1dc (Update README.md)
