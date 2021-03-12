package stepsDefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Mas;
import pagesObjects.Pagina_CadastroPage;

public class Pagina_CadastroSteps {

	Pagina_CadastroPage cp = new Pagina_CadastroPage();

	@E("^der um clique em Cadastre-se$")
	public void derUmCliqueEmCadastreSe() throws Throwable {
		cp.clicarEmCadastreSe();
	}

	@E("^clicar no botao Cadastrar$")
	public void clicarNoBotaoCadastrar() throws Throwable {
		cp.clicarButCadastrar();
	}

	@Entao("^verifique a mensagem \"([^\"]*)\" nos campos \\(Usuario, Senha e Confirmar Senha\\)$")
	public void verifiqueAMensagemNosCamposUsuarioSenhaEConfirmarSenha(String arg1) throws Throwable {
		cp.verificarCamposObrigatorios(arg1);
	}

	@Mas("^nao ter inserido nenhuma informacao$")
	public void naoTerInseridoNenhumaInformacao() throws Throwable {
	}

	@E("^inserir um nome de usuario menor que oito caracteres \"([^\"]*)\"$")
	public void inserirUmNomeDeUsuarioMenorQueOitoCaracteres(String arg1) throws Throwable {
		cp.verificarCaracteresUsuario(arg1);
	}

	@Entao("^verifique a mensagem Aumente o texto para (\\d+) caracteres ou mais\\. No momento, você está usando (\\d+) caracteres\\)\\.$")
	public void verifiqueAMensagemAumenteOTextoParaCaracteresOuMaisNoMomentoVocêEstáUsandoCaracteres(int arg1, int arg2) {
	}

	@E("^digitar no usuario \"([^\"]*)\"$")
	public void digitarNoUsuario(String arg1) throws Throwable {
		cp.escreverUsuario(arg1);
	}

	@E("^na senha \"([^\"]*)\"$")
	public void naSenha(String arg1) throws Throwable {
		cp.escreverSenha(arg1);
	}

	@E("^na confirmação de senha \"([^\"]*)\"$")
	public void naConfirmaçãoDeSenha(String arg1) throws Throwable {
		cp.escreverConfirPass(arg1);
	}

	@Entao("^a tela deve seguir para a lista de funcionarios$")
	public void aTelaDeveSeguirParaAListaDeFuncionarios() throws Throwable {
		cp.verificarSeUsuarioLogou();
	}

	@Entao("^a tela deve apresentar a mensagem de \"([^\"]*)\"$")
	public void aTelaDeveApresentarAMensagemDe(String arg1) throws Throwable {
		cp.verificarMensagemCadastro(arg1);
	}

	@Entao("^a tela deve apresentar a mensagem \"([^\"]*)\"$")
	public void aTelaDeveApresentarAMensagem(String arg1) throws Throwable {
		cp.verificarMensagemSenha(arg1);
	}

}
