package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usecssvalue {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\SeleniumAutomation\\\\\\\\chromedriver2\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		WebElement error= driver.findElement(By.className("errormsg"));
		
			String colorcode=error.getCssValue("color");
			String fontvalue=error.getCssValue("font");
			System.out.println(colorcode);
			System.out.println(fontvalue);
		
		driver.close();
		
	}

}
