package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Bluestar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='bluestar']")).click();
		String value=driver.findElement(By.cssSelector("div.appbar")).getText();
		System.out.println(value);
		if(value.contains("About")) {
			System.out.println("Bluestar validation pass");
		}
		else {
			System.out.println("Bluestar validation fail");
		}
		driver.close();
			
		
	}

}
