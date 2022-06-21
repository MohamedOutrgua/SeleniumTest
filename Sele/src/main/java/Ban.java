import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ban {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/div/div/main/div[2]/div/div/div/ul[1]/li[2]/a")).click();
        driver.quit();
    }
}
