package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTests {

    private WebDriver driver;
    private final String link = "https://epolif.ru/";

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

    @Test
    public void testClickOnLogoMain() {
        MainPage page = new MainPage(driver, link);
        page.clickOnLogo();
    }

    @Test
    public void testGoToMainPage() {
        MainPage page = new MainPage(driver, link);
        page.goToMainPage();
    }

    @Test
    public void testFooterInformation() {
        MainPage page = new MainPage(driver, link);
        page.chainsDown();
        page.footerInformation();
        page.footerInformationCheck();
    }

    @Test
    public void testButton() {
        MainPage page = new MainPage(driver, link);
        page.presenceOfTheVideo();
        page.videoOnRepeat();
    }

}
