package dropdownHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium jar files\\gecko\\geckodriver.exe");
		WebDriver drive=new FirefoxDriver();
		drive.manage().window().maximize();
		drive.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drive.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement>dd_menu=drive.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		for(WebElement we:dd_menu) {
			
			String element=we.getAttribute("innerHTML");
			System.out.println("the Drop downvalues are  :"+element);
			if(element.contentEquals("JavaScript")) {
			we.click();
			break;
			}
		}
		Thread.sleep(5000);
		drive.close();

	}

}
