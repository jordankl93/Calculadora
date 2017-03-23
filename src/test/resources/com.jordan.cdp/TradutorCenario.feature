Feature: Calculadora Polonesa
    Converte uma expressão natural em expressão polonesa para realizar uma operação matemática
 
Scenario Outline: convertendo um expressao natural para polonesa
    Given Eu tenho a expressao "<Expressao_natural>"
    When Eu quero converter para uma expressao polonesa
    Then Eu tenho como resultado "<Expressao_polonesa>"

Examples:
    | Expressao_natural | Expressao_polonesa |
    | ( 1 + 1 ) | 1 1 + | 
    | ( ( 1 + 1 ) * 2 ) | 1 1 + 2 * |
    | 2 * 3 + 4 * ( 5 - 6 ) | 2 3 * 4 5 6 - * + |
    | 2 * ( ( 3 + 4 ) + ( 5 - 6 ) ) | 2 3 4 + 5 6 - + * |