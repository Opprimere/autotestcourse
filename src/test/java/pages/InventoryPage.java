package pages;

import components.header.Header;
import components.inventory.Inventory;
import data.App;
import lib.Page;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends Page {
    public static String page = App.baseurl + "/inventory.html";

    public void openPage() {
        driver.get(page);
    }

    public InventoryPage(WebDriver driver) {
        super(driver);

        inventory = new Inventory(driver);
        header = new Header(driver);
    }

    public Inventory inventory;

    public Header header;
}
