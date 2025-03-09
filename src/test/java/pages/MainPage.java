package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver, String link) {
        super(driver, link);
    }

    private static final By UP_BUTTON = By.xpath("//a[@title='Наверх']");
    private static final By VIDEO = By.xpath("//video");

    public void clickUpButtonMain() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement upButton = wait.until(ExpectedConditions.elementToBeClickable(UP_BUTTON));
        driver.findElement(UP_BUTTON).click();
        String upButtonHref = driver.findElement(UP_BUTTON).getAttribute("href");
        Assert.assertEquals(upButtonHref, "https://epolif.ru/#", "Up button href is incorrect");
    }

    public void presenceOfTheVideo() {
        Assert.assertTrue(isElementPresent(VIDEO), "Element is absent");
    }

    public void videoOnRepeat() {
        driver.findElement(VIDEO);
        String videoLoopAttribute = driver.findElement(VIDEO).getAttribute("loop");
        Assert.assertEquals(videoLoopAttribute, "true", "Video loop attribute is not 'true'");
    }

}
