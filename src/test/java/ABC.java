import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ABC {
@Test
    public void mytest () throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeDriver mytest = new ChromeDriver();

        mytest.get("https://demo.applitools.com/");
        mytest.findElement(By.id("username")).sendKeys("irin");
        mytest.findElement(By.id("password")).sendKeys("1245");
        mytest.findElement(By.id("log-in")).click();
        Thread.sleep(2000);
        //  mytest.quit();
    }
    @Test
    public void AaTest (){
    WebDriverManager.chromedriver().setup();
    ChromeDriver Aa = new ChromeDriver();
    Aa.get("https://www.aa.com/homePage.do");
    Aa.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[1]/div/ul/li[1]/label/span[2]")).click();
    Aa.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div[1]/div[2]/label/span[1]")).click();
    Aa.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[3]/div[1]/div/a/span[1]")).click();
    Select country = new Select(Aa.findElement(By.id("countryCode")));
    country.selectByVisibleText("Canada");
    Select Province = new Select(Aa.findElement(By.id("stateCode")));
    Province.selectByVisibleText("Alberta");
    Aa.findElement(By.id("airport_YYC")).click();







    }
}
