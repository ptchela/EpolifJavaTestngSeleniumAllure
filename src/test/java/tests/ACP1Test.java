package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ACP1Test extends BaseTest {

    @Test
    @Story("TC-002-01 | Epolif ACP1 > Logo in the header")
    @Description("Проверка перехода на страницу ACP1 через клик на логотип")
    public void testClickOnLogoACP1() {
        mainPage.goToAcp1Page();
        acp1Page.clickOnLogo();
    }

    @Test
    @Story("TC-002-02 | Epolif ACP1 > link Главная in the header")
    @Description("Проверка перехода на главную страницу через ссылку 'Главная' на странице ACP1")
    public void testGoToMainPageFromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToMainPage();
    }

    @Test
    @Story("TC-002-03 | Epolif ACP1 > link Epolif Aqua in the header")
    @Description("Проверка перехода на страницу Epolif Aqua через страницу ACP1")
    public void testGoToAquaPageFromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToAquaPage();
    }

    @Test
    @Story("TC-002-04 | Epolif ACP1 > link Epolif GL7 in the header")
    @Description("Проверка перехода на страницу Epolif GL7 через страницу ACP1")
    public void testGoToGL7FromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToGl7Page();
    }

    @Test
    @Story("TC-002-05 | Epolif ACP1 > link Epolif GL21 in the header")
    @Description("Проверка перехода на страницу Epolif GL21 через страницу ACP1")
    public void testGoToGL21FromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToGl21Page();
    }

    @Test
    @Story("TC-002-06 | Epolif ACP1 > link Epolif ACP1 in the header")
    @Description("Проверка перехода на страницу Epolif ACP1 через страницу ACP1")
    public void testGoToACP1FromACP1() {
        mainPage.goToAcp1Page();
        acp1Page.goToAcp1Page();
    }

    @Test
    @Story("TC-002-07 | Epolif ACP1 > footer > information about company")
    @Description("Проверка информации о компании в футере страницы ACP1")
    public void testFooterInformationACP1() {
        mainPage.goToAcp1Page();
        acp1Page.chainsDown();
        acp1Page.footerInformation();
        acp1Page.footerInformationCheck();
    }

    @Test
    @Story("TC-002-08 | Epolif ACP1 > footer > Up button")
    @Description("Проверка работоспособности кнопки 'Наверх' на странице ACP1")
    public void testUpButtonACP1() {
        mainPage.goToAcp1Page();
        acp1Page.chainsDown();
        acp1Page.upButton();
        acp1Page.shouldBeHover();
        acp1Page.clickUpButtonAcp1();
    }
}