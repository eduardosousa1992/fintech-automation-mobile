package com.eduardosousa.automacao.steps;

import java.io.ByteArrayInputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.eduardosousa.automacao.core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {

    @After
    public void finalizarCenario(Scenario scenario) {
        // 1. Captura a Screenshot (A prova real do teste para auditoria)
        byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
        
        // 2. Define um nome estratégico para o anexo
        String status = scenario.isFailed() ? "FALHA" : "SUCESSO";
        String nomeEvidencia = "Evidência de " + status + " - Tela Final";

        // 3. Anexa o print ao relatório Allure
        Allure.addAttachment(nomeEvidencia, new ByteArrayInputStream(screenshot));
        
        System.out.println("LOG: Evidência visual anexada ao Allure para o cenário: " + scenario.getName());
    }
}