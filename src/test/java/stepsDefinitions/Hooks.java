package stepsDefinitions;


import static utils.Utils.acessarSistema;
import static utils.Utils.capturarScreenshot;
import static utils.Utils.driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		acessarSistema();
	}
	

	@After
	public void tearDown(Scenario scenario) throws Exception {
		capturarScreenshot(scenario);
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}
}
