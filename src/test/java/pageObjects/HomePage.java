package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Page object conetain theree pstage
//1. Constructore
public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver); //with super keyword we passing driver to parent class(Base Page)
	}
//Constructoe end
	
	
//Locatore	
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(linkText="Login") //Login link added in steps 5
WebElement linkLogin;
//Locatore end

//Actions start

public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}

public void linkLogin()
{
	linkLogin.click();
}

//Acation end
}
