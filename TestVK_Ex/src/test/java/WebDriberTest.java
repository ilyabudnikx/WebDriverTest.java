import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
public class WebDriberTest {
    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        Dimension property = new Dimension(1920, 900);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().setSize(property);
        driver.get("https://catalog.onliner.by/headphones");
        Thread.sleep(4000);
        WebElement searchFilterTypeHedphones = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]/div[3]/div[14]/div[3]/ul/li[2]/label/span[1]/span"));
        searchFilterTypeHedphones.click();
        Thread.sleep(200000);


    }
}
