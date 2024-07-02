package noopcoomerce;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class product_list {
	public WebDriver driver;
	public WebDriverWait wait;
	public adding_product AP;
  @Test
  public void run(){
	  AP=new adding_product(driver);
	  AP.login.click();
	  AP.addnew.click();
	  AP.productname.sendKeys("iphone");
	  AP.save.click();
	  AP.searchproduct.sendKeys("iphone");
	  AP.search.click();
	  AP.products.click();
	  AP.anotherproductname.sendKeys("Custom T-Shirt");
	  AP.srch.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

  }

  @AfterTest
  public void afterTest() {
  }

}
