package BaseSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

	public  static WebDriver driver;
	public static Properties prop;
	
	public Base() throws IOException{
		FileInputStream fis=new FileInputStream("./Configuration\\Mars.properties");
		prop=new Properties();
		prop.load(fis);
	}
	   public void  initialization() throws InterruptedException{
		   String browserName=prop.getProperty("browserName");
		   if(browserName.equals("chrome")) {
			   System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			   driver=new ChromeDriver();
			     
		   }else if(browserName.equals("edge")) {
			   
			   System.setProperty("Webdriver.edge.driver", "./Drivers//msedgedriver.exe");
			   driver=new EdgeDriver();
		   }
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   Thread.sleep(5000);
		   driver.get(prop.getProperty("url"));
		
	}
	   
	
	
}
