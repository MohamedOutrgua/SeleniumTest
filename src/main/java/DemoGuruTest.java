import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoGuruTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver GuruTest = new ChromeDriver();
        GuruTest.get("https://demo.guru99.com/test/newtours/register.php");
        System.out.println(GuruTest.getCurrentUrl());

        GuruTest.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("MOHAMED");
        GuruTest.findElement(By.name("lastName")).sendKeys("OUT");
        GuruTest.findElement(By.name("phone")).sendKeys("5712532453");
        GuruTest.findElement(By.id("userName")).sendKeys("ABC@XYZ.COM");
        GuruTest.findElement(By.name("address1")).sendKeys("5055 Seminary RD");
        GuruTest.findElement(By.name("city")).sendKeys("Alexandria");
        GuruTest.findElement(By.name("state")).sendKeys("VA");
        GuruTest.findElement(By.name("postalCode")).sendKeys("22311");

        Select country = new Select(GuruTest.findElement(By.name("country")));
        country.selectByVisibleText("AUSTRALIA");

        GuruTest.findElement(By.id("email")).sendKeys("mohamed");
        GuruTest.findElement(By.name("password")).sendKeys("AZ123456..");
        GuruTest.findElement(By.name("confirmPassword")).sendKeys("AZ123456..");
        Thread.sleep(3000);
        GuruTest.findElement(By.name("submit")).submit();
        Thread.sleep(1000);
        GuruTest.close();

    }
}
