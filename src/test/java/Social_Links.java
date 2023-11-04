import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Social_Links {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rise.fairsketch.com/");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("client@demo.com");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='My Profile']")).click();
        driver.findElement(By.xpath("//a[text()=' Social Links']")).click();

        //Nhập input
        String input_Name = "//input[@name='%s']";
        String xpath1 = String.format(input_Name, "facebook");
        String xpath2 = String.format(input_Name, "twitter");
        String xpath3 = String.format(input_Name, "linkedin");
        String xpath4 = String.format(input_Name, "whatsapp");
        String xpath5 = String.format(input_Name, "digg");
        String xpath6 = String.format(input_Name, "youtube");
        String xpath7 = String.format(input_Name, "pinterest");
        String xpath8 = String.format(input_Name, "instagram");
        String xpath9 = String.format(input_Name, "github");
        String xpath10 = String.format(input_Name, "tumblr");
        String xpath11 = String.format(input_Name, "vine");

        driver.findElement(By.xpath(xpath1)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(xpath1)).sendKeys("facebook.com");

        driver.findElement(By.xpath(xpath1)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath2)).sendKeys("twitter.com");

        driver.findElement(By.xpath(xpath2)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath3)).sendKeys("linkedin.com");

        driver.findElement(By.xpath(xpath3)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath4)).sendKeys("whatsapp.com");

        driver.findElement(By.xpath(xpath4)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath5)).sendKeys("digg.com");

        driver.findElement(By.xpath(xpath5)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath6)).sendKeys("youtube.com");

        driver.findElement(By.xpath(xpath6)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath7)).sendKeys("pinterest.com");

        driver.findElement(By.xpath(xpath7)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath8)).sendKeys("instagram.com");

        driver.findElement(By.xpath(xpath8)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath9)).sendKeys("github.com");

        driver.findElement(By.xpath(xpath9)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath10)).sendKeys("tubmblr.com");

        driver.findElement(By.xpath(xpath10)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath11)).sendKeys("vine.com");

        //        driver.findElement(By.xpath("//button[text()=\" Save\"]")).click();

    }
}
