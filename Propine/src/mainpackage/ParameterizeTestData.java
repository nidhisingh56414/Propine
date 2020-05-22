package mainpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.excel.utility.Xls_Reader;


public class ParameterizeTestData extends MainClass {
	public static void readingData() throws IOException{
	//get test data from excel:
		String path = "C://Users//NidhiSingh//eclipse-workspace1//Propine//src//com//testdata//propinetestcases.xls";
	Xls_Reader reader = new Xls_Reader(path);
	int rowCount = reader.getRowCount("TestData");
	
	//reader.addColumn("TestData", "Status");
	
	//Parameterization
	for(int rowNum=2; rowNum<=rowCount; rowNum++) {
		String datevalue = reader.getCellData("TestData", "Test Data", rowNum);
		System.out.println(datevalue);
		String testcasenumber = reader.getCellData("TestData", "TC No", rowNum);
		WebElement dateTextfield = driver.findElement(By.xpath("//input[@name = 'date']"));
		dateTextfield.sendKeys(datevalue);
		Screenshot.captureScreenShot("Test Case" +testcasenumber);
		WebElement submitButton = driver.findElement(By.xpath("//input[contains(@class, 'btn btn-default')]"));
		submitButton.click();
		String result = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
		
		//if(result.equals("Invalid date")) {
		Screenshot.captureScreenShot("Result of Test Case" +"_" +testcasenumber);
		System.out.println("Result of testcasenumber is:" +testcasenumber+"_"+result);
		//reader.setCellData("TestData", "Status", rowNum, "Failed");//writing data in excel sheet
			
	//}else {
//		Screenshot.captureScreenShot("Result of Test Case" +"_" +testcasenumber);
//		System.out.println("Result of testcasenumber is:" +testcasenumber+"_"+result);
		//reader.setCellData("TestData", "Status", rowNum, "Passed");
		
	}

}
}

