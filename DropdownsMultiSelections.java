package com.SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownsMultiSelections {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown =new Select(ideElement);
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for(WebElement Option : ideDropdownOptions) {
		//	System.out.println(Option.getText());
			
			ideDropdown.selectByIndex(0);//eclipse
			Thread.sleep(2000);
			
			ideDropdown.selectByValue("ij") ;//intel
			Thread.sleep(2000);
			
			ideDropdown.selectByVisibleText("NetBeans"); //netbeans
			Thread.sleep(2000);
			
			ideDropdown.selectByValue("vs"); //VisualStudio
			Thread.sleep(2000);
			
			ideDropdown.deselectByVisibleText("NetBeans");
			
			List<WebElement> ideDropdownOptions1 = ideDropdown.getAllSelectedOptions();
			for(WebElement ideDropdownOption : ideDropdownOptions) {
			//	System.out.println("selected visible Text - " +ideDropdownOption);
			}

		}
		
		
		
		
		
		
		
	
		
	}

}
