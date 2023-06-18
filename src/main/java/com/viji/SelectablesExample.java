package com.viji;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectablesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-elements/#Multiple%20Selection");
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='selectable']"));
		
		//*[@id="selectable"]/li[1]
		int size = selectable.size();
		System.out.println(size);
//		Actions action = new Actions(driver);
//		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build()
//				.perform();

	}

}
