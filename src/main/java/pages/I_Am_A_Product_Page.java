package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class I_Am_A_Product_Page extends Page_Base_one{

	public I_Am_A_Product_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath = "//*[@id=\"TPAMultiSection_j4ci4xqb\"]/div/div/article/div[1]/div/article/section[2]/div[7]/div[1]/div/div[2]/div/div/div/div/div/div")
	WebElement count;

	public void mouse_movement() {
	count.click();
	}
	
	@FindBy (xpath = "//*[@id=\"TPAMultiSection_j4ci4xqb\"]/div/div/article/div[1]/div/article/section[2]/div[7]/div[1]/div/div[2]/div/div/div/div/div/div/span[1]")
	WebElement up_arrow;

	public void click_up_arrow() {
	up_arrow.click();
		
	}
	@FindBy(xpath = "//*[@id=\"TPAMultiSection_j4ci4xqb\"]/div/div/article/div[1]/div/article/section[2]/div[7]/div[1]/div/div[1]/section/div[2]/div/div/ul/li[1]/label/span")
	WebElement color_choose;
	
	public void change_color() {
		color_choose.click();
	}
	
	@FindBy (xpath = "//*[@id=\"TPAMultiSection_j4ci4xqb\"]/div/div/article/div[1]/div/article/section[2]/div[7]/div[2]/button/span")
	WebElement add_to_cart;

	public void add_to_cart_button() {
	add_to_cart.click();
		
	}
	
	@FindBy (id = "widget-view-cart-button")
	WebElement view_cart;

	public void view_cart_button() {
	view_cart.click();
	}
	}




