package tests;

import org.testng.annotations.Test;

public class AquaTest extends BaseTest {

    @Test
    public void testClickOnLogoAqua() {
        mainPage.goToAquaPage();
        aquaPage.clickOnLogo();
    }

    @Test
    public void testGoToMainPageFromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToMainPage();
    }

    @Test
    public void testGoToAquaPageFromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToAquaPage();
    }

    @Test
    public void testGoToGl7FromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToGl7Page();
    }

    @Test
    public void testGoToGl21FromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToGl21Page();
    }

    @Test
    public void testGoToAcp1FromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToAcp1Page();
    }

    @Test
    public void testFooterInformationAqua() {
        mainPage.goToAquaPage();
        aquaPage.chainsDown();
        aquaPage.footerInformation();
        aquaPage.footerInformationCheck();
    }

    @Test
    public void testUpButtonAqua() {
        mainPage.goToAquaPage();
        aquaPage.chainsDown();
        aquaPage.upButton();
        aquaPage.shouldBeHover();
        aquaPage.clickUpButtonAqua();
    }
}
