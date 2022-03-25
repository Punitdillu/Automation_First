package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.className("btn-orange")).click();
		String text= driver.findElement(By.className("description")).getText();
		System.out.println("Text is :"+text);
		driver.close();
	}

}
