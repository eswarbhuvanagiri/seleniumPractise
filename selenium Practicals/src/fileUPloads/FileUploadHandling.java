package fileUPloads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium jar files\\gecko\\geckodriver.exe");
		WebDriver drive=new FirefoxDriver();
		drive.get("http://toolsqa.com/automation-practice-form/");
		drive.findElement(By.xpath("//input[@id='photo']")).sendKeys("D:\\eswar graded potos\\eswar123.jpg");

	}

}
