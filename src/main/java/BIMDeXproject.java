import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BIMDeXproject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\project\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bimdex.com/");
		WebElement product = driver.findElement(By.xpath("//a[text()='Product']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(product);
	}

}
