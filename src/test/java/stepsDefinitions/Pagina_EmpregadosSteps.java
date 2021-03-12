package stepsDefinitions;



import static utils.Utils.Na;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import pagesObjects.Pagina_EmpregadosPage;
import pagesObjects.Pagina_LoginPage;

public class Pagina_EmpregadosSteps {
	
	Pagina_EmpregadosPage pe = new Pagina_EmpregadosPage();

	@Dado("que o usuario esteja logado no sistema da Inmetrics")
	public void queOUsuarioEstejaLogadoNoSistemaDaInmetrics() {
		Na(Pagina_LoginPage.class).fazerLogin();
	}

	@Quando("o usuario clicar em Novo Funcionario")
	public void oUsuarioClicarEmNovoFuncionario() {
		pe.clicarNovoFuncionario();
	}

	@Quando("digitar as informacoes do empregado")
	public void digitarAsInformacoesDoEmpregado() {
		pe.cadastrarFuncionario();
	}

	@Quando("clicar no botao Enviar")
	public void clicarNoBotaoEnviar() {
		pe.clicarEnviar();
	}

	@E("^no campo de pesquisa eu pesquisar o usuario \"([^\"]*)\"$")
	public void noCampoDePesquisaEuPesquisarOUsuario(String arg1) throws Throwable {
		pe.localizarFuncionario(arg1);
	}

	@E("^clicar em editar$")
	public void clicarEmEditar() throws Throwable {
		pe.clicarEditarFuncionario();
	}

	@E("^queira editar o \"([^\"]*)\" para \"([^\"]*)\"$")
	public void queiraEditarOPara(String arg1, String arg2) throws Throwable {
		pe.editarFuncionario(arg1, arg2);
	}

}
