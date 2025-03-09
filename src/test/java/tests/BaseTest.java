package tests;

import config.ChromeDriverConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

public class BaseTest {

    protected WebDriver driver;
    protected static final String LINK = "https://epolif.ru/";

    protected MainPage mainPage;
    protected ACP1_Page acp1Page;
    protected AquaPage aquaPage;
    protected GL7_Page gl7Page;
    protected GL21_Page gl21Page;

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = ChromeDriverConfig.getChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(LINK);
    }

    @BeforeClass
    public void setUpTest() {

        mainPage = new MainPage(driver, LINK);
        acp1Page = new ACP1_Page(driver, LINK);
        aquaPage = new AquaPage(driver, LINK);
        gl7Page = new GL7_Page(driver, LINK);
        gl21Page = new GL21_Page(driver, LINK);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
