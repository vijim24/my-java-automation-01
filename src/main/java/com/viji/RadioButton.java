package com.viji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		WebElement favoritaButton = driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[4]/div/div[2]"));
		favoritaButton.click();
		Thread.sleep(1000);
		
		WebElement defaultButton =driver.findElement(By.id("j_idt87:console2:2"));
		boolean status_Default= defaultButton.isSelected();
		System.out.println(status_Default);
		
		driver.close();

	}

}
