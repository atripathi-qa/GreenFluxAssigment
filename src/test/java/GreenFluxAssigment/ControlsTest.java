package GreenFluxAssigment;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ControlPage;

public class ControlsTest extends TestBase {

	public WebDriver driver;

	@Test
	public void controls() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url-controls"));

		ControlPage controlPage = new ControlPage(driver);

		Assert.assertEquals(controlPage.isHeaderDisplayed().getText(), "Dynamic Controls");

		controlPage.isCheckboxSelected().click();
		controlPage.clickRemove().click();
		Assert.assertEquals(controlPage.goneMessage().getText(), "It's gone!");
		controlPage.clickEnable().click();
		Assert.assertEquals(controlPage.enabledGone().getText(), "It's enabled!");

	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		tearDownMain();
	}

}
