package pages;

import components.checkout.CheckoutForm;
import data.App;
import lib.Page;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage extends Page {
    public static String page = App.baseurl + "/checkout-step-one.html";

    public void openPage() {
        driver.get(page);
    }

    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);

        checkoutForm = new CheckoutForm(driver);
    }

    public CheckoutForm checkoutForm;
}
