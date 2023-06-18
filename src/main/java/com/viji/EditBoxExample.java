package com.viji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
//		driver.findElement(By.id("j_idt88:name")).sendKeys("viji");

//MORE PRECISE WAY

		WebElement Name = driver.findElement(By.id("j_idt88:name"));
		Name.sendKeys("viji");

//		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("India");

		WebElement Country = driver.findElement(By.id("j_idt88:j_idt91"));
		Country.sendKeys("India");

//		driver.findElement(By.name("j_idt88:j_idt95")).clear();

		WebElement Clearcontents = driver.findElement(By.name("j_idt88:j_idt95"));
		Clearcontents.clear();

//		String learning =driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
//		System.out.println(learning);
		WebElement getTextvalue = driver.findElement(By.id("j_idt88:j_idt97"));
		String valueRetrived = getTextvalue.getAttribute("value");
		System.out.println(valueRetrived);

//      Using IsDisabled
		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean checkDisabledBox = disabledBox.isEnabled();
		System.out.println(checkDisabledBox);

//      Without using disabled		
		/*
		 * WebElement disableBox = driver.findElement(By.id("j_idt88:j_idt93")); String
		 * disableBoxValue = disableBox.getAttribute("disabled");
		 * System.out.println(disableBoxValue);
		 */

		Thread.sleep(1000);
		

	}

}
