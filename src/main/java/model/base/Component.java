package model.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Component {

    private WebDriver driver;
    private WebElement element;

    public Component(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public WebElement getElement() {
        return element;
    }

    protected WebElement findElement(By by) {
        return element.findElement(by);
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
