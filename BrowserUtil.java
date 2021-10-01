package PageFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	public static WebDriver startBrowser(String browsertype, String url) {
		// TODO Auto-generated method stub
		 String driverpath = "C:\\Users\\Ruhi\\Desktop\\sel\\chromedriver_win32\\chromedriver.exe";
		WebDriver driver=null;
		switch (browsertype)
		{
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver=new ChromeDriver();
			break;
		default:
			break;
		}	
		driver.get(url);
		return driver;
	}

}



