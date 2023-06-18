package com.viji;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		WebElement clickbutton = driver.findElement(By.id("j_idt88:j_idt90"));
		clickbutton.sendKeys(Keys.ENTER);
		driver.get("https://www.leafground.com/button.xhtml");
		WebElement DisabledButton = driver.findElement(By.id("j_idt88:j_idt92"));
		String CheckDisabledButton = DisabledButton.getAttribute("disabled");
		System.out.println(CheckDisabledButton);
//		 Get Position (co-ordinates) of the Button1

		// WebElement getPositionButton = driver.findElement(By.id("j_idt88"));

		/*
		 * Point getxy = getPositionButton.getLocation(); int xvalue=getxy.getX(); int
		 * yvalue=getxy.getY();
		 * System.out.println("The value of x"+xvalue+"The value of Y"+yvalue);
		 */
//      Get Color of the button
		WebElement getButtonColor = driver.findElement(By.id("j_idt88:j_idt96"));
		String colorButton = getButtonColor.getCssValue("background");
		System.out.println("The color of the button is" + colorButton);

//		Get width and height

		WebElement getHeightWidth = driver.findElement(By.id("j_idt88:j_idt98"));
		int getHeightButton = getHeightWidth.getSize().getHeight();
		int getWidthButton = getHeightWidth.getSize().getWidth();
		System.out.println("The height of the button is" + getHeightButton + "and the width of the button is" + getWidthButton);
		Thread.sleep(1000);
		
	}

}
