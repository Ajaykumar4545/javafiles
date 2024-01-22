package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	
	
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Ajaykumar");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("modern")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='modal-close is-large']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
