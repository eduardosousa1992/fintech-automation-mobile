# language: pt
@Regressivo @Sprint01
Funcionalidade: Login no Aplicativo Fintech
  Como um usuário da plataforma financeira
  Quero realizar a autenticação segura
  Para gerenciar meus investimentos e saldo

  # Tag simulando rastreabilidade genérica (X-Ray Ready)
  @ID_FIN_001 @SmokeTest
  Cenário: Validar login com sucesso
    Dado que o usuário está na tela de autenticação
    Quando insiro as credenciais de acesso válidas
    E toco no botão de login
    Então o dashboard financeiro deve ser exibido com sucesso