package com.viji;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement From = driver.findElement(By.id("form:drag_content"));
		WebElement To = driver.findElement(By.id("form:drop_content"));
		
		Actions action = new Actions(driver);
//		action.clickAndHold(From).moveToElement(To).build().perform();
		action.dragAndDrop(From, To);
	}

}
