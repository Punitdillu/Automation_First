package com.automation;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {
	public static void main(String[] args) {
		
		String edgekey="webdriver.edge.driver";
		String edgevalue="E:\\SeleniumAutomation\\edgeDriver\\msedgeDriver.exe";
		System.setProperty(edgekey, edgevalue);
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
	}

}
