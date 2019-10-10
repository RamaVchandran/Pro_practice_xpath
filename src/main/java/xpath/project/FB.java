package xpath.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FB {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\project\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//popup
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("ramav660@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Rama@1591");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
	
		WebDriverWait w = new WebDriverWait(driver,500);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Men']")));
		WebElement mouse = driver.findElement(By.xpath("//span[text()='Men']"));
		Actions acc = new Actions (driver);
		acc.moveToElement(mouse).perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='T-Shirts']")));
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		tshirt.click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='_3O0U0u'])[2]/div[1]")));
		//WebElement shirtno =driver.findElement(By.xpath("(//div[@class='_3O0U0u'])[2]/div[1]"));
		//shirtno.click();
		select("3","4");

	}
	
		public static void select(String row,String column) {
		String locator ="(//div[@class='_3O0U0u'])[$]";
		locator=locator.replace("$",row);
		driver.findElement(By.xpath(locator)).click();
		String locator1 ="(//div[@class='_3O0U0u'])/div[#]";
		locator1=locator1.replace("#",column);
		driver.findElement(By.xpath(locator1)).click();
		
		
	}

	}


