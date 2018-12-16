package demoqaExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium jar files\\hromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://a.testaddressbook.com/addresses/new");
		driver.findElement(By.xpath("//input[@id='session_email']")).sendKeys("eswar@gmail.com");
		driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("rambo1");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='address_first_name']")).sendKeys("eswar");
driver.findElement(By.xpath("//input[@id='address_last_name']")).sendKeys("rambo");
driver.findElement(By.xpath("//input[@id='address_street_address']")).sendKeys("d.no 33-8-2\1 kundanapu nilayam,managalavarapupeta,rajahmundry");
	driver.findElement(By.xpath("//input[@id='address_city']")).sendKeys("Rajahmundry");
	Select sel=new Select(driver.findElement(By.xpath("//select[@id='address_state']")));
	sel.selectByValue("TX");
	driver.findElement(By.xpath("//input[@id='address_zip_code']")).sendKeys("789333");
	driver.findElement(By.xpath("//input[@id='address_country_true']")).click();
	driver.findElement(By.xpath("//input[@id='address_birthday']")).sendKeys("22-oct-1995");
	driver.findElement(By.xpath("//input[@id='address_age']")).sendKeys("24");
	driver.findElement(By.xpath("//input[@id='address_website']")).sendKeys("dragonsecret.com");
	driver.findElement(By.xpath("//input[@id='address_phone']")).sendKeys("888555777");
	driver.findElement(By.xpath("//input[@id='address_interest_dance']")).click();
	
	
	
	}

}
