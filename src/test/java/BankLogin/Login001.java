package BankLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login001 {
static WebDriver driver;
	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",    "C:/Users/saied rahman/utilities/chromedriver.exe");            
		driver = new ChromeDriver();  // For Chrome Browser

		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		Thread.sleep(2000);
		//find userId
		driver.findElement(By.name("dummy-onlineId")).sendKeys("saied989");
		Thread.sleep(2000);
		//save userID
		driver.findElement(By.id("remID")).click();
		Thread.sleep(2000);
		//set password
		driver.findElement(By.name("dummy-passcode")).sendKeys("1234");
		Thread.sleep(2000);
		//login
		driver.findElement(By.xpath("//*[@id=\"EnterOnlineIDForm\"]/a[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("forgot-your-passcode")).click();
		Thread.sleep(2000);
		//*[@id="cancelCustomerAccount
		driver.findElement(By.xpath("//*[@id=\"cancelCustomerAccount\"]")).click();
		driver.wait(5000);
		driver.close();
	}

}
