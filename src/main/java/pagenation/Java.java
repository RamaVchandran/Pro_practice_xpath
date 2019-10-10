package pagenation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\project\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.switchTo().activeElement();
		System.out.println(ele.getAttribute("name"));
		driver.findElement(By.name("q")).sendKeys("cricket",Keys.ENTER);
		
		System.out.println("frist");
		//gotopagenum("6");
		pagenum("2");
		System.out.println(driver.switchTo().activeElement().getAttribute("value"));

	}

	public static void gotopagenum(String pagenum) {
		String locator = "//a[@aria-label='Page $']";
		locator = 	locator.replace("$",pagenum);
		driver.findElement(By.xpath(locator)).click();

	}
	
	public static void pagenum(String pagenumb) {
		List<WebElement> li = driver.findElements(By.xpath("//table/tr//td"));
		
for(int i=0;i<li.size();i++) {
	if
	(li.get(i).getText().equals(pagenumb)) {
		li.get(i).findElement(By.tagName("a")).click();
		break;
		
	}
	
		
}
}
}
	
	
	

