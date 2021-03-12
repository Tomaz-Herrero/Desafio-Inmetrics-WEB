#language: pt
#encoding: UTF-8
@Todos_PaginaCadastro
Funcionalidade: Realizar testes funcionais na tela de cadastro - https://inm-test-app.herokuapp.com/accounts/signup/

  Contexto: 
    Dado que seja acessado a pagina de login da Inmetrics

  @PaginaCadastro_NomeUsuarioMenorQueOito
  Cenario: Pagina - Cadastro - Nome de usuário menor que oito caracteres
    Quando o usuario visualizar a tela de login
    E der um clique em Cadastre-se
    E clicar no botao Cadastrar
    E inserir um nome de usuario menor que oito caracteres "1234567"
    Entao verifique a mensagem Aumente o texto para 8 caracteres ou mais. No momento, você está usando 2 caracteres).

  @PaginaCadastro_CamposNaoInformados
  Cenario: Pagina - Cadastro - Campos Obrigatórios
    Quando o usuario visualizar a tela de login
    E der um clique em Cadastre-se
    E clicar no botao Cadastrar
    Mas nao ter inserido nenhuma informacao
    Entao verifique a mensagem "Campo obrigatório" nos campos (Usuario, Senha e Confirmar Senha)

#Criar dataPoll para cadastro
  @PaginaCadastro_CadastrarUsuario
  Cenario: Pagina - Cadastro - Cadastar Usuario
    Quando o usuario visualizar a tela de login
    E der um clique em Cadastre-se
    E digitar no usuario "Tomaz Henrique Web"
    E na senha "12345678"
    E na confirmação de senha "12345678"
    E clicar no botao Cadastrar
    Entao a tela deve seguir para a lista de funcionarios

  @PaginaCadastro_UsuarioJaCadastrado
  Cenario: Pagina - Cadastro - Usuario já cadastrado
    Quando o usuario visualizar a tela de login
    E der um clique em Cadastre-se
    E digitar no usuario "Tomaz Henrique"
    E na senha "12345678"
    E na confirmação de senha "12345678"
    E clicar no botao Cadastrar
    Entao a tela deve apresentar a mensagem de "Usuário já cadastrado"

  @PaginaCadastro_SenhasDiferentes
  Cenario: Pagina - Cadastro - Senhas não combinam
    Quando o usuario visualizar a tela de login
    E der um clique em Cadastre-se
    E digitar no usuario "Tomaz Henrique"
    E na senha "123"
    E na confirmação de senha "345"
    E clicar no botao Cadastrar
    Entao a tela deve apresentar a mensagem "Senhas não combinam"
