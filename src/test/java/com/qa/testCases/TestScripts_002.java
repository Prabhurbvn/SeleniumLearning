package com.qa.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScripts_002 {
	
	public static WebDriver driver;
	
	@Test
	public void verifyPageTitle()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\prabhu\\Selenium\\Driver\\chromedriver_win32(latest)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String wb=driver.getTitle();

		
		Assert.assertEquals(wb, "Google.com");
		driver.close();
	}

}
