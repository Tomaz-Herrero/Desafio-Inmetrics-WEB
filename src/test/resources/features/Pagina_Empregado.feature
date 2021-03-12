#language: pt
#encoding: UTF-8
@Todos_PaginaEmpregado
Funcionalidade: Realizar testes funcionais na tela de empregados - https://inm-test-app.herokuapp.com/empregados/

  Contexto: 
    Dado que o usuario esteja logado no sistema da Inmetrics

  @PaginaCadastro_AdicionarFuncionario
  Cenario: Pagina - Empregados - Adicionar funcionario
    Quando o usuario clicar em Novo Funcionario
    E digitar as informacoes do empregado
    E clicar no botao Enviar
    Entao deve ser apresentar a mensagem de alerta "SUCESSO! Usuário cadastrado com sucesso"

  @PaginaCadastro_EditarFuncionario
  Cenario: Pagina - Empregados - Editar Funcionario
    Quando no campo de pesquisa eu pesquisar o usuario "Tomaz Henrique"
    E clicar em editar
    E queira editar o "Nome" para "Tomaz"
    E clicar no botao Enviar
    Entao deve ser apresentar a mensagem de alerta "SUCESSO! Informações atualizadas com sucesso"
