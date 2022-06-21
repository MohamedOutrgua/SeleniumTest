import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //TODO

        //open chrom browser
        ChromeDriver chromedriver = new ChromeDriver();

        // go to cnn.com
        chromedriver.get("https://www.cnn.com/");

        //wait 5 secounds
        Thread.sleep(5000);


        //quit the browser
        chromedriver.quit();

    }
}
