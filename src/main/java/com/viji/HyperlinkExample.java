package com.viji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
//		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.partialLinkText("without clicking me.")).click();
	}

}
