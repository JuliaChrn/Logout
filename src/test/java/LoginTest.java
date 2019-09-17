import model.LoginPage;
import static org.testng.Assert.*;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLoginTest() {
        driver.get(environment);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("yuliacherneva@suuchi.com", "Suuchi123!");
        wait.until(ExpectedConditions.urlContains("/dashboard/home"));
    }

}
