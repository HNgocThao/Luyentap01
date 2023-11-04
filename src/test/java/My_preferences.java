import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class My_preferences {
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
        driver.findElement(By.xpath("//a[text()=' My preferences']")).click();

        driver.findElement(By.xpath("//span[@id='select2-chosen-2']")).click();
        driver.findElement(By.xpath("//div[@id='select2-result-label-20']")).click();

        //Nhập input
        String input_Name = "//label[text()='%s']/following::span";
        String xpath1 = String.format(input_Name, "Enable web notification");
        String xpath2 = String.format(input_Name, "Enable email notification");
        String xpath3 = String.format(input_Name, "Language");
        String xpath4 = String.format(input_Name, "Disable keyboard shortcuts");
        String xpath5 = String.format(input_Name, "Snooze length");

        String input_Hide = "//input[@aria-owns='%s']";
        String xpa1 = String.format(input_Hide, "select2-results-14");
        String xpa2 = String.format(input_Hide, "select2-results-6");
        String xpa3 = String.format(input_Hide, "select2-results-8");
        String xpa4 = String.format(input_Hide, "select2-results-10");
        String xpa5 = String.format(input_Hide, "select2-results-12");

        driver.findElement(By.xpath(xpath1)).click();
        //label[text()='Enable web notification']/following::input[@aria-owns='select2-results-14']
        driver.findElement(By.xpath(xpa1)).sendKeys(Keys.chord("N"));
        driver.findElement(By.xpath(xpa1)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(xpath2)).click();
        driver.findElement(By.xpath(xpa2)).sendKeys("No");
        driver.findElement(By.xpath(xpa2)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(xpath3)).click();
        driver.findElement(By.xpath(xpa3)).sendKeys("German");
        driver.findElement(By.xpath(xpa3)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(xpath4)).click();
        driver.findElement(By.xpath(xpa4)).sendKeys("No");
        driver.findElement(By.xpath(xpa4)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(xpath5)).click();
        driver.findElement(By.xpath(xpa5)).sendKeys("15");
        driver.findElement(By.xpath(xpa5)).sendKeys(Keys.ENTER);

//label[text()='Hide menus from topbar']/following::input[@class='select2-input select2-default']
        driver.findElement(By.xpath("//input[@class='select2-input select2-default']")).sendKeys("Q");
        driver.findElement(By.xpath("//div[@id='select2-result-label-71']")).click();

        //        driver.findElement(By.xpath("//button[text()=\" Save\"]")).click();
    }
}
