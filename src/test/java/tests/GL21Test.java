package tests;

import org.testng.annotations.Test;

public class GL21Test extends BaseTest {

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
