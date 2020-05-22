package testcases;

import mainpackage.MainClass;

public class PageTitle extends MainClass {
	
	public static void pageTitle() throws Exception {
		String title =driver.getTitle();
		System.out.println("Page Title is:" +title);
//		String Title = LoadAndReadPropertiesFile.getValue("Page_Title");
//			if(title.equals("Title")) {
//			System.out.println("Page Title is:" +title);
//						
//		}else {
//			System.out.println("Page title is not expected, hence propine is not opened");
//		}
		
	}
	
	

}
