package pagesObjects;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagina_LoginPage {
	
	@FindBy(xpath = "//li[@class='nav-item']//a[contains(text(),'Cadastre-se')]")
	private WebElement butCadastreSuperiorDireito;

	@FindBy(xpath = "//div[@class='w-full text-center p-t-30']//a[contains(text(),'Cadastre-se')]")
	private WebElement butCadastreInferiorCentro;

	@FindBy(name = "username")
	private WebElement inputNome;

	@FindBy(name = "pass")
	private WebElement inputSenha;

	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgAlerta;
	
	@FindBy(xpath = "(//div[contains(@data-validate,'Campo obrigatório')])[1]")
	private WebElement alertCampoObrigatorioUsuario;
	
	@FindBy(xpath = "(//div[contains(@data-validate,'Campo obrigatório')])[2]")
	private WebElement alertCampoObrigatorioSenha;
	
	@FindBy(xpath = "//button[contains(text(),'Entre')]")
	private WebElement butEntre;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement butLogin;
	
	
	//METODOS

	public void clicarBotaoCadastreSuperiorDireito(){
		butCadastreSuperiorDireito.click();
	}
	
	public void clicarBotaoCadastreInferiorCentro() {
		butCadastreInferiorCentro.click();
	}
	
	public void clicarBotaoEntre() {
		butEntre.click();
	}
	
	public void clicarLogin() {
		butLogin.click();
	}
	
	public void escreverUsuario(String usuario) {
		inputNome.sendKeys(usuario);
	}
	
	public void escreverSenha(String senha) {
		inputSenha.sendKeys(senha);
	
	}
	
	public void verificaMensagemAlerta(String mensagem) {
		//char(120) = ×
		assertEquals(mensagem, msgAlerta.getText().replaceAll("\\r\\n|\\n","").replaceAll("×", ""));
	}

	public void verificaCampoObrigatorioUsuario() {
		assertEquals(alertCampoObrigatorioUsuario.getAttribute("data-validate"), "Campo obrigatório");
	}	
	
	public void verificaCampoObrigatorioSenha() {
		assertEquals(alertCampoObrigatorioSenha.getAttribute("data-validate"), "Campo obrigatório");
	}
	
	public void verificaOsCamposVazios() {
		assertEquals(alertCampoObrigatorioUsuario.getAttribute("data-validate"), "Campo obrigatório");
		assertEquals(alertCampoObrigatorioSenha.getAttribute("data-validate"), "Campo obrigatório");
		
	}
	
	public void fazerLogin() {
		inputNome.sendKeys("Tomaz Henrique");
		inputSenha.sendKeys("12345678");
		butEntre.click();
	}
	
	
}
