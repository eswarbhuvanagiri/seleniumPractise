package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScreenshotFiringMethod {
@Test
	public static void screenshots() throws IOException {
		WebDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().deleteAllCookies();
		drive.get("https://www.javatpoint.com/java-tutorial");
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// using event firing method
		EventFiringWebDriver ef=new EventFiringWebDriver(drive) ;
		File src=ef.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./snaps/javatpoint.png/"));
		

	}

}
