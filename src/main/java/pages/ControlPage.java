package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ControlPage {
	
	public WebDriver driver;
	
	By headerLogo = By.xpath("//div[@class = 'example']/h4");
	
	By checkbox = By.xpath("//input[@type = 'checkbox']");
	
	By removeButton = By.xpath("//form[@id = 'checkbox-example']/button[@type = 'button']");
	
	By checkboxGone = By.xpath("//form[@id = 'checkbox-example']/p");
	
	By enableButton = By.xpath("//form[@id = 'input-example']/button[@type = 'button']");
	
	By enabledMessage = By.xpath("//form[@id = 'input-example']/p");
	
	public ControlPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement isHeaderDisplayed() {
		return driver.findElement(headerLogo);
	}
	
	public WebElement isCheckboxSelected() {
		return driver.findElement(checkbox);
	}
	
	public WebElement clickRemove() {
		return driver.findElement(removeButton);
	}
	
	public WebElement goneMessage() {
		return driver.findElement(checkboxGone);
	}
	
	public WebElement clickEnable() {
		return driver.findElement(enableButton);
	}
	
	public WebElement enabledGone() {
		return driver.findElement(enabledMessage);
	}

}
