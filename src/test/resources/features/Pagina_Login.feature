#language: pt
#encoding: UTF-8
@Todos_PaginaLogin
Funcionalidade: Realizar testes funcionais na tela de login - https://inm-test-app.herokuapp.com/accounts/login/

  Contexto: 
    Dado que seja acessado a pagina de login da Inmetrics

  @PaginaLoginUsuarioESenhaNaoInformados
  Cenario: Pagina - Login - Usuário e Senha não informados
    Quando o usuario visualizar a tela de login
    Mas nao entrar com o usuario ou senha
    E der um clique no botao Entre
    Entao deve ser apresentado nos campos Login e Senha "Campo obrigatório"

  @PaginaLoginSomenteUsuarioInformado
  Cenario: Pagina - Login - Somente usuario informado
    Quando o usuario visualizar a tela de login
    E informar no campo usuario "Tomaz"
    E der um clique no botao Entre
    Entao deve ser apresentado no campo senha "Campo obrigatório"

  @PaginaLoginSomenteSenhaInformada
  Cenario: Pagina - Login - Somente senha informada
    Quando o usuario visualizar a tela de login
    E informar no campo senha "Teste"
    E der um clique no botao Entre
    Entao deve ser apresentado no campo usuario "Campo obrigatório"

  @PaginaLoginUsuarioESenhaIncorretos
  Cenario: Pagina - Login - Usuario e Senha Inválidos
    Quando o usuario visualizar a tela de login
    E informar no campo usuario "Tomaz"
    E informar no campo senha "Teste"
    E der um clique no botao Entre
    Entao deve ser apresentar a mensagem de alerta "ERRO! Usuário ou Senha inválidos"
