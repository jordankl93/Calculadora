/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cgt;

import com.jordan.cdp.Constante;
import com.jordan.cdp.Divisao;
import com.jordan.cdp.ExpressaoComposite;
import com.jordan.cdp.Multiplicacao;
import com.jordan.cdp.Operacao;
import com.jordan.cdp.Soma;
import com.jordan.cdp.Subtracao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Jordan
 */
public class AplCalcular {    
    private HashMap<String, Operacao> operacoes = new HashMap<>();

    public AplCalcular() {
        operacoes.put("+", new Soma());
        operacoes.put("-", new Subtracao());
        operacoes.put("/", new Divisao());
        operacoes.put("*", new Multiplicacao());
    }
    
    public int resultado (String expressaoPolonesa){
        Constante op1 = new Constante();
        Constante op2 = new Constante();
        ExpressaoComposite opr1 =  new ExpressaoComposite();
        Stack pilha = new Stack();
        
        for(String elemento : ConverterExpressao(expressaoPolonesa)){
            if(operacoes.containsKey(elemento)){
                if(pilha.size() >= 2){
                    op2.setValor((int)pilha.pop());
                    op1.setValor((int)pilha.pop());
                }
                opr1.setConstante1(op1);
                opr1.setConstante2(op2);
                opr1.setOperacao(operacoes.get(elemento));
                
                //empilhando o resultado da operacao
                pilha.push(opr1.resultado());
            }
            else
                pilha.push(Integer.parseInt(elemento));
        }
        
        //mostra o resultado na tela
        return (int) pilha.pop();     
    }
    
    private List<String> ConverterExpressao(String expressao){
        List<String> pilhaOperacao = new ArrayList<>();
        
        for(String elemento : expressao.split(" ")){
            pilhaOperacao.add(elemento);
        }
        
        return pilhaOperacao;
    }
    
}
