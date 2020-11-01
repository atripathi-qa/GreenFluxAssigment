package GreenFluxAssigment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import base.TestBase;
import pages.TablesPage;

public class TablesTest extends TestBase {

	public WebDriver driver;

	@Test
	public void Table() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url-table"));

		TablesPage tablesPage = new TablesPage(driver);

		Assert.assertEquals(tablesPage.isHeaderDisplayed().getText(), "Data Tables");

		tablesPage.tableSelected().click();
		List<WebElement> tableElements = tablesPage.columnSelected();

		ArrayList<String> tableValues = new ArrayList<String>();
		for (int i = 0; i < tableElements.size(); i++) {
			String str = tableElements.get(i).getText();
			tableValues.add(str);
		}

		ArrayList<String> referenceValues = new ArrayList<String>();
		for (int i = 0; i < tableValues.size(); i++) {
			referenceValues.add(tableValues.get(i));
		}

		Collections.sort(referenceValues);

		assert referenceValues.equals(tableValues);

	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		tearDownMain();
	}

}
