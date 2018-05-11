package com.qa.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestScripts_001 
{
	@Test
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\prabhu\\Selenium\\Driver\\chromedriver_win32(latest)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
