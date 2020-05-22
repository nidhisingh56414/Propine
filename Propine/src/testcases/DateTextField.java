package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainpackage.LoadAndReadPropertiesFile;
import mainpackage.MainClass;
import mainpackage.Screenshot;

public class DateTextField extends MainClass{
	
	
	public static void testCase1() throws Exception {
		WebElement dateTextfield = driver.findElement(By.xpath("//input[@name = 'date']"));
		dateTextfield.sendKeys(LoadAndReadPropertiesFile.getValue("mm/dd/yyyy"));
		Screenshot.captureScreenShot("DateFormatType_mm/dd/yyyy");
		WebElement submitButton = driver.findElement(By.xpath("//input[contains(@class, 'btn btn-default')]"));
		submitButton.click();
		String result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		Screenshot.captureScreenShot("Result_mm/dd/yyyy");
		System.out.println("Result of DateFormatType_mm/dd/yyyy is:" +result);
		
			}
	
	public static void testCase2() throws Exception {
		WebElement dateTextfield = driver.findElement(By.xpath("//input[@name = 'date']"));
		dateTextfield.sendKeys(LoadAndReadPropertiesFile.getValue("dd/mm/yyyy"));
		Screenshot.captureScreenShot("DateFormatType_dd/mm/yyyy");
		WebElement submitButton = driver.findElement(By.xpath("//input[contains(@class, 'btn btn-default')]"));
		submitButton.click();
		String result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		Screenshot.captureScreenShot("Result_dd/mm/yyyy");
		System.out.println("Result of DateFormatType_dd/mm/yyyy is:" +result);
		
			}
	
	public static void testCase3() throws Exception {
		WebElement dateTextfield = driver.findElement(By.xpath("//input[@name = 'date']"));
		dateTextfield.sendKeys(LoadAndReadPropertiesFile.getValue("dd-mm-yyyy"));
		Screenshot.captureScreenShot("DateFormatType_dd-mm-yyyy");
		WebElement submitButton = driver.findElement(By.xpath("//input[contains(@class, 'btn btn-default')]"));
		submitButton.click();
		String result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		Screenshot.captureScreenShot("Result_dd-mm-yyyy");
		System.out.println("Result of DateFormatType_dd-mm-yyyy is:" +result);
		
			}	
	
	public static void testCase4() throws Exception {
		WebElement dateTextfield = driver.findElement(By.xpath("//input[@name = 'date']"));
		dateTextfield.sendKeys(LoadAndReadPropertiesFile.getValue("dd-mmm-yyyy-tt"));
		Screenshot.captureScreenShot("DateFormatType_dd-mmm-yyyy-tt");
		WebElement submitButton = driver.findElement(By.xpath("//input[contains(@class, 'btn btn-default')]"));
		submitButton.click();
		String result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		Screenshot.captureScreenShot("Result_dd-mmm-yyyy-tt");
		System.out.println("Result of dd-mmm-yyyy-tt is:" +result);
		
			}	
	
	public static void testCase5() throws Exception {
		WebElement dateTextfield = driver.findElement(By.xpath("//input[@name = 'date']"));
		dateTextfield.sendKeys(LoadAndReadPropertiesFile.getValue("mmddyyyy"));
		Screenshot.captureScreenShot("DateFormatType_mmddyyyy");
		WebElement submitButton = driver.findElement(By.xpath("//input[contains(@class, 'btn btn-default')]"));
		submitButton.click();
		String result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		Screenshot.captureScreenShot("Result_mmddyyyy");
		System.out.println("Result of DateFormatType_mmddyyyy is:" +result);
		
			}	
	
	public static void testCase6() throws Exception {
		WebElement dateTextfield = driver.findElement(By.xpath("//input[@name = 'date']"));
		dateTextfield.sendKeys(LoadAndReadPropertiesFile.getValue("Year-Month-day"));
		Screenshot.captureScreenShot("DateFormatType_Year-Month-day");
		WebElement submitButton = driver.findElement(By.xpath("//input[contains(@class, 'btn btn-default')]"));
		submitButton.click();
		String result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		Screenshot.captureScreenShot("Result_Year-Month-day");
		System.out.println("Result of DateFormatType_Year-Month-day is:" +result);
		
			}	
	

}

