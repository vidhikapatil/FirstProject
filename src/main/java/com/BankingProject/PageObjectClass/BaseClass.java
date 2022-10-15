package com.BankingProject.PageObjectClass;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.BankingProject.Utilities.ReadConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;




public  class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassword();

	public static WebDriver driver;
	
	
	public static ExtentSparkReporter sparkreport; 
	public static ExtentReports extent;
	public static ExtentTest test;
	
	static Random ran= new Random();
	static int x = ran.nextInt(123);
	@BeforeSuite
	public void setReport()
	{
	   sparkreport = new ExtentSparkReporter("C:\\Users\\hp\\New folder\\vidhika patil\\vidhika patil\\VP\\framework_of_automation\\Report\\htmlreport"+x+".html");
	    extent = new ExtentReports();
	    extent.attachReporter(sparkreport);
	    extent.setSystemInfo("Operating Syatem", "Windows");
	    extent.setSystemInfo("Enveronment", "QA");
	    sparkreport.config().setReportName("Integration Test Execution");
	    sparkreport.config().setDocumentTitle("QA Automation Testing Report");
	    sparkreport.config().setTheme(Theme.STANDARD);
	}
	
@Parameters("browser")
	@BeforeMethod
	public void initialization(String src) {
		if (src.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (src.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\hp\\Downloads\\geckodriver_win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (src.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Downloads\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}
    public static  String captureScreen() throws IOException
    {
    	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	String destination = "C:\\Users\\hp\\New folder\\vidhika patil\\vidhika patil\\VP\\framework_of_automation\\Screenshot"+x+".png";
        FileUtils.copyFile(source, new File(destination));
        return destination;
    }
    public void getTittle()
    {
    	String title = driver.getTitle();
    	System.out.println(title);
    }

	@AfterMethod
	public void closeBrower() {
		driver.quit();
	}
	@AfterSuite
	public void endReport()
	{
		extent.flush();
	}

	
	}


	
	


