package objects.mapper.com.StepDefs;

import atu.sob.exceptions.ObjectBankException;
import atu.sob.exceptions.ObjectFinderException;
import atu.sob.utils.ObjectIdentifier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HasGoogleHomeObjects {

	private WebDriver driver = null;
	private ObjectIdentifier identifier = new ObjectIdentifier();
	public void setWebDriverObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement SearchField() throws ObjectBankException, ObjectFinderException  {
		return identifier.findElement(driver);
	}


	public WebElement SearchButton() throws ObjectBankException, ObjectFinderException  {
		return identifier.findElement(driver);
	}

}
