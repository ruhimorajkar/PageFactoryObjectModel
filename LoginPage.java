/**
 * 
 */
package Uniform_Store_pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 //This class will store all the locators and methods of Login page
 
public class LoginPage {
WebDriver driver;	

By email= By.id("input-email");
By password = By.xpath("//*[@id=\"input-password\"]");
//By loginstatus = By.cssSelector("#flash");
By loginbutton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

By footerText = By.xpath("//*[contains(text(),'Uniform Store')]");


//creating parameterized constructor to initialize WebDriver reference
public LoginPage(WebDriver driver)
{
	this.driver =driver;
}


public void typeusername(String s)
{
	driver.findElement(email).sendKeys(s);
}

public void typepassword(String p) {
	driver.findElement(password).sendKeys(p);
}

public boolean isUsernameboxAvailable()
{

	if (driver.findElement(email).isDisplayed()) {
		return true;
	}
	else
	{
		return false;
	}
	
	}
public boolean isUsernameboxEnabled()
{

	if (driver.findElement(email).isEnabled()) {
		return true;
	}
	else
	{
		return false;
	}
	
	}

public boolean isPasswordboxEnabled()
{

	if (driver.findElement(password).isEnabled()) {
		return true;
	}
	else
	{
		return false;
	}
	
	}


public String readTitle()
{
         return driver.getTitle();
}

public Point  getPositionOfUsernamebox()   
{
	return driver.findElement(email).getLocation();
}

//public void clickLoginButton()
//{
//	driver.findElement(loginbutton).click();
//	HomePage home=new HomePage(driver);
//	System.out.println("Login success:" + home.checkLogoutButtonExists());
	
//}



public String getFooterString()
{
	
	//System.out.println(driver.findElement(footerText).getText());
	//return footerText.toString();
	//return driver.findElement(footerText).getText();
	String footerString;
	try {
		footerString=driver.findElement(footerText).getText();
	}
	catch(NoSuchElementException e)
	{
		footerString="Not found";
	}
	return footerString;
}

public boolean isFooterFound()

{
	
	boolean found=false;
	try {
		
		found=driver.findElement(footerText).isDisplayed();
	}
	
	catch (NoSuchElementException e)
	{
		found=false;
	}
	
	return found;
	
}	
}




