package najah.edu;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

class TestFacebookWithJUnit {
static WebDriver driver;
	
	
	
	
	
	@Test
	void test() {
System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dalia-h-1998@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("1d2a3l4i5a6d");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

}
