/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Jordan-Not
 */
public class Tradutor {

    private HashMap<String, Integer> operacoes = new HashMap<>();

    public Tradutor() {
        operacoes.put("+", 1);
        operacoes.put("-", 1);
        operacoes.put("/", 2);
        operacoes.put("*", 2);
    }

    public String traduzir(String expressaoNatural) {
        Stack pilha = new Stack();
        String expressaoPolonesa = "";
        
        for (String elemento : expressaoNatural.split(" ")) {
            if (operacoes.containsKey(elemento)) {
                if (!pilha.empty()) {
                    if (!pilha.peek().equals("(")) {                        
                        while (!pilha.empty() && operacoes.get((String)pilha.peek()) > operacoes.get(elemento)) {
                            expressaoPolonesa = expressaoPolonesa.concat((String) pilha.pop() + " ");                            
                        }
                    }
                }
                pilha.push(elemento);
            } else {
                if (elemento.equals("(")) {
                    pilha.push(elemento);
                } else {
                    if (elemento.equals(")")) {
                        while (!pilha.peek().equals("(")) {
                            expressaoPolonesa = expressaoPolonesa.concat((String) pilha.pop() + " ");
                        }
                        pilha.pop();
                    } else {
                        expressaoPolonesa = expressaoPolonesa.concat(elemento + " ");
                    }
                }
            }
        }

        while (!pilha.empty()) {
            expressaoPolonesa = expressaoPolonesa.concat((String) pilha.pop() + " ");
        }

        return expressaoPolonesa.substring(0, expressaoPolonesa.length() - 1);
    }

}
