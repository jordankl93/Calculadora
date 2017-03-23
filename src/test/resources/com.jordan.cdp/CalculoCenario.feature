Feature: Calcula o resultado de uma expressao matematica 
  Calcular o resultado da expressao informada. 
    
  Scenario: Informando a expressao 1 + 1
    Given Eu tenho a seguinte expressao "1 + 1"
    When Eu quero calcular o resultado 
    Then Eu tenho como resposta 2

  Scenario: Informando a expressao ( ( 1 + 1 ) * 2 )
    Given Eu tenho a seguinte expressao "( ( 1 + 1 ) * 2 )"
    When Eu quero calcular o resultado 
    Then Eu tenho como resposta 4

  Scenario: Informando a expressao 2 * ( ( 3 + 4 ) + ( 5 - 6 ) )
    Given Eu tenho a seguinte expressao "2 * ( ( 3 + 4 ) + ( 5 - 6 ) )"
    When Eu quero calcular o resultado 
    Then Eu tenho como resposta 12