package PageFactoryTestCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactoryPages.BrowserUtil;
import PageFactoryPages.LoginPage_PageFactory;


public class VerifyValidLogin_PF 
{


@Test
public void checkValidUser()
{

// This will launch browser and specific url 
WebDriver driver=BrowserUtil.startBrowser("chrome", "http://the-internet.herokuapp.com/login");

// Created Page Object using Page Factory


LoginPage_PageFactory login_page=PageFactory.initElements(driver, LoginPage_PageFactory.class);

// Call the method

boolean tcsuccess=false;

tcsuccess=login_page.login_herokuapp("tomsmith", "SuperSecretPassword!");

AssertJUnit.assertEquals(tcsuccess, true);
}



}