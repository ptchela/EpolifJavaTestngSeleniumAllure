package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTests extends BaseTest {

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
    public void testGoToAquaPage() {
        MainPage page = new MainPage(driver, link);
        page.goToAquaPage();
    }

    @Test
    public void testGoToGl7Page() {
        MainPage page = new MainPage(driver, link);
        page.goToGl7Page();
    }

    @Test
    public void testGoToGl21Page() {
        MainPage page = new MainPage(driver, link);
        page.goToGl21Page();
    }

    @Test
    public void testGoToAcp1Page() {
        MainPage page = new MainPage(driver, link);
        page.goToAcp1Page();
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
        page.chainsDown();
        page.upButton();
        page.shouldBeHover();
        page.clickUpButtonMain();
    }

    @Test
    public void testVideo() {
        MainPage page = new MainPage(driver, link);
        page.presenceOfTheVideo();
        page.videoOnRepeat();
    }

}
