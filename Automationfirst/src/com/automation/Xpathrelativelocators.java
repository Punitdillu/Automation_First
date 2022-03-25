package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Xpathrelativelocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomation\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement passwrd= driver.findElement(By.name("pwd"));
		Thread.sleep(3000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(passwrd)).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(passwrd)).click();
		WebElement chkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(chkbox)).click();
		
	}

}
