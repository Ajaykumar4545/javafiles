package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		WebElement osloBox = driver.findElement(By.id("box1"));
		Thread.sleep(2000);
		WebElement	norwaybox= driver.findElement(By.id("box101"));
		
		
		
		Actions action =new Actions(driver);
		action.dragAndDrop(osloBox, norwaybox).build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
