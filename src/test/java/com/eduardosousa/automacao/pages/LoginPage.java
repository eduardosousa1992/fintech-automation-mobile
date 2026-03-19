package com.eduardosousa.automacao.pages;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.eduardosousa.automacao.core.DriverFactory;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import java.io.ByteArrayInputStream;

public class LoginPage {
    
    private AndroidDriver driver = DriverFactory.getDriver();

    // Método auxiliar para tirar print durante o passo
    private void tirarPrintNoPasso(String nomePasso) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment(nomePasso, new ByteArrayInputStream(screenshot));
    }

    @Step("Acessando o menu inicial 'Access'ibility'")
    public void acessarMenuPrincipal() {
        driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
        tirarPrintNoPasso("Após clicar em Access'ibility");
    }

    @Step("Selecionando o sub-menu Accessibility Node Provider")
    public void selecionarSubMenu() {
        driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider")).click();
        tirarPrintNoPasso("Tela do Node Provider");
    }
}