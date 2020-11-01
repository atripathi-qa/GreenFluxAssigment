package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablesPage {

	public WebDriver driver;

	By headerText = By.xpath("//div[@class = 'example']/h3");

	By tableName = By.xpath("//table[@id = 'table1']//span[contains(text(), 'First Name')]");

	By columnTwo = By.xpath("//table[@id = 'table1']//tr[2]/td[2]");

	public TablesPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement isHeaderDisplayed() {
		return driver.findElement(headerText);
	}

	public WebElement tableSelected() {
		return driver.findElement(tableName);
	}

	public List<WebElement> columnSelected() {
		return driver.findElements(columnTwo);
	}

}
