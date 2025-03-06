package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.GL7_Page;
import pages.MainPage;

public class GL7_Test extends BaseTest {

    @Test
    public void testClickOnLogoGL7() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToGl7Page();
        GL7_Page gl7Page = new GL7_Page(driver, link);
        gl7Page.clickOnLogo();
    }

    @Test
    public void testGoToMainPageFromGL7() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToGl7Page();
        GL7_Page gl7Page = new GL7_Page(driver, link);
        gl7Page.goToMainPage();
    }

    @Test
    public void testGoToAquaPageFromGL7() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToGl7Page();
        GL7_Page gl7Page = new GL7_Page(driver, link);
        gl7Page.goToAquaPage();
    }

    @Test
    public void testGoToGL7FromGL7() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToGl7Page();
        GL7_Page gl7Page = new GL7_Page(driver, link);
        gl7Page.goToGl7Page();
    }

    @Test
    public void testGoToGL21FromGL7() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToGl7Page();
        GL7_Page gl7Page = new GL7_Page(driver, link);
        gl7Page.goToGl21Page();
    }

    @Test
    public void testGoToACP1FromGL7() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToGl7Page();
        GL7_Page gl7Page = new GL7_Page(driver, link);
        gl7Page.goToAcp1Page();
    }

    @Test
    public void testFooterInformationGL7() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToGl7Page();
        GL7_Page gl7Page = new GL7_Page(driver, link);
        gl7Page.chainsDown();
        gl7Page.footerInformation();
        gl7Page.footerInformationCheck();
    }

    @Test
    public void testUpButtonGL7() {
        MainPage mainPage = new MainPage(driver, link);
        mainPage.goToGl7Page();
        GL7_Page gl7Page = new GL7_Page(driver, link);
        gl7Page.chainsDown();
        gl7Page.upButton();
        gl7Page.shouldBeHover();
        gl7Page.clickUpButtonGl7();
    }
}
