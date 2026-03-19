package br.com.bradesco.automacao.core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {
    
    // Variável estática para garantir que o Driver seja único na execução (Singleton)
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            setupDriver();
        }
        return driver;
    }

    private static void setupDriver() {
        // TEORIA: Desired Capabilities (O contrato com o dispositivo)
        UiAutomator2Options options = new UiAutomator2Options();
        
        options.setPlatformName("Android");
        options.setDeviceName("Emulador_Android"); // Nome do device no seu PC ou Mobile Center
        options.setAutomationName("UiAutomator2");
        
        // Caminho do APK (Simulando o binário que viria da Pipeline)
        options.setApp("C:/Users/eduar/Downloads/app-bradesco-homolog.apk");

        try {
            // URL padrão do servidor Appium Local. 
            // Na Pipeline do Mobile Center, trocaríamos esta URL por uma variável de ambiente.
            URL url = new URL("http://127.0.0.1:4723/");
            driver = new AndroidDriver(url, options);
            
            // Wait Implícito: Aguarda elementos por até 10s antes de falhar
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
        } catch (MalformedURLException e) {
            System.err.println("ERRO CRÍTICO: URL do servidor Appium inválida.");
            e.printStackTrace();
        }
    }

    public static void killDriver() {
        if (driver != null) {
            driver.quit(); // Encerra a sessão e libera o hardware
            driver = null;
        }
    }
}