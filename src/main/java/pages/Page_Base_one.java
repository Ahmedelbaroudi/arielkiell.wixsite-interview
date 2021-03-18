package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Base_one {

	public Page_Base_one (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
    }

