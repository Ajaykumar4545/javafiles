package com.SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testlibrary {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Firefox.Driver", "./Resources/geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
	}
	
	
	
	
	
	
	
	
	
	
}
