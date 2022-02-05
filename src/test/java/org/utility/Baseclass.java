package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Baseclass {
	// 
		public static WebDriver driver;
	private static Workbook book;
		//chromebrowser method
		public static void chromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		//launchurl method
		public static void launchUrl(String url) {
			driver.get(url);
		}
		//mainwindow method
		public static void mainwindow() {
			driver.manage().window().maximize();
		}	
		//pageTitle method	
		public static void pageTitle() {
			String titleName = driver.getTitle();
			System.out.print("titleName: ");
			System.out.println(titleName);
		}	
		//pageUrl method	
		public static void pageUrl() {
			String Url = driver.getCurrentUrl();
			System.out.print("Url: ");
			System.out.println(Url);
		}
		//fillTextBox method with parameter Webelement and String 
		public static void fillTextbox(WebElement element, String value) {
			element.sendKeys(value);
		}
		//dropdown method with parameter Webelement and String 
		public static void dropdown(WebElement element, String value) {
			Select s = new Select(element);
			s.selectByValue(value);
		}
		//dropdown method with parameter Webelement and integer 
		public static void dropdownindex(WebElement element, int v) {
			Select s = new Select(element);
			s.selectByIndex(v);
		}
		//dropdowntxt method with parameter Webelement and String 
		public static void dropdowntxt(WebElement element, String text) {
			Select s = new Select(element);
			s.selectByVisibleText(text);
		}
		//btnclick method
		public static void btnclick(WebElement ref) {
			ref.click();
		}
		//pageRefresh method
		public static void pageRefresh() {
			driver.navigate().refresh();
		}
		//time function
		public static void hold(int time) throws InterruptedException {
			Thread.sleep(time);
		}
		// Datadriven excel base class function
		public static String readExcel(int rowNo,int cellNo) throws IOException {
			File f = new File("C:\\Users\\intel\\eclipse-workspace\\Cucumberproject\\excel\\testdata.xlsx");
			FileInputStream fin = new FileInputStream(f);
			book = new XSSFWorkbook(fin);
			Sheet sh = book.getSheet("Projectlogin");
			Row r = sh.getRow(rowNo);
			//System.out.println(r);
			Cell c = r.getCell(cellNo); 
			//System.out.println(c);

			int type = c.getCellType();
			String name;
			//String name1;
			if (type == 1) {
				name = c.getStringCellValue();
				//System.out.println("String: ");
				System.out.println(name);
			}
			else if(DateUtil.isCellDateFormatted(c)){
				Date da = c.getDateCellValue();
				//System.out.println(da);
				SimpleDateFormat form = new SimpleDateFormat("dd-mm-yyyy");
				name = form.format(da);
				//System.out.println(name);

			}
			else {
				double d = c.getNumericCellValue();
				//System.out.println(d);
				long l = (long)d;
				//System.out.println(l);
				name = String.valueOf(l);
				//System.out.println("Integer as String: ");
				System.out.println(name);
			}
			return name;
			//return name1;
		}	
}
