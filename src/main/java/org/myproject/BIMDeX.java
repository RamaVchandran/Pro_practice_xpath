package org.myproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BIMDeX {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\project\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("football",Keys.ENTER);
		
		//goToPage("7");
		movePage("4");
		

	}
	
	public static void goToPage(String pageNo) {
	
		List<WebElement> datas = driver.findElements(By.xpath("//table[@id='nav']//td"));
		
		for (int i = 0; i < datas.size(); i++) {
			WebElement data = datas.get(i);
			String name = datas.get(i).getText();
			if (name.equals(pageNo)) {
				
				data.findElement(By.tagName("a")).click();
				break;
				
			}
			
		}

	}
	
	public static void movePage(String no) {
		
		String locator="//a[@aria-label='Page $']";
		
		 locator = locator.replace("$", no);
		 
		 driver.findElement(By.xpath(locator)).click();
		
	}

}
