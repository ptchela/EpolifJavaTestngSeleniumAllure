package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class GL7Test extends BaseTest {

    @Test
    @Story("TC-003-01 | Epolif GL7 > Logo in the header")
    @Description("Проверка перехода на страницу Epolif GL7 через клик на логотип")
    public void testClickOnLogoGL7() {
        mainPage.goToGl7Page();
        gl7Page.clickOnLogo();
    }

    @Test
    @Story("TC-003-02 | Epolif GL7 > link Главная in the header")
    @Description("Проверка перехода на главную страницу через ссылку 'Главная' на странице Epolif GL7")
    public void testGoToMainPageFromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToMainPage();
    }

    @Test
    @Story("TC-003-03 | Epolif GL7 > link Epolif Aqua in the header")
    @Description("Проверка перехода на страницу Epolif Aqua через страницу Epolif GL7")
    public void testGoToAquaPageFromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToAquaPage();
    }

    @Test
    @Story("TC-003-04 | Epolif GL7 > link Epolif GL7 in the header")
    @Description("Проверка перехода на страницу Epolif GL7 через повторное нажатие на ссылку 'Epolif GL7'")
    public void testGoToGL7FromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToGl7Page();
    }

    @Test
    @Story("TC-003-05 | Epolif GL7 > link Epolif GL21 in the header")
    @Description("Проверка перехода на страницу Epolif GL21 через страницу Epolif GL7")
    public void testGoToGL21FromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToGl21Page();
    }

    @Test
    @Story("TC-003-06 | Epolif GL7 > link Epolif ACP1 in the header")
    @Description("Проверка перехода на страницу Epolif ACP1 через страницу Epolif GL7")
    public void testGoToACP1FromGL7() {
        mainPage.goToGl7Page();
        gl7Page.goToAcp1Page();
    }

    @Test
    @Story("TC-003-07 | Epolif GL7 > footer > information about company")
    @Description("Проверка наличия и корректности информации о компании в футере страницы Epolif GL7")
    public void testFooterInformationGL7() {
        mainPage.goToGl7Page();
        gl7Page.chainsDown();
        gl7Page.footerInformation();
        gl7Page.footerInformationCheck();
    }

    @Test
    @Story("TC-003-08 | Epolif GL7 > footer > Up button")
    @Description("Проверка работоспособности кнопки 'Наверх' на странице Epolif GL7")
    public void testUpButtonGL7() {
        mainPage.goToGl7Page();
        gl7Page.chainsDown();
        gl7Page.upButton();
        gl7Page.shouldBeHover();
        gl7Page.clickUpButtonGl7();
    }
}
