package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatiorsEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_field")).sendKeys("Ajaykumar909");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Ajaykumar#321");
		Thread.sleep(2000);
		
		driver.findElement(By.className("header-logo"));
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("forgot-password"));
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("forgot"));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]"));
		Thread.sleep(2000);
	
			}
		
	}
	
	

		
		
		
		
		
		
		
		
	


