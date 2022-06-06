package testjava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


public class SignUpTest extends BaseTest{
	
	@Test(priority=0)
	public void verifyUrlOfPage() {
		String url = signUpPage.pageUrl();
		AssertJUnit.assertEquals(url, "http://jt-dev.azurewebsites.net/#/SignUp");
	}
	
	@Test(priority=1)
	public void Lang() {
		signUpPage.langverifyMethod();
	}
	
	@Test(priority=2)
	public void verifyCreateBtn() {
		signUpPage.verifyCreateActIsDisplayed();
	}
	
	@Test(priority=3)
	public void signupCreds() {
		signUpPage.signupMethod("Shubhada", "Shubhada", "shubhadamanakr1705@gmail.com");
	
	}
	
	

	
}
