import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class WebDriverTest {
        @Test
    public  void main() throws InterruptedException {

                System.setProperty("webdriver.gecko.driver","geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            Dimension d = new Dimension(1330,1100);
            driver.get("https://bitsgap.com/sign-in/?d=app");
            driver.manage().window().setSize(d);
            System.out.print(driver.manage().window().getSize() + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            WebElement searchLogin = driver.findElement(By.id("lemail"));
            searchLogin.sendKeys("ilyabudnikuttest@mail.ru");
            WebElement searchPassword = driver.findElement(By.id("lpassword"));
            searchPassword.sendKeys("Bulka2002");
            Thread.sleep(20000);
            WebElement searchAcceptButton = driver.findElement(By.cssSelector("#login-form > button"));
            searchAcceptButton.click();
            Thread.sleep(12000);
            WebElement searchCloseButton = driver.findElement(By.cssSelector(".modal__close-button"));
            searchCloseButton.click();

            WebElement searchMenuButton = driver.findElement(By.cssSelector(".main-menu__button"));
            searchMenuButton.click();
            Thread.sleep(1000);
            WebElement searchDemo = driver.findElement(By.cssSelector(".switch__switch"));
            searchDemo.click();
            Thread.sleep(7000);
            WebElement searchCloseButton2 = driver.findElement(By.cssSelector(".modal__close-button"));
            searchCloseButton2.click();
            WebElement searchTradingButton = driver.findElement(By.cssSelector("a.MuiButtonBase-root:nth-child(1)"));
            searchTradingButton.click();
            Thread.sleep(4000);
            WebElement searchNicePrice = driver.findElement(By.cssSelector(".best-price > button:nth-child(1)"));
            searchNicePrice.click();
            WebElement searchValue = driver.findElement(By.cssSelector("div.place-order__text-input:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
            searchValue.sendKeys("0.01");
            WebElement searchAcceptButton1 = driver.findElement(By.cssSelector(".red-green-button_size_normal"));
            searchAcceptButton1.click();
             driver.quit();
    }
}
