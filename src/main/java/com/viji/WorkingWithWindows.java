package com.viji;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldWindowHandle = driver.getWindowHandle();
		WebElement clickAndConfirmNewWindow = driver.findElement(By.id("j_idt88:new"));
		clickAndConfirmNewWindow.click();
		
		Set<String> oldAndNewwindowHandles = driver.getWindowHandles();
		
		for (String handle : oldAndNewwindowHandles) {
			driver.switchTo().window(handle);
		}
//		WebElement emailTextBox = driver.findElement(By.id("email"));
//		emailTextBox.sendKeys("test.com");
//		
//		WebElement messageBox = driver.findElement(By.id("message"));
//		messageBox.sendKeys("Hey tester, We are happy for you to join our center");
		
		driver.close();
		
//		driver.switchTo().defaultContent();
		Set<String> oldestwindowHandles = driver.getWindowHandles();
		
		for (String handlers : oldestwindowHandles) {
			driver.switchTo().window(handlers);
		}
		
//		Clicking multiple window button and getting the count of windows opened
		
		WebElement multipleWindowButton = driver.findElement(By.id("j_idt88:j_idt91"));
		multipleWindowButton.click();
		
		int numberOfWindowsOpened = driver.getWindowHandles().size();
		System.out.println(numberOfWindowsOpened);
		
//		 Close all except the parent window
		
		WebElement closeAllExceptParentButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']"));
		closeAllExceptParentButton.click();
		
		Set<String> newestWindowHandles = driver.getWindowHandles();
		
		for (String allWindow : newestWindowHandles) {
			if (!allWindow.equals(oldWindowHandle)) {
				driver.switchTo().window(allWindow);
				driver.close();
			}
			
		}
		Thread.sleep(2000);
		;
	}

}
