package com.BankingProject.TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BankingProject.PageObjectClass.BaseClass;
import com.BankingProject.PageObjectClass.LoginPage_POM;
import com.BankingProject.Utilities.getDataFromExel;

public class MultipleLoginVerification extends BaseClass {
	
	LoginPage_POM login;
    @Test
	public void FirstLoginTest() throws IOException, InterruptedException 
		{ 
		login = new LoginPage_POM(driver);
		Thread.sleep(2000);
		driver.get(baseURL);
		login.setUserName(getDataFromExel.getData(0, 0));
		login.setPassword(getDataFromExel.getData(0, 1));
		login.ClickOnSubmitButton();
		}
	@Test	
	public void SecondLoginTest() throws IOException, InterruptedException
	{
		login = new LoginPage_POM(driver);
		Thread.sleep(2000);
	driver.get(baseURL);
	login.setUserName(getDataFromExel.getData(1, 0));
	login.setPassword(getDataFromExel.getData(1, 1));
	login.ClickOnSubmitButton();
	}
	@Test
	public void ThirdLoginTest() throws IOException, InterruptedException
	{
		login = new LoginPage_POM(driver);
	driver.get(baseURL);
	login.setUserName(getDataFromExel.getData(2, 0));
	login.setPassword(getDataFromExel.getData(2, 1));
	login.ClickOnSubmitButton();
	}
	@Test
	public void FourthLoginTest() throws IOException, InterruptedException
	{
		login = new LoginPage_POM(driver);
	driver.get(baseURL);
	login.setUserName(getDataFromExel.getData(3, 0));
	login.setPassword(getDataFromExel.getData(3, 1));
	login.ClickOnSubmitButton();
	}
		
	
}

