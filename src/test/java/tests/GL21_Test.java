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
import pages.GL21_Page;
import pages.GL7_Page;
import pages.MainPage;

public class GL21_Test extends BaseTest {

    @Test
    public void testClickOnLogoGL21() {
        mainPage.goToGl21Page();
        gl21Page.clickOnLogo();
    }

    @Test
    public void testGoToMainPageFromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToMainPage();
    }

    @Test
    public void testGoToAquaPageFromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToAquaPage();
    }

    @Test
    public void testGoToGL7FromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToGl7Page();
    }

    @Test
    public void testGoToGL21FromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToGl21Page();
    }

    @Test
    public void testGoToACP1FromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToAcp1Page();
    }

    @Test
    public void testFooterInformationGL21() {
        mainPage.goToGl21Page();
        gl21Page.chainsDown();
        gl21Page.footerInformation();
        gl21Page.footerInformationCheck();
    }

    @Test
    public void testUpButtonGL21() {
        mainPage.goToGl21Page();
        gl21Page.chainsDown();
        gl21Page.upButton();
        gl21Page.shouldBeHover();
        gl21Page.clickUpButtonGl21();

    }
}
