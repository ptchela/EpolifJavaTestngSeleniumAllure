package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AquaPage extends BasePage {

    private static final By UP_BUTTON = By.xpath("//a[@class='w-toplink pos_right active']");

    public AquaPage(WebDriver driver, String link) {
        super(driver, link);
    }

    public void clickUpButtonAqua() {
        driver.findElement(UP_BUTTON).click();
        String upButtonHref = driver.findElement(UP_BUTTON).getAttribute("href");
        Assert.assertEquals(upButtonHref, "https://epolif.ru/epolif-aqua/#", "Up button href is incorrect");
    }
}
