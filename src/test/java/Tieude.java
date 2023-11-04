import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tieude {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://rise.fairsketch.com/");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ocyeudoi@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin321");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='My Profile']")).click();

        //Chup anh
        //input[@class='upload']
        //Tai len
        //span[@class='btn color-white ml2']
        //Anh dai dien
        //img[@id='profile-image-preview']
        //Ten nguoi dung
        //input[@id='profile_image']/following-sibling::h4
        //Chuc vu
        //label[@class='badge bg-info large']

        //Field cong ty
        //a[@href='https://rise.fairsketch.com/clients/contact_profile/159/company']/ancestor::p[text()=" Company name: "]
        //Ten cong ty
        //a[@href='https://rise.fairsketch.com/clients/contact_profile/159/company']

    }
}
