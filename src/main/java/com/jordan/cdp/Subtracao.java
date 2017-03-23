/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

/**
 *
 * @author Jordan
 */
public class Subtracao implements Operacao{
    
    @Override
    public int Calcular(Expressao constante1, Expressao constante2) {
         return constante1.resultado() - constante2.resultado();
    }
    
}
