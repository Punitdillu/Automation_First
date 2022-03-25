package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomation\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement logo=driver.findElement(By.cssSelector("div.atLogoImg"));
		if(logo.isDisplayed()) {
			System.out.println("logo is visible in login page");
		}
		else {
			System.out.println("logo is not visible in login page");

		}
		driver.close();
	}

}
