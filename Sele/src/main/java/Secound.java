import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Secound {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();

                driver.get("https://rahulshettyacademy.com/locatorspractice/");

                driver.findElement(By.id("inputUsername")).sendKeys("rahul");

                driver.findElement(By.name("inputPassword")).sendKeys("hello123");

                driver.findElement(By.className("signInBtn")).click();

                System.out.println(driver.findElement(By.className("error")).getText());

                driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();

                Thread.sleep(1000);//

                driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

                driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

                driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

                driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

                driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

                driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

                System.out.println(driver.findElement(By.cssSelector("form p")).getText());

                driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

                Thread.sleep(1000);

                driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

                driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

                driver.findElement(By.id("chkboxOne")).click();

                driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();




    }
}
