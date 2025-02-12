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

---

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
