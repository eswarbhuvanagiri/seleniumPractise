package userLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utils {
	public static void takeScreenShot(WebDriver driver, String screenshotname) {
		try {
			TakesScreenshot snap = (TakesScreenshot) driver;
			File pic = snap.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(pic, new File("./snaps/" + screenshotname + ".png"));
			System.out.println("its done");
		} catch (Exception e) {

			System.out.println("Exception Occured While Taking ScreenShot " + e.getMessage());
		}
	}
}
