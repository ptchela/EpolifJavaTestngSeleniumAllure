package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ACP1_Page;
import pages.GL7_Page;
import pages.MainPage;

public class GL7_Test extends BaseTest {

    @Test
    public void testClickOnLogoGL7() {
        mainPage.goToGl7Page();
        gl7Page.clickOnLogo();
    }

    @Test
    public void testGoToMainPageFromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToMainPage();
    }

    @Test
    public void testGoToAquaPageFromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToAquaPage();
    }

    @Test
    public void testGoToGL7FromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToGl7Page();
    }

    @Test
    public void testGoToGL21FromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToGl21Page();
    }

    @Test
    public void testGoToACP1FromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToAcp1Page();
    }

    @Test
    public void testFooterInformationGL7() {
        mainPage.goToGl7Page();
        gl7Page.chainsDown();
        gl7Page.footerInformation();
        gl7Page.footerInformationCheck();
    }

    @Test
    public void testUpButtonGL7() {
        mainPage.goToGl7Page();
        gl7Page.chainsDown();
        gl7Page.upButton();
        gl7Page.shouldBeHover();
        gl7Page.clickUpButtonGl7();
    }
}
