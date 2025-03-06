package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTest {
    protected WebDriver driver;
    protected final String link = "https://epolif.ru/";

    protected MainPage mainPage;
    protected ACP1_Page acp1Page;
    protected AquaPage aquaPage;
    protected GL7_Page gl7Page;
    protected GL21_Page gl21Page;

    @BeforeMethod
    public void setUpTest() {
        mainPage = new MainPage(driver, link);
        acp1Page = new ACP1_Page(driver, link);
        aquaPage = new AquaPage(driver, link);
        gl7Page = new GL7_Page(driver, link);
        gl21Page = new GL21_Page(driver, link);
    }

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(link);
        driver.findElement(By.xpath("//*[@id='details-button']")).click();
        driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
