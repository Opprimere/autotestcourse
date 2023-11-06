package lib;

import org.openqa.selenium.WebDriver;


public abstract class Page extends Component {
    public static String page;

    public Page(WebDriver driver) {
        super(driver);
    }

    public abstract void openPage();
}