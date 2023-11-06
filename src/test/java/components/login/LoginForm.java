package components.login;

import lib.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InventoryPage;

public class LoginForm extends Component {

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    private WebElement submitButton;

    public void enterLogin(String login) {
        loginField.sendKeys(login);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public InventoryPage clickSubmitButton() {
        submitButton.click();
        return new InventoryPage(driver);
    }
}