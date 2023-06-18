package com.viji;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		
		WebElement basicCheckbox = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
		basicCheckbox.click();
		
		WebElement notificationChecked = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]"));
		notificationChecked.click();
		
		
		WebElement favoriteLanguage1Check = driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[3]/div/div[2]"));
		favoriteLanguage1Check.click();
		
		WebElement favoriterLanguage2Check = driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[2]/div/div[2]"));
		favoriterLanguage2Check.click();
		
		WebElement deselectSelectedLanguage = driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[2]/div/div[2]"));
		
		if (deselectSelectedLanguage.isSelected()) {
			deselectSelectedLanguage.click();
		}
		
		

	}

}
