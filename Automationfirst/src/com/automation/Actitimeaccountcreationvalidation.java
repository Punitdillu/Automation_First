package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeaccountcreationvalidation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.cssSelector("div.withPlusIcon")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#createUserPanel_firstNameField")).sendKeys("Punit");
		driver.findElement(By.cssSelector("input#createUserPanel_lastNameField")).sendKeys("Ranjan");
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("dillurajranjan1@gmail.com");
		driver.findElement(By.xpath("//div[contains(@class,'simpleListMenuButton')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class = 'itemsContainer']/div[4]")).click();
		driver.findElement(By.xpath("//div[contains(@class , 'submitBtn')]")).click();
		Thread.sleep(2000);
		String invitation =driver.findElement(By.xpath("//div[@class='invitationInfo']")).getText();
		System.out.println(invitation);
		if(invitation.equals("The invitation has been sent to the user's email address: dillurajranjan1@gmail.com")) {
			System.out.println("invitation Validation pass");
		}
		else {
			System.out.println("invitation Validation Fail");
		}
		driver.close();
	}

}
