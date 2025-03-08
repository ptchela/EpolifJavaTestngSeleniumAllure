package tests;


import org.testng.annotations.Test;

public class ACP1Test extends BaseTest {

    @Test
    public void testClickOnLogoACP1() {
        mainPage.goToAcp1Page();
        acp1Page.clickOnLogo();
    }

    @Test
    public void testGoToMainPageFromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToMainPage();
    }

    @Test
    public void testGoToAquaPageFromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToAquaPage();
    }

    @Test
    public void testGoToGL7FromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToGl7Page();
    }

    @Test
    public void testGoToGL21FromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToGl21Page();
    }

    @Test
    public void testGoToACP1FromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToAcp1Page();
    }

    @Test
    public void testFooterInformationACP1() {
        mainPage.goToAcp1Page();
        acp1Page.chainsDown();
        acp1Page.footerInformation();
        acp1Page.footerInformationCheck();
    }

    @Test
    public void testUpButtonACP1() {
        mainPage.goToAcp1Page();
        acp1Page.chainsDown();
        acp1Page.upButton();
        acp1Page.shouldBeHover();
        acp1Page.clickUpButtonAcp1();
    }
}