package stepsDefinitions;

import static utils.Utils.Na;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pagesObjects.Pagina_LoginPage;


public class Pagina_LoginSteps {

	@Dado("que seja acessado a pagina de login da Inmetrics")
	public void sejaAcessadoAPaginaDeLoginDaInmetrics() {
		
	}

	@Quando("o usuario visualizar a tela de login")
	public void oUsuarioEntrarNaTelaDeLogin() {		
	}

	@Quando("nao entrar com o usuario ou senha")
	public void naoEntrarComOUsuarioOuSenha() {
		
	}
	
	@E("^der um clique no botao Entre$")
	public void derUmCliqueNoBotaoEntre() throws Throwable {
		Na(Pagina_LoginPage.class).clicarBotaoEntre();
		
	}

	@Entao("^deve ser apresentado no campo senha \"([^\"]*)\"$")
	public void deveSerApresentadoNoCampoSenha(String arg1) throws Throwable {
		Na(Pagina_LoginPage.class).verificaCampoObrigatorioSenha();
	}

	@Entao("^deve ser apresentado nos campos Login e Senha \"([^\"]*)\"$")
	public void deveSerApresentadoNosCamposLoginESenha(String arg1) throws Throwable {
		Na(Pagina_LoginPage.class).verificaOsCamposVazios();
	}

	@Entao("^deve ser apresentado no campo usuario \"([^\"]*)\"$")
	public void deveSerApresentadoNoCampoUsuario(String arg1) throws Throwable {
		Na(Pagina_LoginPage.class).verificaCampoObrigatorioUsuario();
	}

	@E("^informar no campo usuario \"([^\"]*)\"$")
	public void informarNoCampoUsuario(String arg1) throws Throwable {
		Na(Pagina_LoginPage.class).escreverUsuario(arg1);
	}

	@E("^informar no campo senha \"([^\"]*)\"$")
	public void informarNoCampoSenha(String arg1) throws Throwable {
		Na(Pagina_LoginPage.class).escreverSenha(arg1);
	}

	@Entao("^deve ser apresentar a mensagem de alerta \"([^\"]*)\"$")
	public void deveSerApresentarAMensagemDeAlerta(String arg1) throws Throwable {
		Na(Pagina_LoginPage.class).verificaMensagemAlerta(arg1);
	}



}
