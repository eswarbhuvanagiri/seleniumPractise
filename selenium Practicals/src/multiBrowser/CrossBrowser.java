package multiBrowser;

	import java.util.Scanner;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.opera.OperaDriver;

	public class CrossBrowser {
		static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
					browser();
		}
		public static void browser() {
			String browser = scan.nextLine();
			if(browser.equals("chrome")) {
			//	System.setProperty("webdriver.chrome.driver","C:\\Users\\kris\\Downloads\\New folder (2)\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.spicejet.com/");
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']"))).build().perform();;
				driver.close();
			}
			else if(browser.equals("firefox")){
				WebDriver driver = new FirefoxDriver();
			//	System.setProperty("webdriver.gecko.driver","C:\\Users\\kris\\Downloads\\New folder (2)\\gecko\\geckodriver.exe");
				driver.get("https://www.spicejet.com/");
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']"))).build().perform();;
				driver.close();
			}
			else if(browser.equals("opera")) {
				WebDriver driver = new OperaDriver();
		//	System.setProperty("webdriver.opera.driver","C:\\Users\\kris\\Downloads\\New folder (2)\\opera\\operadriver_win64\\operadriver.exe");
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']"))).build().perform();;
driver.close();
			
			}
			
			
		}

	
}
