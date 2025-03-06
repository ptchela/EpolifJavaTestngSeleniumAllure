package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasePage {

    static {
        WebDriverManager.chromedriver().setup();
    }

    protected WebDriver driver;
    protected String link;


    private static final By LINK_MAIN = By.xpath("//span[text()='Главная']");
    private static final By VIDEO = By.xpath("//video");
    private static final By LINK_AQUA = By.xpath("//span[text()='Epolif Aqua']");
    private static final By LINK_GL7 = By.xpath("//span[text()='Epolif GL 7']");
    private static final By LINK_GL21 = By.xpath("//span[text()='Epolif GL 21']");
    private static final By LINK_ACP1 = By.xpath("//span[text()='Epolif ACP 1']");
    private static final By FOOTER_ABOUT = By.id("page-footer");
    private static final By UP_BUTTON = By.xpath("//a[@title='Наверх']");
    private static final By LOGO = By.xpath("//a[@aria-label='Ссылка']");

    public BasePage(WebDriver driver, String link) {
        this.driver = driver;
        this.link = link;
    }


    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public void clickOnLogo() {
        driver.findElement(LOGO).click();
        Assert.assertTrue(isElementPresent(VIDEO), "Not main page");
    }

    public void goToMainPage() {
        driver.findElement(LINK_MAIN).click();
        Assert.assertTrue(isElementPresent(VIDEO), "Not main page");
    }

    public void goToAquaPage() {
        driver.findElement(LINK_AQUA).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("epolif-aqua"), "Wrong Page");
    }

    public void goToGl7Page() {
        driver.findElement(LINK_GL7).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("epolif-gl-7/"), "Wrong page");
    }

    public void goToGl21Page() {
        driver.findElement(LINK_GL21).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("epolif-gl-21/"), "Wrong page");
    }

    public void goToAcp1Page() {
        driver.findElement(LINK_ACP1).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("epolif-acp-1/"), "Wrong page");
    }

    public void footerInformation() {
        Assert.assertTrue(isElementPresent(FOOTER_ABOUT), "Element is absent");
    }

    public void footerInformationCheck() {
        String info = driver.findElement(FOOTER_ABOUT).getText();
        Assert.assertEquals(info, "© 2023 ООО «Базис-Инвест» — Все права защищены.");
    }

    public void chainsDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void upButton() {
        Assert.assertTrue(isElementPresent(UP_BUTTON), "Element is absent");
    }

    public void shouldBeHover() {
        String cssValue = driver.findElement(UP_BUTTON).getCssValue("cursor");
        Assert.assertEquals(cssValue, "pointer");
    }


}
