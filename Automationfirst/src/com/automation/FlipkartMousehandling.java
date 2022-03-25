package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMousehandling {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement fashion=driver.findElement(By.xpath("//div[text()='Fashion']"));
	Actions act=new Actions(driver);
	act.moveToElement(fashion).perform();
}

}
