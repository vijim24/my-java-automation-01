package com.viji;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettoGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();

	}

}
