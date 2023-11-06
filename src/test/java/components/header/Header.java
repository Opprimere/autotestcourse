package components.header;

import lib.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CartPage;

public class Header extends Component {
    public Header(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    private WebElement cartButton;

    public CartPage clickCartButton() {
        cartButton.click();
        return new CartPage(driver);
    }
}
