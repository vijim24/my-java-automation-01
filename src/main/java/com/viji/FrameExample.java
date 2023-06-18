package com.viji;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		WebElement clickMe = driver.findElement(By.id("Click"));
		clickMe.click();
		String textAppearedInButton = clickMe.getText();
		System.out.println(textAppearedInButton);
		
		driver.switchTo().defaultContent();
		 List<WebElement> countFrame = driver.findElements(By.tagName("iframe"));
		 int sizeOfFrame = countFrame.size();
		 System.out.println(sizeOfFrame);
		 
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		
		WebElement nestedClickMe = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		nestedClickMe.click();
	}

}
