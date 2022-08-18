package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginClass {

public static WebDriver driver;
	
     //this
	public  void launchBrowser(){
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
	}
	
	public static void getLink(String link) {
		
		driver.get(link);
		
		
	}
	
	public static void clickOnSignin(){
		driver.findElement(By.xpath("//a[@class='login']")).click();
		 
	}
	
	public static void sendKeys(String username, String password) {
	
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		
	}
	
	public static void clickOnSubmitSignin(){
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		 
	}
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		loginClass li = new loginClass();
	  li.launchBrowser();
	  li.getLink("http://automationpractice.com/index.php");
	  Thread.sleep(3000);
	  li.clickOnSignin();
	  Thread.sleep(5000);
	  li.sendKeys("jayanthyadlapalli143@gmail.com", "JayAnth@143#");
	  li.clickOnSubmitSignin();
		
		

	}

}



