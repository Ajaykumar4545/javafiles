package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sellll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("radio1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkbox1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("textbox1")).clear();
		Thread.sleep(2000);
				
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("textbox1"))).click().perform();

		WebElement usrname1 = driver.findElement(By.id("textbox1"));
		usrname1.sendKeys("Ajaykumar");
		
		WebElement usrname2 = driver.findElement(By.id("prompt"));
		usrname2.click();
		usrname2.sendKeys("hahaha");
		
	
	
	}

}
