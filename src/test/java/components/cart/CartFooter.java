package components.cart;

import lib.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CheckoutStepOnePage;

public class CartFooter extends Component {
    public CartFooter(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private WebElement checkoutButton;

    public CheckoutStepOnePage clickCheckoutButton() {
        checkoutButton.click();

        return new CheckoutStepOnePage(driver);
    }
}
