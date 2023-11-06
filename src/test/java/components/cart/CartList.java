package components.cart;

import lib.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartList extends Component {

    public CartList(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#cart_contents_container .cart_list")
    private WebElement container;

    public int getGoodCount() {
        List<WebElement> countPurchases = container.findElements(By.className("cart_item_label"));

        return countPurchases.size();
    }

}
