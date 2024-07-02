 package noopcoomerce;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class home_page {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public Register regist;
	public Login_page login;
	
	@Test(priority = 0)
  public void run1() {
	  regist = new Register(driver);
	  regist.register.click();
	  regist.gender.click();
	  regist.female.click();
	  regist.firstname.sendKeys("vemula");
	  regist.lastname.sendKeys("laxmi");
	  regist.Dateofbirthday.click();
	  regist.Dateofbirthmonth.click();
	  regist.Dateofbirthyear.click();
	  regist.email.sendKeys("vemulalaxmi842@gmail.com");
	  regist.company.sendKeys("Accenture");
	  regist.pwsd.sendKeys("laxmi@123");
	  regist.confirmpswd.sendKeys("laxmi@123");
	  regist.button.click();
	  
  }
  
  
  @Test(priority = 1)
  
  public void run () {
	  login = new Login_page(driver);
	  login.login.click();
	  login.Email.sendKeys("vemula123@gmail.com");
	  login.pswd.sendKeys("lucky@987");
      login.button.click();
	

	  
	  
		
  }
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

  }

  @AfterTest
	 public void aftertest() {
  
  }

}
