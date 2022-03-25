package com.automation;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginactitimebyjavascript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.querySelector('input#username').setAttribute('value','admin');");
		jse.executeScript("document.querySelector(\"input[name='pwd']\").setAttribute('value','manager');\r\n"
				+ "\r\n"
				+ "");
		Object obj=jse.executeScript("return document.querySelector('a#loginButton')");
		WebElement ele=(WebElement)obj;
		ele.click();
	}

}
