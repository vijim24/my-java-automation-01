package com.viji;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01gyr9yzkt40vsw2i35iyeqyga246890.node0");
		
		WebElement dropDown1 = driver.findElement(By.className("ui-selectonemenu"));
		Select select = new Select(dropDown1);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByVisibleText("Playwright");
		 
	
//		Get the number of drop down options
		
		WebElement displayNumberOfDropDown = driver.findElement(By.id("j_idt87:country_input"));
		Select select1 = new Select(displayNumberOfDropDown);
		List<WebElement> options = select1.getOptions();
		int size = options.size();
		System.out.println(size);
		

		
//		select multiple options
		WebElement multiselect =driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/button"));
		Select multiselectBox = new Select(multiselect);
		multiselectBox.selectByIndex(1);
		multiselectBox.selectByIndex(2);
	}
	

		
	
}
