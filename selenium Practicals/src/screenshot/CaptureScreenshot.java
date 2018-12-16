package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import userLibrary.Utils;

public class CaptureScreenshot {
	@Test
	public void snap() throws Exception {
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().deleteAllCookies();
		drive.get("https://www.amazon.in/");
		//screenshot
		Utils.takeScreenShot(drive, "page1");
		drive.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		drive.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("OnePlus 6");
		//screenshot
		Utils.takeScreenShot(drive, "page2");
		drive.findElement(By.xpath("//input[@value='Go']")).click();
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	drive.findElement(By.xpath("//h2[contains(text(),'OnePlus 6 (Red, 8GB RAM, 128GB Storage)')]")).click();
		//screenshot
		Utils.takeScreenShot(drive, "page3");
	
	Thread.sleep(1000);

		drive.quit();
	}

}
