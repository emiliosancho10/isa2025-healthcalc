# Calculadora de Salud  

Este proyecto implementa una calculadora de salud con las funciones de cálculo de peso ideal y tasa metabólica basal (*Basal Metabolic Rate* - BMR). Se ha desarrollado siguiendo la metodología de **Desarrollo Guiado por Pruebas** (*Test-Driven Development* - TDD), asegurando la calidad y fiabilidad del código mediante pruebas unitarias.

## 📌 Objetivos  
El objetivo principal ha sido implementar los métodos `idealWeight` y `basalMetabolicRate`, garantizando que funcionen correctamente a través de pruebas exhaustivas.  

### 🔹 Flujo de trabajo  
1. Definir los casos de prueba.  
2. Implementar los tests.  
3. Desarrollar los métodos y refinar el código según los resultados de los tests.  

---

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

---

## 🔄 Resultados de las Pruebas  

Las pruebas fueron ejecutadas correctamente, asegurando que la implementación es estable y cumple con los requerimientos.  

![Resultados de los Tests](Captura/test-results.png)