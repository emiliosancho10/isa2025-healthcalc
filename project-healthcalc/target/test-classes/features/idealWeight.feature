Feature: Cálculo del peso ideal

  Como usuario
  Quiero calcular mi peso ideal
  Para conocer un objetivo saludable basado en mi altura y sexo

  Scenario: Usuario introduce datos válidos para calcular peso ideal
    Given que el usuario quiere calcular su peso ideal
    When introduce su altura como 1.75 y su sexo como "hombre"
    Then el sistema devuelve su peso ideal

  Scenario: Usuario introduce una altura no válida
    Given que el usuario quiere calcular su peso ideal
    When introduce una altura negativa
    Then el sistema muestra un mensaje de error indicando que la altura no es válida
