import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Main  {
    public static void main(String[] args) throws InterruptedException {
        //Инициализация драйвера
        System.setProperty("webdriver.gecko.driver", "../webdrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        // Вводим текст
        element.sendKeys("let me google it for you");
        element.submit();

        //Делаем небольшую задержку,чтобы посмотреть на работу
        TimeUnit.SECONDS.sleep(10);

        // Закрываем браузер
        driver.quit();
    }
}