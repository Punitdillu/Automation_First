package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimevalidation {
	public static void main(String[] args) throws InterruptedException {
		int uniquenum=(int)(Math.random()*1000000);
		String name="Punit_Ranjan"+uniquenum;
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.addNewButton")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.newNameField ")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']"))
																			.sendKeys("Punit is new customer");
		driver.findElement(By.cssSelector("div.commitButtonPlaceHolder")).click();
	 Thread.sleep(2000);
	 	String Tittle=driver.findElement(By.cssSelector("div.titleEditButtonContainer")).getText();
	 	Thread.sleep(2000);
	 	if(Tittle.contains(name))
	 	{
	 		System.out.println("Validation pass");
	 	}
	 	else {
	 		System.out.println("Validation fail");
	 	}
	 	driver.close();
	}

}
