import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver BOA = new ChromeDriver();
        BOA.get("https://www.bankofamerica.com/");
        BOA.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[2]/a/span[3]")).click();
        BOA.quit();
    }
}
