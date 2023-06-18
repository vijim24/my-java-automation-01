package com.viji;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01bn3ymnna1smi1hl1n1cakzfbv264962.node0");
		
		String initialWindowHandle = driver.getWindowHandle();
//		Click and confirm new button open
		
		WebElement clickOpenButton = driver.findElement(By.id("j_idt88:new"));
		clickOpenButton.click();
		
		Set<String> newWindowHandle = driver.getWindowHandles();
		
		for (String handle : newWindowHandle) {
			driver.switchTo().window(handle);
		}
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("abc@gmail.com");
		
		driver.close();
		
		WebElement openMultiple = driver.findElement(By.id("j_idt88:j_idt91"));
		openMultiple.click();
		
		Set<String> allwindowHandles = driver.getWindowHandles();
		
		for (String lastWindowHandle : allwindowHandles) {
			if(!lastWindowHandle.equals(initialWindowHandle))
			{
				driver.switchTo().window(initialWindowHandle);
				driver.close();
			}
			
		}
	}

}
