import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FirstTest extends BaseUtils {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void Base() {
        driver.get("https://www.google.com/");// открыли гугл
        driver.manage().window().fullscreen();// открыли окно
        driver.manage().deleteAllCookies();// удалили куки
    }

    @Test
    public void Test() throws AWTException {

        driver.findElement(By.name("q")).sendKeys("Selenium");//печатает слово Selenium
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);// нажимает ентер
    }

    @AfterMethod
    void Close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();//закрывает окно
    }
}
