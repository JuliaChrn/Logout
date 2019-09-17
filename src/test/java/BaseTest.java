import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigurationProperties;
import utils.WebDriverFactory;

























































public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String environment;

    @BeforeMethod
    public void before() {
        driver = WebDriverFactory.getDriver(ConfigurationProperties.getBrowser());
        wait = new WebDriverWait(driver, 10);
        environment = ConfigurationProperties.getEnvironment();
    }

   // @AfterMethod
   // public void after() {
     //   driver.close();
   // }
}
