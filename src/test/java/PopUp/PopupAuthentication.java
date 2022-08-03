package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAuthentication {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saied rahman/utilities/chromedriver.exe");
		driver = new ChromeDriver(); // For Chrome Browser

		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
	}

}
