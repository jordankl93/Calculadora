/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import com.jordan.cgt.AplCalcular;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Jordan-PC
 */
public class CalcularSteps {

    private String expressaoNatural = "";
    private String expressaoPolonesa = "";
    
    private int resultado;

    private Tradutor tradutor;
    private AplCalcular calcular;

    public CalcularSteps() {
        this.tradutor = new Tradutor();
        this.calcular = new AplCalcular();
    }

    @Given("^Eu tenho a seguinte expressao \"([^\"]*)\"$")
    public void euTenhoAExpressao(String expressao) throws Throwable {
        this.expressaoNatural = expressao;
    }

    @When("^Eu quero calcular o resultado$")
    public void euQueroCalcularOResultado() throws Throwable {
        expressaoPolonesa = tradutor.traduzir(expressaoNatural);
        resultado = calcular.resultado(expressaoPolonesa);
    }

    @Then("^Eu tenho como resposta (\\d+)$")
    public void euTenhoComoResposta(int resultadoEsperado) throws Throwable {
        assertThat(resultado, is(resultadoEsperado));
    }

}
