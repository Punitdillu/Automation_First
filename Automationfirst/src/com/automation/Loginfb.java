package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfb {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("6204420515");
		driver.findElement(By.name("pass")).sendKeys("Punitranjan1@");
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.xpath("//div[@aria-label=\"Account Controls and Settings\"]/div[2]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("Ankit Singh Dhanraj");
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/ankit.s.dhanraj']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@style='transform: none;']")).click();
		
	}

}
