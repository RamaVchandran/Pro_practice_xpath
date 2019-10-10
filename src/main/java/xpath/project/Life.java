package xpath.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Life {
static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\project\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
		
		WebElement loc = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]"));
		loc.click();
		WebElement coming = driver.findElement(By.xpath("(//a[@class='dropdown-item '])[2]"));
		coming.click();
		

	}

}
