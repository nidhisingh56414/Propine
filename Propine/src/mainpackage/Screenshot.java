package mainpackage;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends MainClass {
	public static void captureScreenShot(String filename) throws IOException{

		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(file, new File("C:/Users/NidhiSingh/eclipse-workspace1/Propine/screenshots/"+filename+"_"+timestamp+ ".png"));

	}
}
