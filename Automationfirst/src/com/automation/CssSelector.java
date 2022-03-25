package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.className("initial")).click();
		Thread.sleep(3000);
		String tittletrack= driver.findElement(By.cssSelector("td.pagetitle")).getText();
		System.out.println(tittletrack);
		if(tittletrack.equals("Enter Time-Track"))
		{
			System.out.println("TimeTrack Validation pass");
		}
		else {
			System.out.println("TimeTrack Validation fails");
		}
	}

}
