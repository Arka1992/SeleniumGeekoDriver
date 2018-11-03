import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();

		
		/*ChromeOptions co=new ChromeOptions();
		co.addArguments("--start-maximized");
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver(co);*/
		d.get("https://www.irctc.co.in/nget/");
		
		
		/*Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[@id='loginText']")).click();
		*/// TODO Auto-generated method stub

	}



}
