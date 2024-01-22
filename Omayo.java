package com.SeleniumPractise;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Omayo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
	// click to get alert
		
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	
	//confirmbox
		 driver.findElement(By.id("confirm")).click();
		 Thread.sleep(1000);
		 driver.switchTo().alert().getText();
		 Thread.sleep(1000);
		 System.out.println(driver.switchTo().alert().getText());
		 Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000); 	
	//getPrompt
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Ajaykumaragasani");	
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Benstokes");
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
