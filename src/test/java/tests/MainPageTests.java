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

    @Test
    public void testClickOnLogoMain() {
        mainPage.clickOnLogo();
    }

    @Test
    public void testGoToMainPage() {
        mainPage.goToMainPage();
    }

    @Test
    public void testGoToAquaPage() {
        mainPage.goToAquaPage();
    }

    @Test
    public void testGoToGl7Page() {
        mainPage.goToGl7Page();
    }

    @Test
    public void testGoToGl21Page() {
        mainPage.goToGl21Page();
    }

    @Test
    public void testGoToAcp1Page() {
        mainPage.goToAcp1Page();
    }

    @Test
    public void testFooterInformation() {
        mainPage.chainsDown();
        mainPage.footerInformation();
        mainPage.footerInformationCheck();
    }

    @Test
    public void testButton() {
        mainPage.chainsDown();
        mainPage.upButton();
        mainPage.shouldBeHover();
        mainPage.clickUpButtonMain();
    }

    @Test
    public void testVideo() {
        mainPage.presenceOfTheVideo();
        mainPage.videoOnRepeat();
    }

}
