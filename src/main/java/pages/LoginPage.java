package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By logoText = By.xpath("//div[@class = 'example']/h2");

	By userName = By.xpath("//input[@id = 'username']");

	By password = By.xpath("//input[@id = 'password']");

	By loginButton = By.xpath("//button[@type = 'submit']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement isLogoDisplayed() {
		return driver.findElement(logoText);
	}

	public WebElement getUserName() {
		return driver.findElement(userName);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}

}
