package pagesObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagina_EmpregadosPage {

	// super
	public Pagina_EmpregadosPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Novo Funcionário')]")
	private WebElement linkNovoFuncionario;

	@FindBy(id = "inputNome")
	private WebElement inputNome;

	@FindBy(id = "cpf")
	private WebElement inputCPF;

	@FindBy(id = "slctSexo")
	private WebElement inputSexo;

	@FindBy(id = "inputAdmissao")
	private WebElement inputAdmissao;

	@FindBy(id = "inputCargo")
	private WebElement inputCargo;

	@FindBy(id = "dinheiro")
	private WebElement inputDinheiro;

	@FindBy(id = "clt")
	private WebElement radCLT;

	@FindBy(id = "pj")
	private WebElement radtPJ;

	@FindBy(id = "tabela_info")
	private WebElement infoTabela;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement butEnviar;

	@FindBy(xpath = "//td[contains(text(),'Tomaz')]//..//button[@class='btn btn-warning']")
	private WebElement butEditarFuncionario;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement inputLocalizarFuncionario;

	// METODOS
	public void clicarNovoFuncionario() {
		linkNovoFuncionario.click();
	}

	public void cadastrarFuncionario() {
		inputNome.sendKeys("Tomaz Henrique");
		inputCPF.sendKeys("760.824.880-75");
		inputSexo.sendKeys("Masculino");
		inputAdmissao.sendKeys("19/02/2021");
		inputCargo.sendKeys("Analista de Teste");
		inputDinheiro.sendKeys("600000");
		radCLT.click();
		radtPJ.click();
	}

	public void clicarEnviar() {
		butEnviar.click();
		System.out.println("teste");
	}

	public void clicarEditarFuncionario() throws InterruptedException {
		butEditarFuncionario.click();
	}

	public void localizarFuncionario(String nome) throws Exception {
		inputLocalizarFuncionario.sendKeys(nome);

	}

	public void editarFuncionario(String opc, String novoValor) {
		if (opc.equals("Nome")) {
			inputNome.clear();
			inputNome.sendKeys(novoValor);
		
		} else if (opc.equals("CPF")) {
			inputCPF.clear();
			inputCPF.sendKeys(novoValor);
		
		} else if (opc.equals("Cargo")) {

		}
	}
}
