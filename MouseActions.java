package com.SeleniumPractise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		Actions ajay = new Actions(driver);
		ajay.moveToElement(driver.findElement(By.id("blogsmenu"))).build().perform();
		
		
		
		
	}

}
