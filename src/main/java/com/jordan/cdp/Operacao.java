/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

/**
 *
 * @author Jordan
 * 
 * Utilizando padrão de projeto Strategy
 */
public interface Operacao {
    
    public int Calcular(Expressao constante1, Expressao constante2);
    
}
