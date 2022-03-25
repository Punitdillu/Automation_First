package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHeadphone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).
		sendKeys("Boat bluetooth headphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String ratingpreview =driver.findElement
				(By.xpath("//span[@id='productRating_LSTACCFZ95M5JTZQH3F17C6KN_ACCFZ95M5JTZQH3F_']/..")).getText();
		System.out.println(ratingpreview);
	}

}
