package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class scrshot {
	@Test
public void snaps() throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://amazon.in/");
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	// screenshot
	TakesScreenshot photo=(TakesScreenshot)driver;
	File src=photo.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File( "./snaps/narcos.png"));
	System.out.println("Screenshot sucessfull");
	
	Thread.sleep(3000);
	driver.close();
}


}
