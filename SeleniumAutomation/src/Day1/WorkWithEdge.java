package Day1;


import org.openqa.selenium.edge.EdgeDriver;

public class WorkWithEdge {

EdgeDriver driver;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\gurisatnam\\Downloads\\MicrosoftWebDriver.exe");
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://qatechhub.com");
		
	}
	
	public void getTitleOfThePage() {
		System.out.println("Title Of the Page::"+driver.getTitle());
	}
	public void CloseBrowser() {
		driver.close();//it close the current window
		//driver.quit();//it close all the window opened by 
	}
	public void navigateCommands() {
		driver.navigate().to("http://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
}
}
		