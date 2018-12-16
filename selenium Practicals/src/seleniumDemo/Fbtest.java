package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbtest {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver", "D:\\selenium jar files\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys("Eswar");
		driver.findElement(By.xpath("//input[@id='name_3_lastname']")).sendKeys("Bhuvanagiri");
		driver.findElement(By.xpath("//input[@value='single']")).click();
		driver.findElement(By.xpath("//input[@value='reading']")).click();
		driver.findElement(By.xpath("//input[@value='dance']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		sel.selectByVisibleText("India");
		Select sel1=new Select(driver.findElement(By.xpath("//select[@id='mm_date_8']")));
		sel1.selectByIndex(10);
		Select sel2=new Select(driver.findElement(By.xpath("//select[@id='dd_date_8']")));
		sel2.selectByValue("22");
		Select sel3=new Select(driver.findElement(By.xpath("//select[@id='yy_date_8']")));
		sel3.selectByVisibleText("1994");
		driver.findElement(By.xpath("//input[@id='phone_9']")).sendKeys("9912599767");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("eswar_notgreat1anywhere");
		driver.findElement(By.xpath("//input[@id='email_1']")).sendKeys("eswarzone@anymail.com");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("iam teetoler");
		driver.findElement(By.xpath("//input[@id='password_2']")).sendKeys("E$warZone777");
		driver.findElement(By.xpath("//input[@id='confirm_password_password_2']")).sendKeys("E$warZone777");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
//driver.quit();
	}}