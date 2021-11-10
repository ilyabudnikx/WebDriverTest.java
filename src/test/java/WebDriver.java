import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    public static void main(String[] args) throws InterruptedException {
        org.openqa.selenium.WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bitsgap.com/sign-in/?d=app");
        WebElement searchLogin =  driver.findElement(By.id("lemail"));
        searchLogin.sendKeys("ilyabudnikuttest@mail.ru");
        WebElement searchPassword = driver.findElement(By.id("lpassword"));
        searchPassword.sendKeys("Bulka2002");
        WebElement searchAcceptButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/form/button"));
        searchAcceptButton.click();
        Thread.sleep(6000);
        WebElement searchButtonClassicalBot = driver.findElement(By.cssSelector("body > div.modal > div.modal__content > div > div.options-menu__list > div:nth-child(2)"));
        searchButtonClassicalBot.click();
        WebElement searchAccountButton = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > header > div > div:nth-child(2) > div.page-header__icons > div:nth-child(3) > div > button > span.MuiIconButton-label > svg"));
        searchAccountButton.click();
        WebElement searchDemoSlider = driver.findElement(By.cssSelector("body > div.MuiPopover-root > div.MuiPaper-root.MuiPopover-paper.main-menu__popover.MuiPaper-elevation8 > div > div.main-menu__options > ul > li:nth-child(1) > div > div.main-menu-options__demo > label > div"));
        searchDemoSlider.click();
        Thread.sleep(10000);
        WebElement searchButtonClassicalBot2 = driver.findElement(By.cssSelector("body > div.modal > div.modal__content > div > div.options-menu__list > div:nth-child(2)"));
        searchButtonClassicalBot2.click();
        WebElement searchButtonSee = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.bots-page > div > div.bots-page__column.bots-page__column_with-bot-form > div:nth-child(1) > div > div.create-bot-form > form > div.create-bot-buttons > div.create-bot-buttons__button > button"));
        searchButtonSee.click();
        WebElement searchButtonAcceptCreateBot = driver.findElement(By.cssSelector("#root > main > div > div > div > div > div > div > div.bots-page > div > div.bots-page__column.bots-page__column_with-bot-form > div:nth-child(1) > div > div.bot-preview__footer > button.MuiButtonBase-root.MuiButton-root.MuiButton-text.button.button_color_blue.button_size_large.button_border-color_blue.MuiButton-fullWidth"));
        searchButtonAcceptCreateBot.click();
        Thread.sleep(15000);
        WebElement searchAcceptButton2 = driver.findElement(By.cssSelector("body > div.modal > div.modal__content > div > div > div.modal-buttons > button.MuiButtonBase-root.MuiButton-root.MuiButton-text.button.button_color_blue.button_size_large.button_border-color_blue"));
        searchAcceptButton2.click();
        driver.quit();
    }
}
