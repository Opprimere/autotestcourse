package components.checkout;

import lib.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CheckoutStepTwoPage;

public class CheckoutForm extends Component {

    public CheckoutForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    private WebElement postalCodeField;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement continueButton;

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }

    public CheckoutStepTwoPage clickContinueButton() {
        continueButton.click();
        return new CheckoutStepTwoPage(driver);
    }
}
