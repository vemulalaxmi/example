package noopcoomerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adding_product {
	@FindBy(xpath = "//button[text()=\"Log in\"]")
	public WebElement login;

	@FindBy(xpath = "//a[@class=\"btn btn-primary\"]")
	public WebElement addnew;

	@FindBy(xpath = "//input[@id=\"Name\"]")
	public WebElement productname;

	@FindBy(xpath = "//button[@name=\"save\"]")
	public WebElement save;

	@FindBy(xpath = "//input[@name=\"SearchProductName\"]")
	public WebElement searchproduct;
	
	@FindBy(xpath = "//button[@class=\"btn btn-primary btn-search\"]")
	public WebElement search;
	
	@FindBy(xpath = "//p[text()=\" Products\"]")
	public WebElement products;
	
	@FindBy(xpath = "//input[@id=\"SearchProductName\"]")
	public WebElement anotherproductname;
	
	@FindBy(xpath = "//button[@id=\"search-products\"]")
	public WebElement srch;

        public adding_product(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
