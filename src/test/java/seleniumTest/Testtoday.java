package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testtoday {
    public String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/";
    public WebDriver AutomationPractice;
    @BeforeTest
    public void lunchbrowser(){
        WebDriverManager.chromedriver().setup();
        AutomationPractice = new ChromeDriver();
        AutomationPractice.get(baseUrl);
        AutomationPractice.manage().window().maximize();
    }
    @Test
    public void RadioButtonTest() throws InterruptedException {
        AutomationPractice.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")).click();
        Thread.sleep(2000);
        AutomationPractice.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[2]/input[1]")).click();
        Thread.sleep(2000);
        AutomationPractice.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[3]/input[1]")).click();
        Thread.sleep(2000);

    }
    @Test
    public void DropdownTest() throws InterruptedException {
        Select DD1 = new Select(AutomationPractice.findElement(By.name("dropdown-class-example")));
        DD1.selectByVisibleText("option1");
        Thread.sleep(2000);
        Select DD2 = new Select(AutomationPractice.findElement(By.name("dropdown-class-example")));
        DD2.selectByVisibleText("option2");
        Thread.sleep(2000);
        Select DD3 = new Select(AutomationPractice.findElement(By.name("dropdown-class-example")));
        DD3.selectByVisibleText("option3");
        Thread.sleep(2000);
    }
    @Test
    public void SwitchTabTest () throws InterruptedException {
        AutomationPractice.findElement(By.id("opentab")).click();
        Thread.sleep(2000);
    }
    @AfterTest
    public void  closebrowser() throws InterruptedException {
        AutomationPractice.close();
        Thread.sleep(2000);
        AutomationPractice.quit();
    }
}
