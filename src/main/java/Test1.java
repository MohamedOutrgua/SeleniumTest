import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver BOA = new ChromeDriver();
        BOA.get("https://www.bankofamerica.com/");
        BOA.findElement(By.id("NAV_BUSINESS_ADVANTAGE")).click();
        BOA.quit();
    }
}
