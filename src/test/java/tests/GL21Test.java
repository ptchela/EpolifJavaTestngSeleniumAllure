package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class GL21Test extends BaseTest {

    @Test
    @Story("TC-004-01 | Epolif GL21 > Logo in the header")
    @Description("Проверка перехода на страницу Epolif GL21 через клик на логотип")
    public void testClickOnLogoGL21() {
        mainPage.goToGl21Page();
        gl21Page.clickOnLogo();
    }

    @Test
    @Story("TC-004-02 | Epolif GL21 > link Главная in the header")
    @Description("Проверка перехода на главную страницу через ссылку 'Главная' на странице Epolif GL21")
    public void testGoToMainPageFromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToMainPage();
    }

    @Test
    @Story("TC-004-03 | Epolif GL21 > link Epolif Aqua in the header")
    @Description("Проверка перехода на страницу Epolif Aqua через страницу Epolif GL21")
    public void testGoToAquaPageFromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToAquaPage();
    }

    @Test
    @Story("TC-004-04 | Epolif GL21 > link Epolif GL7 in the header")
    @Description("Проверка перехода на страницу Epolif GL7 через страницу Epolif GL21")
    public void testGoToGL7FromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToGl7Page();
    }

    @Test
    @Story("TC-004-05 | Epolif GL21 > link Epolif GL21 in the header")
    @Description("Проверка повторного перехода на страницу Epolif GL21 через страницу Epolif GL21")
    public void testGoToGL21FromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToGl21Page();
    }

    @Test
    @Story("TC-004-06 | Epolif GL21 > link Epolif ACP1 in the header")
    @Description("Проверка перехода на страницу Epolif ACP1 через страницу Epolif GL21")
    public void testGoToACP1FromGL21() {
        mainPage.goToGl21Page();
        gl21Page.goToAcp1Page();
    }

    @Test
    @Story("TC-004-07 | Epolif GL21 > footer > information about company")
    @Description("Проверка корректности информации о компании в футере страницы Epolif GL21")
    public void testFooterInformationGL21() {
        mainPage.goToGl21Page();
        gl21Page.chainsDown();
        gl21Page.footerInformation();
        gl21Page.footerInformationCheck();
    }

    @Test
    @Story("TC-004-08 | Epolif GL21 > footer > Up button")
    @Description("Проверка работоспособности кнопки 'Наверх' на странице Epolif GL21")
    public void testUpButtonGL21() {
        mainPage.goToGl21Page();
        gl21Page.chainsDown();
        gl21Page.upButton();
        gl21Page.shouldBeHover();
        gl21Page.clickUpButtonGl21();

    }
}
