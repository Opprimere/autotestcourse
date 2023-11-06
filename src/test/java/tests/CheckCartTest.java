package tests;

import data.App;
import lib.Authentication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.*;
import utilities.BaseDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckCartTest {

    static BaseDriver baseDriver;

    @BeforeAll
    public static void init() {
        baseDriver = new BaseDriver();
        Authentication.login(App.username, App.password);
    }

    @AfterAll
    public static void quit(){
        baseDriver.Quit();
    }

    @Test
    public void checkTotalSumOfGoods() {
        InventoryPage inventoryPage = new InventoryPage(BaseDriver.driver);
        inventoryPage.inventory.addAllGoodsToCart();
        int inventoryCount = inventoryPage.inventory.getGoodCount();

        CartPage cartPage = inventoryPage.header.clickCartButton();
        int cartListCount = cartPage.cartlist.getGoodCount();
        assertEquals(inventoryCount, cartListCount);

        CheckoutStepOnePage checkoutStepOnePage = cartPage.cartFooter.clickCheckoutButton();
        checkoutStepOnePage.checkoutForm.enterFirstName("Dmitry");
        checkoutStepOnePage.checkoutForm.enterLastName("Kulagin");
        checkoutStepOnePage.checkoutForm.enterPostalCode("666");

        CheckoutStepTwoPage checkoutStepTwoPage = checkoutStepOnePage.checkoutForm.clickContinueButton();
        boolean isTotalEqual140 = checkoutStepTwoPage.summaryInfo.isTotalEqual(140);
        assertTrue(isTotalEqual140);
    }
}
