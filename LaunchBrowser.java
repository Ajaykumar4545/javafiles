package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");		
		Actions ajay = new Actions(driver);
		ajay.moveToElement((WebElement) By.id("blogsmenu")).build().perform();
		
		
	}
}
