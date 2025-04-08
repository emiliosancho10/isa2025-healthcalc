Feature: Cálculo de la tasa metabólica basal

  Como usuario
  Quiero calcular mi tasa metabólica basal
  Para saber cuántas calorías necesita mi cuerpo diariamente en reposo

  Scenario: Usuario introduce datos válidos para calcular tasa metabólica basal
    Given que el usuario quiere calcular su tasa metabólica basal
    When introduce su peso como 70, su altura como 1.75, su sexo como "hombre" y su edad como 30
    Then el sistema devuelve su tasa metabólica basal

  Scenario: Usuario introduce una edad negativa
    Given que el usuario quiere calcular su tasa metabólica basal
    When introduce una edad negativa
    Then el sistema muestra un mensaje de error indicando que la edad no es válida
