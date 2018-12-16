package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium jar files\\hromedriver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> li=wd.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));
		for(int i=0;i<li.size();i++) {
			WebElement we=li.get(i);
			String id =we.getAttribute("id");
			
			if(id.equalsIgnoreCase("code")) {
				we.click();
				break;
			}
		}

	}

}
