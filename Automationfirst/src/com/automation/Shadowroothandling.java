package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowroothandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");
		WebElement download=driver.findElement(By.xpath("//downloads-manager"));
		SearchContext root1=download.getShadowRoot();
		WebElement toolbar=root1.findElement(By.cssSelector("downloads-toolbar#toolbar"));
		SearchContext root2=toolbar.getShadowRoot();
		WebElement crtoolbar=root2.findElement(By.cssSelector("cr-toolbar#toolbar"));
		SearchContext root3=crtoolbar.getShadowRoot();
		WebElement searchfield=root3.findElement(By.cssSelector("cr-toolbar-search-field#search"));
		SearchContext root4=searchfield.getShadowRoot();
		root4.findElement(By.cssSelector("input#searchInput")).sendKeys("welcome");
		
	}

}
