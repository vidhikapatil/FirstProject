package com.BankingProject.TestClass;


import java.io.IOException;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.BankingProject.PageObjectClass.BaseClass;
import com.BankingProject.PageObjectClass.LoginPage_POM;
import com.aventstack.extentreports.Status;

public class LoginTestVerification extends BaseClass 
{
	@Test 
   public void LoginTest1() throws InterruptedException, IOException
   {
		LoginPage_POM login = new LoginPage_POM(driver);
	   
	   
	   test = extent.createTest("Verify application login");
	   driver.get(baseURL);	
	   test.log(Status.PASS, "Application URL Open Successfully");
	   
	   
	   login.setUserName(username);
	   test.log(Status.PASS, "username successfully entered");
	   
	   login.setPassword(password);
	   test.log(Status.PASS, "password successfully entered");
	   
	   login.ClickOnSubmitButton();
	   test.log(Status.PASS, "clicked on login button Successfully");
	   
	   
	   String expectedTitle = "Practice Test Automation";
	   String actualTitle = driver.getTitle();
	   
	   if(driver.getTitle().equals(expectedTitle))
	   {
		   test.log(Status.PASS,"title verified  and user successfully logged in to the aplication");
	   }else
       {
		 test.log(Status.FAIL,"log in failed");
		String screenshotpath =BaseClass.captureScreen();
		test.addScreenCaptureFromPath(screenshotpath);
		Thread.sleep(2000);
	   }
   }
}
