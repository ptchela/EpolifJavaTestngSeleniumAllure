package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ACP1_Page;
import pages.MainPage;

public class ACP1_Test extends BaseTest {


    @Test
    public void testClickOnLogoACP1() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAcp1Page();
        ACP1_Page acp1Page = new ACP1_Page(driver, link);
        acp1Page.clickOnLogo();
    }

    @Test
    public void testGoToMainPageFromACP1() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAcp1Page();
        ACP1_Page acp1Page = new ACP1_Page(driver, link);
        acp1Page.goToMainPage();
    }

    @Test
    public void testGoToAquaPageFromACP1() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAcp1Page();
        ACP1_Page acp1Page = new ACP1_Page(driver, link);
        acp1Page.goToAquaPage();
    }

    @Test
    public void testGoToGL7FromACP1() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAcp1Page();
        ACP1_Page acp1Page = new ACP1_Page(driver, link);
        acp1Page.goToGl7Page();
    }

    @Test
    public void testGoToGL21FromACP1() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAcp1Page();
        ACP1_Page acp1Page = new ACP1_Page(driver, link);
        acp1Page.goToGl21Page();
    }

    @Test
    public void testGoToACP1FromACP1() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAcp1Page();
        ACP1_Page acp1Page = new ACP1_Page(driver, link);
        acp1Page.goToAcp1Page();
    }

    @Test
    public void testFooterInformationACP1() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAcp1Page();
        ACP1_Page acp1Page = new ACP1_Page(driver, link);
        acp1Page.chainsDown();
        acp1Page.footerInformation();
        acp1Page.footerInformationCheck();
    }

    @Test
    public void testUpButtonACP1() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToAcp1Page();
        ACP1_Page acp1Page = new ACP1_Page(driver, link);
        acp1Page.chainsDown();
        acp1Page.upButton();
        acp1Page.shouldBeHover();
        acp1Page.clickUpButtonAcp1();
    }
}