package com.eduardosousa.automacao.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            setupDriver();
        }
        return driver;
    }

    private static void setupDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        
        // Configurações baseadas na nossa infraestrutura atual
        options.setPlatformName("Android");
        options.setDeviceName("Celular_Automacao"); // Nome que demos ao AVD
        options.setAutomationName("UiAutomator2");
        
        // Caminho dinâmico para o APK
        options.setApp(System.getProperty("user.dir") + "/apps/app-debug.apk");

        try {
            // URL padrão do Appium Server que você iniciou na porta 4723
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (MalformedURLException e) {
            System.err.println("ERRO: URL do servidor Appium inválida.");
            e.printStackTrace();
        }
    }

    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}