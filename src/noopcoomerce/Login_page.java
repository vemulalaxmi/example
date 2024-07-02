package noopcoomerce;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_page {

	@FindBy(xpath = "//a[text()=\"Log in\"]")
	public WebElement login;
	
	@FindBy(xpath = "//input[@id=\"Email\"]")
    public WebElement Email;
	
	@FindBy(xpath = "//input[@id=\"Password\"]")
	public WebElement pswd;
	
	@FindBy(xpath = "//button[text()=\"Log in\"]")
	public WebElement button;
	
	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
