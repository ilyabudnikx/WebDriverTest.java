import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FileExtension;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.ref.WeakReference;
import java.util.List;

public class WebDriverTest {
        @Test
    public  void main() throws InterruptedException {

                System.setProperty("webdriver.gecko.driver","geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://bitsgap.com/sign-in/?d=app");

            System.out.print(driver.manage().window().getSize() + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            WebElement searchLogin = driver.findElement(By.id("lemail"));
            searchLogin.sendKeys("ilyabudnikuttest@mail.ru");
            WebElement searchPassword = driver.findElement(By.id("lpassword"));
            searchPassword.sendKeys("Bulka2002");
            Thread.sleep(1000);
            WebElement searchAcceptButton = driver.findElement(By.cssSelector("#login-form > button"));
            searchAcceptButton.click();
            Thread.sleep(12000);
            WebElement searchCloseButton = driver.findElement(By.cssSelector("body > div.modal > div.modal__content.modal__content_mobile > button"));
            searchCloseButton.click();

            WebElement searchMenuButton = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.m-bots-page__header > div.m-page-header > div:nth-child(1) > button"));
            searchMenuButton.click();
            Thread.sleep(1000);
            WebElement searchDemo = driver.findElement(By.cssSelector("body > div.MuiDrawer-root.MuiDrawer-modal > div.MuiPaper-root.MuiDrawer-paper.m-page-header__menu.MuiDrawer-paperAnchorLeft.MuiPaper-elevation16 > div > div.m-main-menu__switches > div:nth-child(1) > label"));
            searchDemo.click();
            Thread.sleep(7000);
            WebElement searchCloseButton2 = driver.findElement(By.cssSelector("body > div.modal > div.modal__content.modal__content_mobile > button"));
            searchCloseButton2.click();
            WebElement searchTradingButton = driver.findElement(By.cssSelector("body > div.MuiDrawer-root.MuiDrawer-modal > div.MuiPaper-root.MuiDrawer-paper.m-page-header__menu.MuiDrawer-paperAnchorLeft.MuiPaper-elevation16 > div > div.m-main-menu__content > ul > li:nth-child(1) > div > a"));
            searchTradingButton.click();
            Thread.sleep(4000);
            WebElement searchNicePrice = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.m-trading-page > div.m-trading-page__tab-content > div.m-trading-page__view.m-trading-page__view_trading.m-trading-page__view_visible > div.m-trading-page__place-order > div > div.place-order__content > div:nth-child(4) > div > button"));
            searchNicePrice.click();
            WebElement searchValue = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.m-trading-page > div.m-trading-page__tab-content > div.m-trading-page__view.m-trading-page__view_trading.m-trading-page__view_visible > div.m-trading-page__place-order > div > div.place-order__content > div:nth-child(5) > div > div > div > div > input"));
            searchValue.sendKeys("0.01");
            WebElement searchAcceptButton1 = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.m-trading-page > div.m-trading-page__tab-content > div.m-trading-page__view.m-trading-page__view_trading.m-trading-page__view_visible > div.m-trading-page__place-order > div > div.place-order__content > div.place-order__button > button"));
            searchAcceptButton1.click();
            driver.quit();
    }
}
