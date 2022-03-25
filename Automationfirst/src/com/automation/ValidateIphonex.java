package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateIphonex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Iphone x");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		String inventary= driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println("Inventary is :"+inventary);
		driver.close();
	}

}
