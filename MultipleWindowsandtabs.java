package com.SeleniumPractise;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsandtabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle -"+ParentWindowHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle :windowHandles) {
			System.out.println(windowHandle);
		}
	driver.quit();
	}
}
