package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(1000);
	
		//alertbox	
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(1000);
		System.out.println(	driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(1000); 		
		
		// confirm box
				
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		
		
		
	}

}
