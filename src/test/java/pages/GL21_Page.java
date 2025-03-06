package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GL21_Page extends BasePage {


    public GL21_Page(WebDriver driver, String link) {
        super(driver, link);
    }

    /**
     * Метод проверки работы кнопки "Наверх" на странице GL21.
     */
    public void clickUpButtonGl21() {
        driver.findElement(UP_BUTTON2).click();
        String upButtonHref = driver.findElement(UP_BUTTON2).getAttribute("href");
        Assert.assertEquals(upButtonHref, "https://epolif.ru/epolif-gl-21/#", "Up button href is incorrect");
    }
}

