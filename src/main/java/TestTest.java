import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver Test = new ChromeDriver();
        Test.get("https://www.facebook.com/#");
        Test.findElement(By.name("email")).sendKeys("This is my email");
        Test.findElement(By.name("pass")).sendKeys("123456");
        Test.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]")).click();
    }
}
