package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraValidation {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.myntra.com/");
	driver.findElement(By.cssSelector(".desktop-searchBar")).sendKeys("reebok shoes");
	driver.findElement(By.cssSelector("a.desktop-submit")).click();
	Thread.sleep(3000);
	
	String tittle=driver.findElement(By.cssSelector("div.title-container")).getText();
	System.out.println(tittle);
	//if(tittle.equals("Reebok Shoes"))
		if(tittle.contains("Reebok Shoes"))
	{
		System.out.println("tittle validation pass");
	}
	else {
		System.out.println("tittle validation fails");
	}
	driver.close();
	

}}
