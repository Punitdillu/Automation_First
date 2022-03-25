package com.automation;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome2 {
	public static void main(String[] args) {
		String chromekey="webdriver.chrome.driver";
		String chromevalue="E:\\SeleniumAutomation\\ChromeDriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue)	;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//Options opt= driver.manage();
		//Window win=  opt.window();
	   // win.setSize(Dimension d);
		//Dimension d= new Dimension(100,200);
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
	}

}
