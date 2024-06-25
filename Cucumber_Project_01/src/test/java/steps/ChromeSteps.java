package steps;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;




public class ChromeSteps {
	
	 WebDriver driver;
	  
	 @Given("the Chrome browser is open") public void
	 
	 userNavigateToTheMainHomePage() { driver = new ChromeDriver();
	 driver.get("https://en-gb.facebook.com/"); Options manage = driver.manage();
	 
	
	 manage.window().maximize(); System.out.println(driver.getTitle()); }

}
