package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AquaPage;
import pages.MainPage;

public class AquaTest extends BaseTest {


    @Test
    public void testClickOnLogoAqua() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAquaPage();
        AquaPage aquaPage = new AquaPage(driver, link);
        aquaPage.clickOnLogo();
    }

    @Test
    public void testGoToMainPageFromAqua() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAquaPage();
        AquaPage aquaPage = new AquaPage(driver, link);
        aquaPage.goToMainPage();
    }

    @Test
    public void testGoToAquaPageFromAqua() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAquaPage();
        AquaPage aquaPage = new AquaPage(driver, link);
        aquaPage.goToAquaPage();
    }

    @Test
    public void testGoToGl7FromAqua() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAquaPage();
        AquaPage aquaPage = new AquaPage(driver, link);
        aquaPage.goToGl7Page();
    }

    @Test
    public void testGoToGl21FromAqua() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAquaPage();
        AquaPage aquaPage = new AquaPage(driver, link);
        aquaPage.goToGl21Page();
    }

    @Test
    public void testGoToAcp1FromAqua() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAquaPage();
        AquaPage aquaPage = new AquaPage(driver, link);
        aquaPage.goToAcp1Page();
    }

    @Test
    public void testFooterInformationAqua() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAquaPage();
        AquaPage aquaPage = new AquaPage(driver, link);
        aquaPage.chainsDown();
        aquaPage.footerInformation();
        aquaPage.footerInformationCheck();
    }

    @Test
    public void testUpButtonAqua() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAquaPage();
        AquaPage aquaPage = new AquaPage(driver, link);
        aquaPage.chainsDown();
        aquaPage.upButton();
        aquaPage.shouldBeHover();
        aquaPage.clickUpButtonAqua();
    }
}
