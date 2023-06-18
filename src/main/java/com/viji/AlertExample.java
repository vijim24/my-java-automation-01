package com.viji;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.FinalizablePhantomReference;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
//		Accepting a simple alert
		WebElement SimpleAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		SimpleAlert.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		Dismissing a confirm Box alert
		WebElement confirmBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']/span[2]"));
		confirmBox.click();
		Thread.sleep(2000);
		Alert confirmAlert = driver.switchTo().alert();
		alert.dismiss();
		
//		Working with the prompt box
		WebElement promptBox = driver.findElement(By.id("j_idt88:j_idt104"));
		promptBox.click();
		Alert promptAlertBox = driver.switchTo().alert();
		Thread.sleep(2000);
		promptAlertBox.sendKeys("Viji");
		Thread.sleep(2000);
		
		promptAlertBox.accept();
		
				
				
	}

}
