package pagesObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagina_CadastroPage {

	public Pagina_CadastroPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Cadastre-se')]")
	private WebElement linkCadastre_se;

	@FindBy(xpath = "//div[contains(@data-validate,'Campo obrigatório')]")
	private WebElement msgObrigatorioUsuario;

	@FindBy(xpath = "(//div[contains(@data-validate,'Campo obigatório')])[1]")
	private WebElement msgObrigatorioSenha;

	@FindBy(xpath = "(//div[contains(@data-validate,'Campo obigatório')])[2]")
	private WebElement msgObrigatorioConfirmSenha;

	@FindBy(name = "username")
	private WebElement inputNome;

	@FindBy(name = "pass")
	private WebElement inputSenha;
	
	@FindBy(name = "confirmpass")
	private WebElement inputConfirPass;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgAlerta;
	
	@FindBy(xpath = "//button[contains(text(),'Cadastrar')]")
	private WebElement butCadastro;
	
	@FindBy(xpath = "//div[@class=contains(text(),'Senhas não combinam')]")
	private WebElement msgSenhaNaoCombina;
	
	@FindBy(xpath = "//div[@class=contains(text(),'Usuário já cadastrado')]")
	private WebElement msgUsuarioCadastrado;

	
	
	

	// METODOS
	public void clicarEmCadastreSe() {
		linkCadastre_se.click();
	}
	
	public void escreverUsuario(String usu) {
		inputNome.sendKeys(usu);
	}
	
	public void escreverSenha(String pass) {
		inputSenha.sendKeys(pass);
	}
	public void escreverConfirPass(String confirmPass) {
		inputConfirPass.sendKeys(confirmPass);
	}
	
	public void verificarCamposObrigatorios(String mensagem) {
		assertEquals(msgObrigatorioUsuario.getAttribute("data-validate"), mensagem);
		assertEquals(msgObrigatorioSenha.getAttribute("data-validate"), mensagem);
		assertEquals(msgObrigatorioConfirmSenha.getAttribute("data-validate"), mensagem);
	}

	public void clicarButCadastrar() {
		butCadastro.click();
	}
	
	public void verificarCaracteresUsuario(String nome) throws Exception {
		inputNome.sendKeys(nome);
		assertTrue(nome.length() < 8);
		butCadastro.click();
//		Thread.sleep(5);
//		System.out.println("ShowValidate -> "+inputNome.getAttribute("showValidate"));
//		System.out.println("placeholder -> "+inputNome.getAttribute("placeholder"));
//		System.out.println("hiden -> "+inputNome.getAttribute("hiden"));
//		System.out.println("txtbox -> "+inputNome.getAttribute("txtbox"));
//		System.out.println("minlength ->" +inputNome.getAttribute("minlength"));
//		System.out.println("title ->" +inputNome.getCssValue("title"));
		//ESTUDAR COMO MAPEAR A VALIDAÇÃO DO HTML5
	}
	
	public void verificarSeUsuarioLogou() throws Exception {
		//Thread.sleep(300000);
		assertEquals("https://inm-test-app.herokuapp.com/empregados/", driver.getCurrentUrl());
		
	}
	
	public void verificarMensagemCadastro(String mensagem) throws Exception{
			assertEquals(msgUsuarioCadastrado.getText(), mensagem);
		}
	
	public void verificarMensagemSenha(String mensagem) throws Exception{
		assertEquals(msgSenhaNaoCombina.getText(), mensagem);
	}
}
