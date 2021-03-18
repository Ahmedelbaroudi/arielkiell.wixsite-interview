package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import pages.Assertions_Class;
import pages.Cart_Page;
import pages.Home_Page;
import pages.I_Am_A_Product_Page;
import pages.Take_Screenshots_Class;

public class Adding_Items_To_Cart extends Test_Base{

	Home_Page home_object;
	I_Am_A_Product_Page product_object;
	Cart_Page cart_object;
	Assertions_Class assertions_object;
	Take_Screenshots_Class screenshot_object = new Take_Screenshots_Class();
	
	@Test (priority = 1)
	public void add_items() throws InterruptedException {
		home_object = new Home_Page(driver);
		
		home_object.click_shop();
		screenshot_object.take_screen_shot(driver, "1-go to the shop");
		home_object.choose_product();
		screenshot_object.take_screen_shot(driver, "2-select 4th product (counting from top left to button right)");
		sleeps(4000);
		}
	
	@Test(priority = 2)
	public void product_steps() throws InterruptedException {
		product_object = new I_Am_A_Product_Page(driver);
	    
		product_object.mouse_movement();
	    screenshot_object.take_screen_shot(driver, "3-add to cart 3 items using the up arrow");
		product_object.click_up_arrow();
		product_object.click_up_arrow();
		screenshot_object.take_screen_shot(driver, "4-add to cart 3 items using the up arrow");
		sleeps(3000);
		product_object.change_color();
		screenshot_object.take_screen_shot(driver, "5-pick any color (black)");
		sleeps(2000);
		product_object.add_to_cart_button();
		screenshot_object.take_screen_shot(driver, "6-add to cart button");
		sleeps(1000);
		driver.switchTo().frame(2);
		product_object.view_cart_button();
		screenshot_object.take_screen_shot(driver, "7-click on view cart");
		sleeps(5000);
	    }
	
	@Test (priority = 3)
	public void cart_steps() throws InterruptedException {
		cart_object = new Cart_Page(driver);
		 
		 driver.switchTo().frame(0);
		 cart_object.click_on_check_out();
		 screenshot_object.take_screen_shot(driver, "8-click on checkout");
	     sleeps(3000);
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame(4);
		 screenshot_object.take_screen_shot(driver, "9-got_it_button");
		 cart_object.got_it_button();
		 }
	
	@Test (priority = 4)
	public void cheking_price_step() throws InterruptedException {
		 assertions_object = new Assertions_Class(driver);
		 
		 driver.switchTo().frame(0);
		 screenshot_object.take_screen_shot(driver, "10 -check that the price adds up to 75 CAD");
		 String return_total=
		 assertions_object.return_total();
		 assertEquals(return_total, "C$75.00");
         }
	     }