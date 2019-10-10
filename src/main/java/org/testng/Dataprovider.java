package org.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class Dataprovider {

	@Test(dataProvider="register")
	public void login(String s1, String s2, String s3, String s4, String s5) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project workspace\\project\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(s1);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(s2);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(s3);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(s4);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(s5);
		driver.close();
		
	}
	
	@DataProvider(name="register",parallel=true)
	public Object[][] data() throws IOException{
	
return td();
		//new Object[][] 
				//{{"Rama","chandran","tambarameast","ramav660@gmail.com","9003209516"},{"dhamo","chand","perungalathur","dhamo660@gmail.com","9003209236"},
//{"gowtham","varadhan","kodambakkam","gowtham660@gmail.com","9443209516"},{"fazil","babu","pallavaram","fazil660@gmail.com","9443209516"},{"jaya","krishna","chrompet","jayam660@gmail.com","9023209516"}};
		
	}
	
	public Object[][] td() throws IOException {
		File file = new File("E:\\Project workspace\\project\\TestData\\Task_1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Task");
		String name = null;
		
		//count
		Row headerRow = s.getRow(0);
		Object[][] obj = new Object[s.getPhysicalNumberOfRows()-1][headerRow.getPhysicalNumberOfCells()-1];
		for(int i=1;i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
			int col=(r.getPhysicalNumberOfCells()-1);
			for(int j=1;j<col;j++) {
			 org.apache.poi.ss.usermodel.Cell c  = r.getCell(j);
			int type =  c.getCellType();
			 if(type ==1) {
				name = c.getStringCellValue();
			 }
			if(type==0) {
				if(DateUtil.isCellDateFormatted(c)) {
					name = new SimpleDateFormat("dd-mm-yy").format(c.getDateCellValue());
						
					}else {
						name= String.valueOf((long)c.getNumericCellValue());
				}
			}
			
			obj[i-1][j-1]=name;
			}
			
		}
		return obj;

		
	}
	
}
	
		



		
		
	
	
		


