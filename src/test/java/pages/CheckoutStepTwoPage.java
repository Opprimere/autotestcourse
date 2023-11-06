package pages;

import components.summary.SummaryInfo;
import data.App;
import lib.Page;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoPage extends Page {
    public static String page = App.baseurl + "/checkout-step-one.html";

    public void openPage() {
        driver.get(page);
    }

    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);

        summaryInfo = new SummaryInfo(driver);
    }

    public SummaryInfo summaryInfo;
}