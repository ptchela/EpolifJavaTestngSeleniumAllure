package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ACP1_Page;
import pages.MainPage;

public class MainPageTests extends BaseTest {

    private MainPage page;

    @BeforeMethod
    public void setUpTest() {
        page = new MainPage(driver, link);
    }

    @Test
    public void testClickOnLogoMain() {
        page.clickOnLogo();
    }

    @Test
    public void testGoToMainPage() {
        page.goToMainPage();
    }

    @Test
    public void testGoToAquaPage() {
        page.goToAquaPage();
    }

    @Test
    public void testGoToGl7Page() {
        page.goToGl7Page();
    }

    @Test
    public void testGoToGl21Page() {
        page.goToGl21Page();
    }

    @Test
    public void testGoToAcp1Page() {
        page.goToAcp1Page();
    }

    @Test
    public void testFooterInformation() {
        page.chainsDown();
        page.footerInformation();
        page.footerInformationCheck();
    }

    @Test
    public void testButton() {
        page.chainsDown();
        page.upButton();
        page.shouldBeHover();
        page.clickUpButtonMain();
    }

    @Test
    public void testVideo() {
        page.presenceOfTheVideo();
        page.videoOnRepeat();
    }

}
