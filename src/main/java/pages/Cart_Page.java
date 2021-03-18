package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart_Page extends Page_Base_one{

	public Cart_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div[2]/section/div[2]/div/div/button/span")
	WebElement check_out;
	
	public void click_on_check_out() {
		check_out.click();
			}
	
	@FindBy (xpath = "/html/body/div/div/div/div/div/div/div[3]/button")
	WebElement got_it;

	public void got_it_button() {
	got_it.click();
	}
	}
	
	
	

