import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods close get
		//Firefox - FirefoxDriver ->methods close get
		//Safari - SafariDriver ->methods close get
		// WebDriver close get 
		//WebDriver methods + class methods
		
		// Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/katherinesanares/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//webdriver.chrome.driver->value of path
		//WebDriver driver = new ChromeDriver();
		
		
		//Firefox
		System.setProperty("webdriver.gecko.driver", "/Users/katherinesanares/Downloads/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		
		//Microsoft Edge
	
	
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //driver.quit();
        
	}

}
