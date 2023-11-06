package pages;

import components.login.LoginForm;
import data.App;
import lib.Page;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    public static String page = App.baseurl + "/";

    public void openPage() {
        driver.get(page);
    }

    public LoginPage(WebDriver driver) {
        super(driver);

        loginForm = new LoginForm(driver);
    }

    public LoginForm loginForm;
}
