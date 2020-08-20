package WebdriverManagerUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallDriverManager
{

	@Test
	public void test1()
	{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
//System.setProperty("webdriver.chrome.driver","C:\\Users\\vrshr\\workspace\\SeleniumProject\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver browser = new ChromeDriver();
		System.out.println("Execcuted this class");
		browser.quit();
		
		//firefox, opera, chromium, internet explorer
		
		/*WebDriverManager.chromiumdriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriverManager.operadriver().setup();*/
	}

}
