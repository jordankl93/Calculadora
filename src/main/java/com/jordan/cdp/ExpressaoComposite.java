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
public class ExpressaoComposite implements Expressao{
    private Operacao operacao;
    private Expressao constante1, constante2;
    
    public ExpressaoComposite() {
        this.operacao = new Soma();
    }
    
    public ExpressaoComposite(Operacao operacao, Expressao constante1, Expressao constante2) {
        this.operacao = operacao;
        this.constante1 = constante1;
        this.constante2 = constante2;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }    

    public void setConstante1(Expressao constante1) {
        this.constante1 = constante1;
    }

    public void setConstante2(Expressao constante2) {
        this.constante2 = constante2;
    }
        
    @Override
    public int resultado() {
        return operacao.Calcular(this.constante1, this.constante2);
    }
       
    @Override
    public String toString(){
        return "(" + this.constante1.resultado() + " " + " (+ - / *) " + " " + this.constante2.resultado() + ")";
    }
    
}
