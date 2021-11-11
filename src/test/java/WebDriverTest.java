import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FileExtension;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.ref.WeakReference;
import java.util.List;

public class WebDriverTest {
        @Test
    public  void main() throws InterruptedException {
                System.setProperty("webdriver.chrome.driver","chromedriver");
            org.openqa.selenium.WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://bitsgap.com/sign-in/?d=app");
            WebElement searchLogin = driver.findElement(By.id("lemail"));
            searchLogin.sendKeys("ilyabudnikuttest@mail.ru");
            WebElement searchPassword = driver.findElement(By.id("lpassword"));
            searchPassword.sendKeys("Bulka2002");
            WebElement searchAcceptButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/form/button"));
            searchAcceptButton.click();
            Thread.sleep(6000);
            WebElement searchCloseButton = driver.findElement(By.cssSelector("body > div.modal > div.modal__content > button"));
            searchCloseButton.click();
            WebElement searchMenuButton = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > header > div > div:nth-child(2) > div.page-header__icons > div:nth-child(3) > div > button > span.MuiIconButton-label"));
            searchMenuButton.click();
            WebElement searchDemoMode = driver.findElement(By.cssSelector("body > div.MuiPopover-root > div.MuiPaper-root.MuiPopover-paper.main-menu__popover.MuiPaper-elevation8 > div > div.main-menu__options > ul > li:nth-child(1) > div > div.main-menu-options__demo > label"));
            searchDemoMode.click();
            Thread.sleep(1000);
            WebElement searchCloseButton2 = driver.findElement(By.cssSelector("body > div.modal > div.modal__content > button"));
            searchCloseButton2.click();
            WebElement searchButtonTrading = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > header > div > div:nth-child(1) > div > div > div > div > a:nth-child(1)"));
            searchButtonTrading.click();
            Thread.sleep(2000);
            WebElement searchNicePrice = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.trading-page.trading-page_view_standard > div.trading-page__column.trading-page__column_position_right > div.place-order > div.place-order__content > div:nth-child(4) > div > button > span"));
            searchNicePrice.click();
            WebElement searchInputValues = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.trading-page.trading-page_view_standard > div.trading-page__column.trading-page__column_position_right > div.place-order > div.place-order__content > div:nth-child(5) > div > div > div > input"));
            searchInputValues.sendKeys("0.01");
            WebElement searchAcceptTrade = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.trading-page.trading-page_view_standard > div.trading-page__column.trading-page__column_position_right > div.place-order > div.place-order__content > div.place-order__button > button"));
            searchAcceptTrade.click();
            driver.quit();
    }
}
