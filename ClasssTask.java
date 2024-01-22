package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClasssTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hms.kareclouds.com/site/login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")); 
		Thread.sleep(2000);
		
		WebElement usrname = driver.findElement(By.id("email"));
		usrname.sendKeys("Superadmin@gmail.com");
		
		driver.findElement(By.id("password"));
		Thread.sleep(2000);
		
		WebElement usrname1 = driver.findElement(By.id("password"));
		usrname1.sendKeys("Admin@123");
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Radiology']"))).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input")).click();
		action.sendKeys("Masthann").build().perform();
		
		
		
	
		
		

	}

}
