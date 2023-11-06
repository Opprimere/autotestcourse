package lib;

import pages.LoginPage;
import utilities.BaseDriver;

public abstract class Authentication {
    public static void login(String login, String password) {
        LoginPage loginPage = new LoginPage(BaseDriver.driver);
        loginPage.openPage();

        loginPage.loginForm.enterLogin(login);
        loginPage.loginForm.enterPassword(password);
        loginPage.loginForm.clickSubmitButton();
    }
}
