package GreenFluxAssigment;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginTest extends TestBase {

	public WebDriver driver;

	@Test
	public void login() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url-login"));

		LoginPage loginPage = new LoginPage(driver);

		Assert.assertEquals(loginPage.isLogoDisplayed().getText(), "Login Page");

		loginPage.getUserName().sendKeys("tomsmith");
		loginPage.getPassword().sendKeys("SuperSecretPassword!");
		loginPage.getLoginButton().click();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		tearDownMain();
	}

}
