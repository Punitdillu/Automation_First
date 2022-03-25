package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Loginbyactionclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement loginbtn=driver.findElement(By.id("loginButton"));
		Actions act=new Actions(driver);
		act.sendKeys(un,"admin").sendKeys(pwd,"manager").click(loginbtn).build().perform();
		
		
		
	}

}
