package noopcoomerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Register {
	
  @FindBy(xpath = "//a[@class=\"ico-register\"]")
  public WebElement register;
  
  @FindBy(xpath = "//div[@class=\"gender\"]")
  public WebElement gender;
   
  @FindBy(xpath = "//input [@id=\"gender-female\"]")
  public WebElement female;
  
  @FindBy(xpath = "//input[@id=\"FirstName\"]")
  public WebElement firstname;
  
  @FindBy(xpath = "//input[@id=\"LastName\"]")
  public WebElement lastname;
  
  
  @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]//child::option[text()=\"1\"]")
  public WebElement Dateofbirthday;
  
  @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]//child::option[text()=\"January\"]")
  public WebElement Dateofbirthmonth;
  
  @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]//child::option[text()=\"2001\"]")
  public WebElement Dateofbirthyear;
  
  @FindBy(xpath = "//input[@id=\"Email\"]")
  public WebElement email;
  
  @FindBy(xpath = "//input[@id=\"Company\"]")
  public WebElement company;
  
  @FindBy(xpath = "//input[@id=\"Password\"]")
  public WebElement pwsd;
  
  @FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
  public WebElement confirmpswd;
  
  @FindBy(xpath = "//button[@id=\"register-button\"]")
  public WebElement button;
  
 public Register(WebDriver driver) {
	 PageFactory.initElements(driver , this);
	 
 }

}
