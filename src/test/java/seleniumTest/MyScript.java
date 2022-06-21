package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MyScript {
//    public String baseUrl = "https://www.bankofamerica.com/";
//    public WebDriver BOA;
//
//
//    @BeforeTest
//    WebDriverManager.chromedriver().

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver BOA = new ChromeDriver();
        BOA.get("https://www.bankofamerica.com/");
        BOA.findElement(By.id("NAV_BUSINESS_ADVANTAGE")).click();
        BOA.quit();
    }
    @Test
    public void test2(){
    WebDriverManager.chromedriver().setup();
    ChromeDriver BOA = new ChromeDriver();
    BOA.get("https://www.bankofamerica.com/");
    BOA.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[2]/a/span[3]")).click();
    BOA.quit();
    }
    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver BOA = new ChromeDriver();
        BOA.get("https://www.bankofamerica.com/");
        BOA.findElement(By.name("onlineId1")).sendKeys("My user ID");
        BOA.findElement(By.name("passcode1")).sendKeys("123456789");
        BOA.findElement(By.id("saveOnlineId")).click();
        BOA.findElement(By.id("signIn")).click();
        BOA.quit();
    }
    @Test
    public void test4() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver GuruTest = new ChromeDriver();
        GuruTest.get("https://demo.guru99.com/test/newtours/register.php");
        GuruTest.findElement(By.name("firstName")).sendKeys("MOHAMED");
        GuruTest.findElement(By.name("lastName")).sendKeys("OUT");
        GuruTest.findElement(By.name("phone")).sendKeys("5712532453");
        GuruTest.findElement(By.id("userName")).sendKeys("ABC@XYZ.COM");
        GuruTest.findElement(By.name("address1")).sendKeys("5055 Seminary RD");
        GuruTest.findElement(By.name("city")).sendKeys("Alexandria");
        GuruTest.findElement(By.name("state")).sendKeys("VA");
        GuruTest.findElement(By.name("postalCode")).sendKeys("22311");
        Select drpCountry = new Select(GuruTest.findElement(By.name("country")));
        drpCountry.selectByVisibleText("AUSTRALIA");
        GuruTest.findElement(By.name("email")).sendKeys("mohamed");
        GuruTest.findElement(By.name("password")).sendKeys("AZ123456..");
        GuruTest.findElement(By.name("confirmPassword")).sendKeys("AZ123456..");
        Thread.sleep(3000);
        GuruTest.findElement(By.name("submit")).submit();
        Thread.sleep(1000);
        GuruTest.quit();
    }
    @Test
    public void test5() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver AaTest = new ChromeDriver();
        AaTest.manage().window().maximize();
        AaTest.get("https://www.aa.com/");
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[1]/div/ul/li[1]/label/span[2]")).click();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div[1]/div[2]/label/span[1]")).click();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div[2]/div/label/span")).click();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[3]/div[1]/div/a/span[1]")).click();
        Select country = new Select(AaTest.findElement(By.id("countryCode")));
        country.selectByVisibleText("United States");
        Select State = new Select(AaTest.findElement(By.id("stateCode")));
        State.selectByVisibleText("Alaska");
        Thread.sleep(500);
        AaTest.findElement(By.id("airport_ADK")).click();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[3]/div[2]/div/a/span[1]")).click();
        Select country1 = new Select(AaTest.findElement(By.id("countryCode")));
        country1.selectByVisibleText("United States");
        Select State1 = new Select(AaTest.findElement(By.id("stateCode")));
        State1.selectByVisibleText("District of Columbia");
        Thread.sleep(500);
        AaTest.findElement(By.id("airport_DCA")).click();
        Select NBofPassengers = new Select(AaTest.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
        NBofPassengers.selectByVisibleText("3");
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[4]/div[1]/div/button")).click();
        AaTest.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[5]/td[2]")).click();
        AaTest.findElement(By.id("flightSearchForm.button.reSubmit")).submit();
        Thread.sleep(500);
        AaTest.navigate().back();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[1]/div/ul/li[1]/label/span[2]")).click();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[2]/div[1]/div[1]/label/span[1]")).click();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[3]/div[1]/div/a/span[1]")).click();
        AaTest.findElement(By.id("airportLookupDialogClose")).click();
        Thread.sleep(100);
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[3]/div[1]/div/a/span[1]")).click();
        Select COUNTRY = new Select(AaTest.findElement(By.id("countryCode")));
        COUNTRY.selectByVisibleText("United States");
        Select STATE =new Select(AaTest.findElement(By.id("stateCode")));
        STATE.selectByVisibleText("Virginia");
        AaTest.findElement(By.id("airport_CHO")).click();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[3]/div[2]/div/a")).click();
        Select Country2 =new Select(AaTest.findElement(By.id("countryCode")));
        Country2.selectByVisibleText("United States");
        Select STATE1 =new Select(AaTest.findElement(By.id("stateCode")));
        STATE1.selectByVisibleText("Alabama");
        AaTest.findElement(By.id("airport_BHM")).click();
        Select passengers = new Select(AaTest.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
        passengers.selectByVisibleText("2");
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[4]/div[1]/div/button")).click();
        AaTest.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[4]/td[7]/a")).click();
        AaTest.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div/div[1]/form/div[4]/div[2]/div/button")).click();
        AaTest.findElement(By.xpath("/html/body/div[8]/div[2]/div/a")).click();
        AaTest.findElement(By.xpath("/html/body/div[8]/div[2]/table/tbody/tr[5]/td[2]/a")).click();
        AaTest.findElement(By.id("flightSearchForm.button.reSubmit")).submit();
        Thread.sleep(100);
        AaTest.quit();
    }

}
