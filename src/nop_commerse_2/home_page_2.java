package nop_commerse_2;

import org.testng.annotations.Test;

import zmq.socket.pubsub.Pub;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class home_page_2 {


	public WebDriver driver;
	public WebDriverWait wait;
	public categerioes caty;
	@Test(priority = 1)
	public void run1() {
		caty= new categerioes(driver);

		caty.computer.click();
		caty.desktop.click();
		caty.byoc.click();
		caty.button.click();
		caty.detop.click();
		caty.showdetailsofstrom.click();
		caty.b2.click();
		caty.dek.click();
		caty.showdetailsforlenovo.click();
		caty.b3.click();
		caty.comp.click();
		caty.notebook.click();
		//caty.type.click();
		caty.lappy.click();
		//caty.checkbox.click();
		//caty.box.click();
		caty.b4.click();
		caty.comp1.click();
		caty.software.click();
		caty.winpro.click();
		caty.mail.click();
		caty.friendmail.sendKeys("sahithakolakani@gmail.com");
		caty.address.sendKeys("vemulalucky12@gmail.com");
		caty.comp2.click();
		caty.Electronics.click();
		caty.camera.click();
		caty.applecam.click();
		caty.addlist.click();
		caty.backtoelectrn.click();
		caty.cell.click();
		caty.img.click();
		caty.wishlist.click();
		caty.electr.click();
		

	}
	@BeforeTest
	public void beforeTest() {
		driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}


}


