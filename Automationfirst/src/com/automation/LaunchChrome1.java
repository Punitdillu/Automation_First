package com.automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome1 {
	public static void main(String[] args) {
		String chromekey="webdriver.chrome.driver";
		String chromevalue="E:\\SeleniumAutomation\\ChromeDriver\\chromedriver.exe";
		System.setProperty(chromekey, chromevalue)	;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}


