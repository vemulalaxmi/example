package nop_commerse_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neilalexander.jnacl.crypto.poly1305;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class categerioes {

	{
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]//child::a[text()=\"Computers \"]")
	public WebElement  computer;

	@FindBy(xpath = "//li[@class=\"inactive\"]//a[text()=\"Desktops \"]")
	public WebElement desktop;

	@FindBy(xpath = "//div[@class=\"picture\"]//a[@title=\"Show details for Build your own computer\"]")
	public WebElement byoc;

	@FindBy(xpath = "//button[@id=\"add-to-cart-button-1\"]")
	public WebElement button;

	@FindBy(xpath = "//li//child::a[span=\"Desktops\"]")
	public WebElement detop;

	@FindBy(xpath = "//div[@class=\"picture\"]//child::a[@title=\"Show details for Digital Storm VANQUISH 3 Custom Performance PC\"]")
	public WebElement showdetailsofstrom;

	@FindBy(xpath = "//button[@id=\"add-to-cart-button-2\"]")
	public WebElement b2;

	@FindBy(xpath = "//li//child::a[span=\"Desktops\"]")
	public WebElement dek;

	@FindBy(xpath = "//div[@class=\"picture\"]//child::a[@title=\"Show details for Lenovo IdeaCentre 600 All-in-One PC\"]")
	public WebElement showdetailsforlenovo;

	@FindBy(xpath ="//button[@id=\"add-to-cart-button-3\"]") 
	public WebElement b3;

	@FindBy(xpath = "//li//child::a[span=\"Computers\"]")
	public WebElement comp;

	@FindBy(xpath = "//li[@class=\"inactive\"]//a[text()=\"Notebooks \"]")
	public WebElement notebook;

	//@FindBy(xpath = "//li[@class=\"name\"]//strong[text()=\"CPU Type\"]")
	//public WebElement type;

	//@FindBy(xpath = "//input[@id=\"attribute-option-7\"]")
	//public WebElement checkbox;

	//@FindBy(xpath = "//input[@id=\"attribute-option-10\"]")
	//public WebElement box;

	@FindBy(xpath = "//a[@title=\"Show details for Asus N551JK-XO076H Laptop\"]")
	public WebElement lappy;

	@FindBy(xpath = "//button[@class=\"button-2 product-box-add-to-cart-button\"]")
	public WebElement b4;

	@FindBy(xpath = "//li//a[span=\"Computers\"]")
	public WebElement comp1;

	@FindBy(xpath = "//li[@class=\"inactive\"]//a[text()=\"Software \"]")
	public WebElement software;

	@FindBy(xpath = "//div[@class=\"picture\"]//a[@title=\"Show details for Windows 8 Pro\"]")
	public WebElement winpro;

	@FindBy(xpath = "//div[@class=\"email-a-friend\"]")
	public WebElement mail;

	@FindBy(xpath = "//input[@id=\"FriendEmail\"]")
	public WebElement friendmail;

	@FindBy(xpath = "//input[@id=\"YourEmailAddress\"]")
	public WebElement address;

	@FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]//li//a[text()=\"Computers \"]")
	public WebElement comp2;

	@FindBy(xpath = "//li[@class=\"inactive\"]//a[text()=\"Electronics \"]")
	public WebElement Electronics;

	@FindBy(xpath = "//li[@class=\"inactive\"]//a[text()=\"Camera & photo \"]")
	public WebElement camera;

	@FindBy(xpath = "//img[@title=\"Show details for Apple iCam\"]")
	public WebElement applecam;

	@FindBy(xpath = "//button[text()=\"Add to compare list\"]")
	public WebElement addlist;

	@FindBy(xpath = "//span[text()=\"Electronics\"]")
	public WebElement backtoelectrn;

	@FindBy(xpath = "//li[@class=\"inactive\"]//a[text()=\"Cell phones \"]")
	public WebElement cell;

	@FindBy(xpath = "//img[@title=\"Show details for HTC One M8 Android L 5.0 Lollipop\"]")
	public WebElement img;
	
	@FindBy(xpath = "//div[@class=\"add-to-wishlist\"]")
	public WebElement wishlist;

	@FindBy(xpath = "//span[text()=\"Electronics\"]")
	public WebElement electr;






	public categerioes(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
