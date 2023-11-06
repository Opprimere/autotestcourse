package pages;

import components.cart.CartFooter;
import components.cart.CartList;
import data.App;
import lib.Page;
import org.openqa.selenium.WebDriver;

public class CartPage extends Page {
    public static String page = App.baseurl + "/cart.html";

    public void openPage() {
        driver.get(page);
    }

    public CartPage(WebDriver driver) {
        super(driver);

        cartlist = new CartList(driver);
        cartFooter = new CartFooter(driver);
    }

    public CartList cartlist;
    public CartFooter cartFooter;

}
