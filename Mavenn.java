package com.SeleniumPractise;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Mavenn {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(1000);
//		WebElement UserName =driver.findElement(By.id("login_field"));
//		driver.findElement(By.id("long_field"));
		WebElement password =driver.findElement(By.name("password"));
		Thread.sleep(3000);
		
		highlight(driver,driver.findElement(By.id("long_field")));
		Thread.sleep(3000);
		
//		highlight(driver,driver.findElement(By.name("password")));
//		Thread.sleep(2000);
		
//		highlight(driver,driver.findElement(By.className("header-logo")));
//		Thread.sleep(3000);
		
	//	highlight(driver,driver.findElement(By.linkText("forgot-password")));
	//	Thread.sleep(3000);
		
//		highlight(driver,driver.findElement(By.partialLinkText("Create an")));
//		Thread.sleep(3000);
		
	//	highlight(driver,driver.findElement(By.tagName("h1")));
		
	//	UserName.sendKeys("Ajaykumar");	
		
	}

	private static void highlight(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		
	}

	//private static void highlight(WebDriver driver, WebElement findElement) {
		// TODO Auto-generated method stub
		
	}


