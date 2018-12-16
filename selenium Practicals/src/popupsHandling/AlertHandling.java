package popupsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import userLibrary.Utils;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "D:\\selenium jar files\\gecko\\geckodriver.exe");
WebDriver drive=new FirefoxDriver();
drive.get("https://mail.rediff.com/cgi-bin/login.cgi");
drive.findElement(By.xpath("//input[@title='Sign in']")).click();
Utils.takeScreenShot(drive, "loginid");
Alert al=drive.switchTo().alert();
System.out.println(al.getText());
Thread.sleep(5000);
al.accept();

	}

}
