package mainpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import testcases.PageTitle;

public class MainClass {
	protected static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		launchBrowser();
		//commonFeatures();
		PageTitle.pageTitle();
		ParameterizeTestData.readingData();
		QuitBrowser.closeBrowserwindow();

	}
	public static void launchBrowser() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", LoadAndReadPropertiesFile.getValue("CHROME_PATH_LOCATION"));
		driver = new ChromeDriver();
		driver.get(LoadAndReadPropertiesFile.getValue("URL"));
		
	}
	public static void commonFeatures() {
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	

}
