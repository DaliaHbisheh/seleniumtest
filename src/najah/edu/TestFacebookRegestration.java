package najah.edu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class TestFacebookRegestration{
	
	static WebDriver driver;
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("name");
		Select sel=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath(".//*[@id='u_0_t']")).click();
	}
	
	
	
	
	
	
}