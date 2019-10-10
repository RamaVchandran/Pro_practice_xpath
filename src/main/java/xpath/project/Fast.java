package xpath.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fast {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project workspace\\project\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fast.com/");
		
		WebElement speed =driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div)[1]"));
		WebDriverWait w = new WebDriverWait(driver,500);
		
		String s = speed.getText();
		System.out.println(s);
		
		

	}

}
