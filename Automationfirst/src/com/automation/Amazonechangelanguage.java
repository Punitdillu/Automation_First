package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonechangelanguage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.cssSelector("span.icp-nav-link-inner")).click();
	    WebElement language=driver.findElement(By.xpath("//input[@value='hi_IN']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(language).perform();
	    act.click(language).perform();
	   WebElement button= driver.findElement(By.cssSelector("input.a-button-input"));
	   act.click(button).perform();
	}

}
