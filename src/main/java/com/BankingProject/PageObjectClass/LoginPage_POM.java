package com.BankingProject.PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM
{    
	  public WebDriver ldriver;
    // @FindBy(xpath = "//input[@name='uid']")
   //  WebElement userID;
     //@FindBy(xpath = "//input[@name='password']")
   //  WebElement password;
    // @FindBy(xpath = "//input[@name='btnLogin']")
    // WebElement loginbutton;
    // @FindBy(xpath = "//input[@name='btnReset']")
     //WebElement resetbutton;
     
	     @FindBy(xpath = "//input[@id='username']")
	     WebElement username;
	     @FindBy(xpath = "//input[@id='password']")
	     WebElement password;
	     @FindBy(xpath = "//button[@id='submit']")
	     WebElement submitbutton;
	     
	  
   public LoginPage_POM (WebDriver rdriver)
     {
    	 ldriver = rdriver;
    	 PageFactory.initElements(rdriver, this); 
     }
      public void setUserName(String name)
      {
    	 username.sendKeys(name); 
      }
      public void setPassword(String pass)
      {
    	  password.sendKeys(pass);
      }
      public void ClickOnSubmitButton()
      {
    	  submitbutton.click();
      }
     // public void ClickOnResetButton()
     // {
    	//  resetbutton.click();
    //  }
}
