import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
    public String baseUrl = "https://www.datantech.com/";
    public WebDriver DNT;
    @BeforeTest
    public void lunchbrowser (){
        WebDriverManager.chromedriver().setup();
        DNT = new ChromeDriver();
        DNT.get(baseUrl);
    }

    @Test
    public void IsDataNTechLogoExistTest(){
        Assert.assertNotNull(DNT.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/div/div/a/img")));
        System.out.println(DNT.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/div/div/a/img")).getText());

        WebDriverManager.chromedriver().setup();
        ChromeDriver DNT = new ChromeDriver();
        DNT.get("https://www.datantech.com/");
        Assert.assertNotNull(DNT.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/div/div/a/img")));

    }
    @Test
    public void IsBouttenResterTodayExistTest(){
        DNT.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div[2]/div/div[2]/a")).click();
        DNT.findElement(By.name("firstname")).sendKeys("mohamed");

    }
    @Test
    public void IsfoutterExistTest(){
        Assert.assertNotNull(DNT.findElement(By.xpath("/html/body/div[1]/header/div[2]")));

    }
    @Test
    public void IsImageExisteTest(){
        Assert.assertNotNull(DNT.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/img")));

    }


    @AfterTest
            public void closebrowser (){
        DNT.quit();
    }



}
