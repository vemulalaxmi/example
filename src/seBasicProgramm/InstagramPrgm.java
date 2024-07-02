package seBasicProgramm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramPrgm {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("vemulalaxmi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("678543@");
		
	}
}
