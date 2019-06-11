package Day1;


import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithChrome {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
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


