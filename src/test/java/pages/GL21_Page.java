package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GL21_Page extends BasePage {

    private static final By UP_BUTTON = By.xpath("//a[@class='w-toplink pos_right active']");

    public GL21_Page(WebDriver driver, String link) {
        super(driver, link);
    }

    /**
     * Метод проверки работы кнопки "Наверх" на странице GL21.
     */
    public void clickUpButtonGl21() {
        driver.findElement(UP_BUTTON).click();
        String upButtonHref = driver.findElement(UP_BUTTON).getAttribute("href");
        Assert.assertEquals(upButtonHref, "https://epolif.ru/epolif-gl-21/#", "Up button href is incorrect");
    }
}

