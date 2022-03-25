package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWatch {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Watch");
	driver.findElement(By.xpath("//span[contains(@class,'desktop-iconSearch')]")).click();
	String price=driver.findElement(By.xpath("//ul[@class='results-base']//a/div[2]/div/span/span")).getText();
	System.out.println(price);
	driver.close();
	
}

}
