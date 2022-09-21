package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


 public class FirefoxBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		 launchBrowser();
		 navigate();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "F:\\ExampleAutomation\\Automation\\Web_automation\\library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
		     e.printStackTrace();
		     
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
			oBrowser.manage().window().maximize();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			
			oBrowser.findElement(By.linkText("Login")).click();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
