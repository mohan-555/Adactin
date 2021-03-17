package com.adactin.pom;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	
	static WebDriver driver;
	public static WebDriver getBrowser(String type) {  //first void than type pannuvom.return kudukum pothu Webdriver ah marum
		
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
//
//		else if(type.equalsIgnoreCase("ie"))
//		{
//			System.setProperty("webdriver.ie.driver", 
//					System.getProperty("user.dir")+ "\\Driver\\IEDriverServer.exe");
//			
//			driver =new InternetExplorpublicerDriver();
//		}
		
		
		/*else if(type.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
			
			driver =new FirefoxDriver();
		}*/
		
		driver.manage().window().maximize();
		return driver;
	
	
		}
		
		  public static void clickOnElement(WebElement element)
		 
		  { 
			  element.click();
		  
		  }
		  
		  public static void inputValueElement(WebElement element, String value)
		  
		 { 
			  element.sendKeys(value); 
			  }
		  
		  
		  public static void getUrl(String url) { 
			  driver.get(url);
			  }
		 
		

	public static void isEnabled(WebElement element) 
	{
		
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	

public static void isDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	System.out.println(displayed);
	
}
public static void clear(WebElement element) {
	element.clear();
	
	
}
public static void getTitle() {
	
	String titleee = driver.getTitle();
	System.out.println(titleee);
}



//single dropdown
public static void selectTheElement(WebElement element, String option, String value)
{
	Select s = new Select(element);
	if(option.equalsIgnoreCase("value"))
	{
		s.selectByValue(value);
	}
	
		
		  else if (option.equalsIgnoreCase("index")) { int parseInt =
		  Integer.parseInt(value);
		  
		  s.selectByIndex(parseInt); }
		  
		 	
//		  if(option.equalsIgnoreCase("value")) { s.selectByValue(value); }
//		  
//		  else if (option.equalsIgnoreCase("index")) { int parseInt =
//		  Integer.parseInt(value);
//		  
//		  s.selectByIndex(parseInt); }
		 


	else if(option.equalsIgnoreCase("text"))
	{
		s.selectByVisibleText(value);
	}
	
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
}

public static void isSelected(WebElement element) 
{
	
	try {
		boolean sel = element.isSelected();
		System.out.println(sel);
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}



//Take ScreenShot
public static void takescreen(WebDriver driver,String type) throws Throwable 
{
	

TakesScreenshot ts = (TakesScreenshot) driver; //driver------>class
File ss = ts.getScreenshotAs(OutputType.FILE);

File dd = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\picpom.png");

FileUtils.copyFile(ss, dd);
}

public static void getAttname(WebElement element,String type)
{
	String attribute = element.getAttribute("id");
	System.out.println("Attribute value:" + attribute); 
}
//get attribute by value
public static void getAttvalues(WebElement element,String type)
{
	String attribute = element.getAttribute("value");
	System.out.println("Passed Value:" + attribute); 
}
//actions
public static void mouseOver(WebElement locatorname,String aa)
{
	Actions act = new Actions(driver);
	if(aa.equalsIgnoreCase("move"))
	{
	act.moveToElement(locatorname).build().perform();
	}
	else if(aa.equalsIgnoreCase("click"))
	{
		act.click(locatorname).build().perform();
	}
	else if(aa.equalsIgnoreCase("doubleclick"))
	{
		act.doubleClick(locatorname).build().perform();
	}
	else if(aa.equalsIgnoreCase("rightclick"))
	{
		act.contextClick(locatorname).build().perform();
	}
}

//Robot
public static void robott(WebElement locatorname ,String rrr) throws AWTException
{
	Robot r = new Robot();
	if(rrr.equalsIgnoreCase("down"))
	{
r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	else if(rrr.equalsIgnoreCase("enter"))
	{
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}

//Alert

public static void alert(String alt)
{
	Alert alert = driver.switchTo().alert();
	if(alt.equalsIgnoreCase("accept"))
	{
	alert.accept();
	}
	else if(alt.equalsIgnoreCase("dismiss"))
	{
		alert.dismiss();
	}
	else if(alt.equalsIgnoreCase("text"))
	{
		String text = alert.getText();
		System.out.println(text);
	}
	
}
//windows handling
	/*
	 * public static void windowsHandle() { String windowHandle =
	 * driver.getWindowHandle(); Set<String> allId = driver.getWindowHandles(); for
	 * (String id : allId) { String title = driver.switchTo().window(id).getTitle();
	 * System.out.println(title ); } }
	 */


public static void windowsHandless(String type,String destination)
{
	if(type.equalsIgnoreCase("single window"))
	{
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}
	
	else if(type.equalsIgnoreCase("multi window"))
	{
		Set<String> windowHandles = driver.getWindowHandles();
		for (String inputwindow : windowHandles) {
			System.out.println(inputwindow);
			String title = driver.switchTo().window(inputwindow).getTitle();
			System.out.println(title);
			
		}
		
		String actualTitle = destination;
		for (String inputwindow : windowHandles) {
			if(driver.switchTo().window(inputwindow).getTitle().equalsIgnoreCase(destination))
				break;
			
		}
		
	}
}

//frames

public static void frames(WebElement element)
{
	driver.switchTo().frame(element);
}
public static void mainFrame()
{
	driver.switchTo().defaultContent();
}

//scrollup scroll down
public static void scrollActions(WebElement locatorname,String option)
{
	JavascriptExecutor js =(JavascriptExecutor)driver;
	if(option.equalsIgnoreCase("view"))
	{
		js.executeScript("arguments[0].scrollIntoView()", locatorname);

	}
	else if (option.equalsIgnoreCase("pixel"))
		
	{
		js.executeScript("window.scrollBy(0,1000)");
	}
}

//wait
public static void wait (int value)
{

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	
}
//is Multiple
public static void isMultiple(WebElement element)
{
	Select s = new Select(element);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
			
}

//Multiple DropDown

//public static void getAllOptions(WebElement element,String size) {
//	Select s = new Select(element);
//	List<WebElement> options = s.getOptions();
//	for (WebElement id : options) {
//		
//		String text = id.getText();
//		System.out.println(text);
//		
//	}
//	//size
//	int size2 = options.size();
//	System.out.println(size2);
//	
//}
//
//public static void getAllSelected(WebElement element, String text)
//{ 
//	Select s = new Select(element);
//	List<WebElement> selected_Options = s.getAllSelectedOptions();
//	
//	for (WebElement selected : selected_Options) {
//		System.out.println(selected.getText());
//		
//	}
//	
//}
public static void checkBox(WebElement element)
{
	element.click();
}

public static void close() { 
 driver.close(); 
 
 
 }
public static void particularData(String file, int sheetindex,int rowindex,int cellindex) throws Throwable {

	File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\DataDriven_Framework\\src\\particular data.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
//	Sheet sheetAt = wb.getSheetAt(0);
// 
//	Row row = sheetAt.getRow(3);
//	
//	
//	Cell cell = row.getCell(1);
//	
//	CellType cellType = cell.getCellType();
//	
//	if(cellType.equals(CellType.STRING))
//	{ 
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);
//	}
//	
//	else if(cellType.equals(CellType.NUMERIC))
//
//	{
//		double numericCellValue = cell.getNumericCellValue();
//		int value = (int) numericCellValue;
//		System.out.println(value);
//	}
//
//}
//	
	
}
	
}
