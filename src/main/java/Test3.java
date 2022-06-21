import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver BOA = new ChromeDriver();
        BOA.get("https://www.bankofamerica.com/");
        BOA.findElement(By.name("onlineId1")).sendKeys("My user ID");
        BOA.findElement(By.name("passcode1")).sendKeys("123456789");
        BOA.findElement(By.id("saveOnlineId")).click();
        BOA.findElement(By.id("signIn")).click();
        BOA.quit();
    }
}
