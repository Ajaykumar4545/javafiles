package com.SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownss {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
//sinlge selection Dropdowns	
		
	WebElement courseElement  =	driver.findElement(By.id("course"));
	Select CourseNameDropdown =new Select(courseElement);
	List<WebElement> courseNameDropdownOptions = CourseNameDropdown.getOptions();
	for(WebElement option : courseNameDropdownOptions) {
/*		System.out.println(option.getText());
	}
	
	CourseNameDropdown.selectByIndex(1);
	Thread.sleep(2000);
	
	CourseNameDropdown.selectByVisibleText("Javascript") ;
	Thread.sleep(2000);
	
	CourseNameDropdown.selectByValue("net");
	Thread.sleep(2000);

	 
	
	//Print selected dropdown
	
	String selectedText =CourseNameDropdown.getFirstSelectedOption().getText();
	System.out.println("selected visible text -" + selectedText);
	
*/		
		
	
	}

}
}