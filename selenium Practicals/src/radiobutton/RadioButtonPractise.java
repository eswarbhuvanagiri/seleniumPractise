package radiobutton;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium jar files\\hromedriver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		wd.findElement(By.xpath("//div[@dir='ltr']//input[2]")).click();
		
				// multiple radio options
		List<WebElement> li=wd.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for(int i=0;i<li.size();i++) {
		WebElement el=li.get(i);
		String value=el.getAttribute("value");
		System.out.println("values are at now------------- "+value);
		if(value.equalsIgnoreCase("ruby")) {
			el.click();
		}
		
		}
		Thread.sleep(10000);
		wd.quit();

	}

}
