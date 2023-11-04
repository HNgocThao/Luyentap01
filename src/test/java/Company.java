import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Company {
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
        driver.findElement(By.xpath("//a[text()=' Company']")).click();

        driver.findElement(By.xpath("//input[@id='type_organization']")).click();

        //Nhập input
        String input_Name = "//input[@placeholder='%s']";
        String xpath1 = String.format(input_Name, "Company name");
//        String xpath2 = String.format(input_Name, "Address");
        String xpath3 = String.format(input_Name, "City");
        String xpath4 = String.format(input_Name, "State");
        String xpath5 = String.format(input_Name, "Zip");
        String xpath6 = String.format(input_Name, "Country");
//        String xpath7 = String.format(input_Name, "Phone");
        String xpath8 = String.format(input_Name, "Website");
        String xpath9 = String.format(input_Name, "VAT Number");
        String xpath10 = String.format(input_Name, "GST Number");

        driver.findElement(By.xpath(xpath1)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(xpath1)).sendKeys("CodeGym");

        driver.findElement(By.xpath("//textarea")).sendKeys("123 Thanh Long");

        driver.findElement(By.xpath(xpath1)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath3)).sendKeys("Da Nang");

        driver.findElement(By.xpath(xpath3)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath4)).sendKeys("Hoa Cuong");

        driver.findElement(By.xpath(xpath4)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath5)).sendKeys("555666");

        driver.findElement(By.xpath(xpath5)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath6)).sendKeys("Viet Nam");

        driver.findElement(By.xpath(xpath6)).sendKeys(Keys.TAB);
//        driver.findElement(By.xpath(xpath7)).sendKeys("0123-456-789");

//        driver.findElement(By.xpath(xpath7)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@placeholder='Phone' and@aria-invalid=\"false\"]")).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath("//input[@placeholder='Phone' and@aria-invalid=\"false\"]")).sendKeys("0123-456-789");

//        driver.findElement(By.xpath(xpath7)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath8)).sendKeys("codegym.com");

        driver.findElement(By.xpath(xpath8)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath9)).sendKeys("123456789");

        driver.findElement(By.xpath(xpath9)).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(xpath10)).sendKeys("987654321");

//        driver.findElement(By.xpath("//button[text()=" Save"]")).click();


    }
}
