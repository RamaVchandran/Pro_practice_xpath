package xpath.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzon {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\project\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		WebElement sign = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		sign.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("ramav660@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Rama@1591");
		WebElement login = driver.findElement(By.id("signInSubmit"));
		login.click();
		
		//department
		WebElement dept = driver.findElement(By.xpath("//span[text()='Departments']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(dept).perform();
		Thread.sleep(5000);
		WebElement men = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/a[13]/span"));
		men.click();
		WebElement shoe = driver.findElement(By.xpath("(//span[@class='a-color-base'])[2]"));
		shoe.click();
		//WebElement select = driver.findElement(By.xpath("//div[@data-index='3']"));
		//select.click();
		selectshoe("3");
		
		
	

}
	public static void selectshoe(String index) {
	String locator ="//div[@data-index='$']";
	locator=locator.replace("$",index);
	driver.findElement(By.xpath(locator)).click();

	}

		
}	


