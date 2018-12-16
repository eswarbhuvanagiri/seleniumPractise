package windowPopups;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowPOPUPS {
	@Test
	public void popupHandling() throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.popuptest.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='popuptest1.html']")).click();
		Thread.sleep(2000);
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		
		System.out.println("The id of first window "+parentwindow);
		String childwindow=it.next();
		
		System.out.println("The id of child window "+childwindow);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childwindow);
		
		System.out.println("child window title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		System.out.println("parent window tilte "+driver.getTitle());
		driver.close();
	}

}
