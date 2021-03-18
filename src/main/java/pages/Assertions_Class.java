package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Assertions_Class extends Page_Base_one {

	public Assertions_Class(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"total-sum\"]")
	WebElement sum;
	
	public String return_total() {
 return sum.getText();
	
}
}