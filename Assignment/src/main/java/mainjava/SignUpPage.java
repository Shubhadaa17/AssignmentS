package mainjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SignUpPage extends BaseClass {
	
	@FindBy(xpath ="//div[contains(@placeholder,'Choose Language')]")
	WebElement languageField;
	
	@FindBy(xpath="//div[contains(text(),'English')]")
	WebElement english;
	
	@FindBy(xpath="//div[contains(text(),'Dutch')]")
	WebElement dutch;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement userName;
	
	@FindBy(id="orgName")
	WebElement orgName;
	
	@FindBy(id="singUpEmail")
	WebElement email;
	
	@FindBy(xpath="//*[text()='I agree to the']")
	WebElement checkBox;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement btncreateAcct;
	
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void langverifyMethod() {
		languageField.click();

		List<WebElement> allOptions = driver.findElements(By.xpath("//div[contains(@placeholder,'Choose Language')]"));
		for(WebElement lang:allOptions) {
			if(lang.getText().equals("English"))
				System.out.println("English is present");
			if(lang.getText().equals("Dutch"))
				System.out.println("Dutch is present");
		 
		}
	
		
	}
	
	public void signupMethod(String usernameData, String orgnameData, String emailData) {
		userName.sendKeys(usernameData);
		orgName.sendKeys(orgnameData);
		email.sendKeys(emailData);
		checkBox.click();
		btncreateAcct.click();
	}
	
	public String pageUrl() {
		String url = driver.getCurrentUrl();
 	    return url;
	}
	
	public boolean verifyCreateActIsDisplayed() {
		return btncreateAcct.isDisplayed();
	}
	

}
