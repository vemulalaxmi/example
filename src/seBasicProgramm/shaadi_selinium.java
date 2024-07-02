package seBasicProgramm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shaadi_selinium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://shaadi.com");
		driver.manage().window().maximize();	

	}

}
