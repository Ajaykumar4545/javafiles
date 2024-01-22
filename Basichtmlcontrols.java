package com.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basichtmlcontrols {

	public static void main(String[] args ) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(2000);
		
	/*	driver.findElement(By.id("spanishchbx")).click();
		Thread.sleep(2000);
		
		WebElement hindi = 	driver.findElement(By.id("hindichbx"));		
		hindi.click();//check
		Thread.sleep(2000);
		
		if (hindi.isSelected());
		hindi.click();//unchecking
		Thread.sleep(2000);
		
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();  
	*/		
	}

}




