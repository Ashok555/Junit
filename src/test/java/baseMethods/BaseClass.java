package baseMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void lunchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void sendKey(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void screenShot(String screenShotName) throws IOException {
		TakesScreenshot shot = ((TakesScreenshot) driver);
		File as = shot.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Ashok 555\\Pictures\\Camera Roll\\" + screenShotName + ".png");
		FileUtils.copyFile(as, file);
	}

	public static Cell excelGetData(String name, int rownum, int cellnum) throws IOException {

		File file = new File("ExcelFiles\\Ada hotal junit.xlsx");
		FileInputStream strem = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(strem);
		Sheet sheet = book.getSheet(name);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		return cell;
	}

	public static void setData(String name, int rownum, int column, String att) throws IOException {
		File file = new File("ExcelFiles\\Ada hotal junit.xlsx");
		FileInputStream strem = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(strem);
		Sheet sheet = book.getSheet(name);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(column);
		cell.setCellValue(att);
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
	}

	public static String getAttribute(WebElement Element, String Attributetype) {
		String value = Element.getAttribute(Attributetype);
		return value;

	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
}
