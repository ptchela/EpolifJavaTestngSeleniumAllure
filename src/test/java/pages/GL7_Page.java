package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GL7_Page extends BasePage {

    private static final By UP_BUTTON = By.xpath("//a[@class='w-toplink pos_right active']");

    public GL7_Page(WebDriver driver, String link) {
        super(driver, link);
    }


    public void clickUpButtonGl7() {
        driver.findElement(UP_BUTTON).click();
        String upButtonHref = driver.findElement(UP_BUTTON).getAttribute("href");
        Assert.assertEquals(upButtonHref, "https://epolif.ru/epolif-gl-7/#", "Up button href is incorrect");
    }
}
