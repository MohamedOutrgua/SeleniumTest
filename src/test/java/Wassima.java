import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wassima {
    @Test
public void TestN1() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
        ChromeDriver Wassi = new ChromeDriver();
        Wassi.get("https://www.linkedin.com/");
        Wassi.findElement(By.id("session_key")).sendKeys("mohamedoutrgua@gmail.com");
        Wassi.findElement(By.id("session_password")).sendKeys("JY1122410011991");
        Wassi.findElement(By.xpath("/html/body/main/section[1]/div/div/form/button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("253625");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("253695");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("245852");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("258596");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("285345");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("255263");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("252245");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("296645");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("299945");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("263665");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("322645");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
        Wassi.findElement(By.id("input__email_verification_pin")).sendKeys("258952");
        Wassi.findElement(By.id("email-pin-submit-button")).click();
    }
}
