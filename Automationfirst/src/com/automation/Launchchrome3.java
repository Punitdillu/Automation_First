package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		driver.findElement(By.partialLinkText("Log")).click();
		
	}

}
