package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest {

    @Test
    @Story("TC-001-02 | Main page > Logo in the header")
    @Description("Проверка перехода на главную страницу по нажатию на логотип")
    public void testClickOnLogoMain() {
        mainPage.clickOnLogo();
    }

    @Test
    @Story("TC-001-03 | Main page > link Главная in the header")
    @Description("Проверка перехода на главную страницу по нажатию на ссылку 'Главная'")
    public void testGoToMainPage() {
        mainPage.goToMainPage();
    }

    @Test
    @Story("TC-001-04 | Main page > link Epolif Aqua in the header")
    @Description("Проверка перехода на страницу Epolif Aqua")
    public void testGoToAquaPage() {
        mainPage.goToAquaPage();
    }

    @Test
    @Story("TC-001-05 | Main page > link Epolif GL7 in the header")
    @Description("Проверка перехода на страницу Epolif GL7")
    public void testGoToGl7Page() {
        mainPage.goToGl7Page();
    }

    @Test
    @Story("TC-001-06 | Main page > link Epolif GL21 in the header")
    @Description("Проверка перехода на страницу Epolif GL21")
    public void testGoToGl21Page() {
        mainPage.goToGl21Page();
    }

    @Test
    @Story("TC-001-07 | Main page > link Epolif ACP1 in the header")
    @Description("Проверка перехода на страницу Epolif ACP1")
    public void testGoToAcp1Page() {
        mainPage.goToAcp1Page();
    }

    @Test
    @Story("TC-001-10 | Main page > footer > information about company")
    @Description("Проверка наличия и корректности информации о компании в футере")
    public void testFooterInformation() {
        mainPage.chainsDown();
        mainPage.footerInformation();
        mainPage.footerInformationCheck();
    }

    @Test
    @Story("TC-001-11 | Main page > footer > Up button")
    @Description("Проверка работоспособности кнопки 'Наверх' в футере")
    public void testButton() {
        mainPage.chainsDown();
        mainPage.upButton();
        mainPage.shouldBeHover();
        mainPage.clickUpButtonMain();
    }

    @Test
    @Story("TC-001-01 | Main page > Presence of the promo video")
    @Description("Проверка наличия промо видео на главной странице и его повторяемости")
    public void testVideo() {
        mainPage.presenceOfTheVideo();
        mainPage.videoOnRepeat();
    }
}
