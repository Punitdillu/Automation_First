package com.automation;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		String chromekey="webdriver.chrome.driver";
		String chromevalue="E:\\SeleniumAutomation\\ChromeDriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue)	;
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String tittle= driver.getTitle(); 
		System.out.println(tittle);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		//Options opt=driver.manage();
		//Window win= opt.window();
		//win.maximize();
		driver.manage().window().maximize();
	     Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		
		
		
		
	
	}
}


