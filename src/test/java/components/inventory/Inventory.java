package components.inventory;

import lib.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Inventory extends Component {

    public Inventory(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div")
    private WebElement container;

    public void addAllGoodsToCart() {
        List<WebElement> resultInventories = container.findElements(By.cssSelector("button[id^='add-to-cart']"));
        for (WebElement resultInventory : resultInventories) {
            resultInventory.click();
        }
    }

    public int getGoodCount() {
        List<WebElement> resultInventories = container.findElements(By.cssSelector("#inventory_container .inventory_item"));
        return resultInventories.size();
    }



}
