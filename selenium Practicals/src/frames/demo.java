package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {
public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver","C:\\Users\\kris\\Downloads\\New folder (2)\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
/*driver.get("https://google.co.in");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("freecrm");
driver.findElement(By.name("btnK")).click();*/
driver.get("https://www.freecrm.com");
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//driver.get("https://www.freecrm.com/register/");
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//Select s1 =new Select(driver.findElement(By.id("payment_plan_id")));
//s1.selectByValue("1");
//driver.findElement(By.name("first_name")).sendKeys("vamsi");
//driver.findElement(By.name("surname")).sendKeys("krishna");
//driver.findElement(By.name("email")).sendKeys("sandakavamsi165@gmail.com");
//driver.findElement(By.name("email_confirm")).sendKeys("sandakavamsi165@gmail.com");
//driver.findElement(By.name("username")).sendKeys("vamsi165");
//driver.findElement(By.name("password")).sendKeys("143143143");
//driver.findElement(By.name("passwordconfirm")).sendKeys("143143143");
//driver.findElement(By.name("agreeTerms")).click();
//driver.findElement(By.name("submitButton")).click();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.findElement(By.name("username")).sendKeys("vamsi165");
driver.findElement(By.name("password")).sendKeys("143143143");
driver.findElement(By.xpath("//input[@value='Login']")).click();

}

}
