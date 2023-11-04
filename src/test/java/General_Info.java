import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class General_Info {
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

        //Nhập input
        String input_Name = "//input[@placeholder='%s']";
        String xpath1 = String.format(input_Name, "First name");
        String xpath2 = String.format(input_Name, "Last name");
        String xpath3 = String.format(input_Name, "Phone");
        String xpath4 = String.format(input_Name, "Skype");
        String xpath5 = String.format(input_Name, "Job Title");

//        driver.findElement(By.xpath(xpath1)).click();
        driver.findElement(By.xpath(xpath1)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(xpath1)).sendKeys("Thao");

        driver.findElement(By.xpath(xpath1)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath2)).sendKeys("Huynh");

        driver.findElement(By.xpath(xpath2)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath3)).sendKeys("0123 456 789");

        driver.findElement(By.xpath(xpath3)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath4)).sendKeys("None");

        driver.findElement(By.xpath(xpath4)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath5)).sendKeys("Employee");

        driver.findElement(By.xpath("//input[@id='gender_male']")).click();
        driver.findElement(By.xpath("//button[text()=\" Save\"]")).click();
//        button[text()=" Save"]

    }
}
