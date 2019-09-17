package model;

import model.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.function.Supplier;

public class LoginPage extends BasePage {

    private Supplier<WebElement> emailInput;
    private Supplier<WebElement> passwordInput;
    private Supplier<WebElement> signInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.emailInput = () -> findElement(By.cssSelector("input[type='email']"));
        this.passwordInput = () -> findElement(By.cssSelector("input[type='password']"));
        this.signInButton = () -> findElement(By.xpath("//button[.='Sign In']"));
    }

    public WebElement emeilInput() {
        return emailInput.get();
    }

    public WebElement passWordInput() {
        return passwordInput.get();
    }

    public WebElement signInButton() {
        return signInButton.get();
    }

     public void login(String email, String password) {
         emeilInput().sendKeys(email);
         passWordInput().sendKeys(password );
         signInButton().click();
    }
}
