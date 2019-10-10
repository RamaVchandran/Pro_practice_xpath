import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipart {
	

	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Project workspace\\framewrk\\lib\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   
	   try {
		   
		   WebElement button = driver.findElement(By.xpath("//button[text()='✕']"));
		   button.isDisplayed();
		   button.click();
		
	} catch (Exception e) {
		System.out.println("pop up is not displayed");
	}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles",Keys.ENTER);
		
		
		
		Thread.sleep(3000);
		List<WebElement> mobName = driver.findElements(By.xpath("//div[@id='container']/div/div[3]/div[2]/div/div[2]//div//a//div[contains(text(),'GB')]"));
		for (int i = 0; i < mobName.size(); i++) {
			
			String name = mobName.get(i).getText();
		//	String five = mobName.get(5).getText();
			System.out.println(name);
			
			File f = new File ("C:\\Users\\Dhamo\\Desktop\\Test_flip.txt");
			FileUtils.write(f, name, true);

		}
		
	
		File f = new File ("C:\\Users\\Dhamo\\Desktop\\Test_Flip.txt");
		List<String> readLines = FileUtils.readLines(f);
		for (String filemob : readLines) {
			System.out.println(filemob);
		}
}

}
