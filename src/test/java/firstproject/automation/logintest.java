package firstproject.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintest {
	public static WebDriver driver;
	@BeforeTest
	public void setUp(){

	System.setProperty("webdriver.chrome.driver","C:\\Users\\karuv\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}

	@Test
	public void doLogin(){
	driver.get("https://www.google.com/");
	System.out.println("Hello");
	System.out.println("Welcome to hello world");
	System.out.println("Welcome to hello world");
	System.out.println("Welcome to hello world");
	System.out.println("Welcome to hello world");
	System.out.println("Welcome to hello world");
	System.out.println("Mybranch");
	System.out.println("Mybranch1");
	System.out.println("Mybranch2");
	}

	@AfterTest
	public void tearDown(){
	driver.quit(); 
	}
	}


