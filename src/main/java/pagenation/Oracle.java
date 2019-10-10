package pagenation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle {

		static WebDriver driver;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","E:\\Project workspace\\project\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement ele = driver.switchTo().activeElement();
			System.out.println(ele.getAttribute("name"));
			driver.findElement(By.name("q")).sendKeys("oracle",Keys.ENTER);
			pageno("5");
	}

		public static void pagenum(String pageno) {
			String locator ="//a[@aria-label='Page $']";
			locator = locator.replace("$",pageno);
			driver.findElement(By.xpath(locator)).click();

		}
		
		public static void pageno(String num) {
			// TODO Auto-generated method stub
		List<WebElement> li=	driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(int i=0;i<li.size();i++) {
			
			WebElement element = li.get(i);
			String name = element.getText();
			if (name.equals(num)) {
				
				element.findElement(By.tagName("a")).click();
				break;
				
			}
			
		
		}

		}
}
