package model.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends Component {

    public BasePage(WebDriver driver) {
        super(driver, driver.findElement(By.tagName("html")));
    }

}
