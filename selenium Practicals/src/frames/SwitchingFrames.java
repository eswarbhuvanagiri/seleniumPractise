package frames;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames {

	public static void main(String[] args)throws InterruptedException {
		WebDriver drive=new ChromeDriver();
drive.manage().window().maximize();
drive.manage().deleteAllCookies();
drive.get("https://www.freecrm.com/index.html");
drive.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
drive.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("goldmine");
drive.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("@123dell");
drive.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(3000);
drive.switchTo().frame("mainpanel");
Thread.sleep(3000);
drive.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();


	}

}
