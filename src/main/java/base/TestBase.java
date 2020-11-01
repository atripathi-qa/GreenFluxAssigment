package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.TestUtils;


public class TestBase {

	public WebDriver driver;
	public Properties prop;
	

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/config/config.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", TestUtils.WORKSAPCE_PATH + "//drivers//chromedriver.exe");
			driver = new ChromeDriver();   
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "F:\\Selenium data\\Firefoxdriver\\geckodriver");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	public void tearDownMain() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

}