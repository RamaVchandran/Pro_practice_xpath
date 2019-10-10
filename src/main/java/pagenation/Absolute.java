package pagenation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\project\\lib\\chromedriver.exe");
	     WebDriver	driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> datas = driver.findElements(By.xpath("//body/div/div/div[2]/div/ul/li"));
		for (WebElement x : datas) {
			
			String name = x.getText();
			System.out.println(name);
			
		}
	}

}
