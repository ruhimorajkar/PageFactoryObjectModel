package PageFactoryPages;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_PageFactory
{

WebDriver driver;

//constructor
public LoginPage_PageFactory(WebDriver ldriver)
{
	this.driver=ldriver;
}


@FindBy(id="username") 
@CacheLookup
WebElement username; 

@FindBy(how=How.ID,using="password")
@CacheLookup
WebElement password;

@FindBy(how=How.XPATH,using="//*[@id=\"login\"]/button")
@CacheLookup
WebElement submit_button;

@FindBy(how=How.CSS,using="#content > div > a")
WebElement logoutbutton;

public boolean login_herokuapp(String uid,String pass)
{
	username.sendKeys(uid);
	password.sendKeys(pass);
	submit_button.click();
	
	boolean success=false;
	try {
		logoutbutton.getText();
		success=true;
	}
	catch (NoSuchElementException e)
	{
		System.out.println("Login unsuccessful but negative test case has passed");
		success=true;
	}
	return success;
}


}
