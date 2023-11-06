package components.summary;

import lib.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SummaryInfo extends Component {

    public SummaryInfo(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkout_summary_container .summary_total_label")
    private WebElement total;

    public boolean isTotalEqual(int sum) {
        Pattern patternTotalSum = Pattern.compile("\\$(\\d+)\\.\\d+");
        Matcher matcherTotalSum = patternTotalSum.matcher(total.getText());
        if (matcherTotalSum.find()) {
            int total = Integer.parseInt(matcherTotalSum.group(1));
            return total == sum;
        }

        return false;
    }
}
