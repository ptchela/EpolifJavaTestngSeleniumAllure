package tests;


import org.testng.annotations.Test;


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
