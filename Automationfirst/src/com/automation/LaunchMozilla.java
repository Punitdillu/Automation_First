package com.automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMozilla {
	public static void main(String[] args) {
		String chromekey="webdriver.gecko.driver";
		String chromevalue="E:\\SeleniumAutomation\\mozillaDriver\\geckodriver.exe";
		System.setProperty(chromekey, chromevalue)	;
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}

}
