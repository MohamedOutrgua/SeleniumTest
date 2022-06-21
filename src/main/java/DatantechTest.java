import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatantechTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver Fb = new ChromeDriver();
        Fb.get("https://www.facebook.com/#");
        Fb.findElement(By.name("email")).sendKeys("Mohamed@gmail.com");
        Fb.findElement(By.name("pass")).sendKeys("1234567889");
        Fb.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]")).click();
        Thread.sleep(3000);
        Fb.quit();



        
    }
}
