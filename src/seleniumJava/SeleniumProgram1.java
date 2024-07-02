package seleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("firstname")).sendKeys("veera");
        driver.findElement(By.name("lastname")).sendKeys("VEMULA");
        driver.findElement(By.name("reg_email__")).sendKeys("9515688231");
        driver.findElement(By.id("password_step_input")).sendKeys("vemula veera@gmail.com");
        driver.findElement(By.id("day")).sendKeys("17");
        driver.findElement(By.id("month")).sendKeys("aug");
        driver.findElement(By.id("year")).sendKeys("2000");
        
        
        

	}
}