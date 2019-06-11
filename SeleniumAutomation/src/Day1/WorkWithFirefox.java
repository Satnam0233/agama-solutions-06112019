package Day1;


import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkWithFirefox {
FirefoxDriver driver;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\libs\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
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

