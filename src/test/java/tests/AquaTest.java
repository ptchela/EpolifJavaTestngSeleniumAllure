package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ACP1_Page;
import pages.AquaPage;
import pages.MainPage;

public class AquaTest extends BaseTest {

    private MainPage mainPage;
    private AquaPage aquaPage;

    @BeforeMethod
    public void setUpTest() {
        mainPage = new MainPage(driver, link);
        aquaPage = new AquaPage(driver, link);
    }


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
