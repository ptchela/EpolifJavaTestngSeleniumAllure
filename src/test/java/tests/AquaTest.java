package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class AquaTest extends BaseTest {

    @Test
    @Story("TC-005-01 | Epolif Aqua > Logo in the header")
    @Description("Проверка перехода на страницу Epolif Aqua через клик на логотип")
    public void testClickOnLogoAqua() {
        mainPage.goToAquaPage();
        aquaPage.clickOnLogo();
    }

    @Test
    @Story("TC-005-02 | Epolif Aqua > link Главная in the header")
    @Description("Проверка перехода на главную страницу через ссылку 'Главная' на странице Epolif Aqua")
    public void testGoToMainPageFromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToMainPage();
    }

    @Test
    @Story("TC-005-03 | Epolif Aqua > link Epolif Aqua in the header")
    @Description("Проверка перехода на страницу Epolif Aqua через ссылку 'Epolif Aqua'")
    public void testGoToAquaPageFromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToAquaPage();
    }

    @Test
    @Story("TC-005-04 | Epolif Aqua > link Epolif GL7 in the header")
    @Description("Проверка перехода на страницу Epolif GL7 через страницу Epolif Aqua")
    public void testGoToGl7FromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToGl7Page();
    }

    @Test
    @Story("TC-005-05 | Epolif Aqua > link Epolif GL21 in the header")
    @Description("Проверка перехода на страницу Epolif GL21 через страницу Epolif Aqua")
    public void testGoToGl21FromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToGl21Page();
    }

    @Test
    @Story("TC-005-06 | Epolif Aqua > link Epolif ACP1 in the header")
    @Description("Проверка перехода на страницу Epolif ACP1 через страницу Epolif Aqua")
    public void testGoToAcp1FromAqua() {
        mainPage.goToAquaPage();
        aquaPage.goToAcp1Page();
    }

    @Test
    @Story("TC-005-07 | Epolif Aqua > footer > information about company")
    @Description("Проверка корректности информации о компании в футере страницы Epolif Aqua")
    public void testFooterInformationAqua() {
        mainPage.goToAquaPage();
        aquaPage.chainsDown();
        aquaPage.footerInformation();
        aquaPage.footerInformationCheck();
    }

    @Test
    @Story("TC-005-08 | Epolif Aqua > footer > Up button")
    @Description("Проверка работоспособности кнопки 'Наверх' на странице Epolif Aqua")
    public void testUpButtonAqua() {
        mainPage.goToAquaPage();
        aquaPage.chainsDown();
        aquaPage.upButton();
        aquaPage.shouldBeHover();
        aquaPage.clickUpButtonAqua();
    }
}
