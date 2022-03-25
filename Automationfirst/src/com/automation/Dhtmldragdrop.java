package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dhtmldragdrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\chromedriver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement drga1=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement drop1=driver.findElement(By.xpath("//div[@id='box104']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drga1, drop1).perform();
		WebElement drga2=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement drop2=driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(drga2, drop2).perform();

		WebElement drga3=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement drop3=driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(drga3, drop3).perform();

		WebElement drga4=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement drop4=driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(drga4, drop4).perform();

		WebElement drga5=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement drop5=driver.findElement(By.xpath("//div[@id='box105']"));
		act.dragAndDrop(drga5, drop5).perform();

		WebElement drga6=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement drop6=driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(drga6, drop6).perform();

		WebElement drga7=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement drop7=driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(drga7, drop7).perform();



	}

}
