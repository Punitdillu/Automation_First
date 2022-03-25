package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errorcolorvalidation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomation\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement error=driver.findElement(By.className("errormsg"));
		
		if(error.getText().contains("Username or Password is invalid."))
		{
			System.out.println("Error text validation pass");
		}
		else 
		{
			System.out.println("Error text validation fail");
		}
		String colorcode=error.getCssValue("color");
		System.out.println(colorcode);
		if (colorcode.equals("rgba(206, 1, 0, 1)")) {
			System.out.println("Error color validation pass");
		}
		else {
			System.out.println("Error color validation fail");

		}
		String fontvalue=error.getCssValue("font");
		System.out.println(fontvalue);
		if(fontvalue.equals("13px / 16px Arial, Verdana, Helvetica, sans-serif")) {
			System.out.println("error font validation pass");
		}
		else {
			System.out.println("error font validation fail");
		}
		
		driver.close();
		
		
		
	}

}
