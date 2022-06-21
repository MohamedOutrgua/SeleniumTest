import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver Twetter = new ChromeDriver();
        Twetter.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
        //Twetter.findElement(By.linkText("https://accounts.google.com/gsi/button?theme=outline&size=large&shape=circle&logo_alignment=center&text=signin_with&width=300&client_id=49625052041-kgt0hghf445lmcmhijv46b715m2mpbct.apps.googleusercontent.com&iframe_id=gsi_879910_85146&as=CBS%2FpwB0AE%2BKlB7FrnUM7w&hl=en")).click();
//        Twetter.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div[1]")).click();
        Twetter.findElement(By.id("businessaccount-radio"));
//        Twetter.findElement(By.xpath("//*[@id=\"im-webim-gen-12\"]/div[220]")).click();
//        Twetter.findElement(By.name("username")).sendKeys("HGXHGTCUJCJHVJV");
//        Twetter.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div[1]")).click();
//        Thread.sleep(2000);
//        Twetter.close();

    }
}
