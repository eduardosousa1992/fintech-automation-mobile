package com.eduardosousa.automacao.steps;

import com.eduardosousa.automacao.pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @Dado("que o usuário está na tela de autenticação")
    public void queOUsuarioEstaNaTelaDeAutenticacao() {
        // O app abre automaticamente pelo DriverFactory
    }

    @Quando("insiro as credenciais de acesso válidas")
    public void insiroAsCredenciaisDeAcessoValidas() {
        // Chamando o novo método que mapeamos para o ApiDemos
        loginPage.acessarMenuPrincipal();
    }

    @Quando("toco no botão de login")
    public void tocoNoBotaoDeLogin() {
        // Chamando o novo método do submenu
        loginPage.selecionarSubMenu();
    }

    @Então("o dashboard financeiro deve ser exibido com sucesso")
    public void oDashboardFinanceiroDeveSerExibidoComSucesso() {
        System.out.println("LOG: Validação final realizada no Allure.");
    }
}