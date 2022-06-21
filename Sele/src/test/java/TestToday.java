import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestToday {
    public String baseUrl = "https://courses.letskodeit.com/practice";
    public WebDriver myObj;
    @BeforeTest
    public void lunchbrowser () {
        WebDriverManager.chromedriver().setup();
        myObj = new ChromeDriver();
        myObj.get(baseUrl);
    }
    @Test
    public void RadioBotonTest() throws InterruptedException {
      myObj.findElement(By.id("bmwradio")).click();
      Thread.sleep(1000);
      myObj.findElement(By.id("benzradio")).click();
      Thread.sleep(1000);
      myObj.findElement(By.id("hondaradio")).click();
    }
    @AfterTest
    public void closeBrowser(){
        myObj.close();
    }


}
