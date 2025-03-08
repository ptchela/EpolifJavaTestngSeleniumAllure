package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GL7_Page extends BasePage {


    public GL7_Page(WebDriver driver, String link) {
        super(driver, link);
    }


    public void clickUpButtonGl7() {
        driver.findElement(UP_BUTTON2).click();
        String upButtonHref = driver.findElement(UP_BUTTON2).getAttribute("href");
        Assert.assertEquals(upButtonHref, "https://epolif.ru/epolif-gl-7/#", "Up button href is incorrect");
    }
}
