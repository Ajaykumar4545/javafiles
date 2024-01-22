package com.SeleniumPractise;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handlingtextboxes {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		
	WebElement Usernamebox =	driver.findElement(By.id("login_field"));
		if(Usernamebox.isDisplayed()){
			if(Usernamebox.isEnabled()) {
				Usernamebox.sendKeys("Ajaykumar");
				String enteredText = Usernamebox.getAttribute("Ajay");
			//	System.out.println("enteredTxt");
				Thread.sleep(2000);
				
				driver.findElement(By.name("password")).sendKeys("9490595776@321");
				Thread.sleep(2000);
				
			}
			else
				System.out.println("Username is not displayed");
		}
		else
			System.out.println("Username is not enabled");
				
			}
		
		
		
		
		
	}


