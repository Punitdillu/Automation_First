package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensionwebelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\SeleniumAutomation\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		Dimension d=username.getSize();
		System.out.println(d.getHeight()+"------"+d.getWidth());
		Point p=username.getLocation();
		System.out.println(p.getX()+"----"+p.getY());
		Rectangle rec=username.getRect();
		System.out.println("Height is:"+rec.getHeight());
		System.out.println("Width is:"+rec.getWidth());
		System.out.println("X distance:"+rec.getX());
		System.out.println("Y distance:"+rec.getY());
		
		driver.close();
		
		
	}

}
