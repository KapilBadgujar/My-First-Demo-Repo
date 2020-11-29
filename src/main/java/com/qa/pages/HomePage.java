package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {

		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Project\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		 driver.get("https://www.google.com/");
		 
		 String Title= driver.getTitle();
		
		 System.out.println("The title of the page is: " + Title);





	}

}
