package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	
	@FindBy(xpath="//a[text()=' SkillRary Demo APP'][2]")
	private WebElement Skillrarydemoapp;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void gearsButton() {
		gearsBtn.click();
	}
	
	public void SkillraryDemoAppbtn() {
		Skillrarydemoapp.click();
	}
}
