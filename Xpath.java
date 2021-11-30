package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ankita");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Dave");
        Thread.sleep(3000);

        WebElement Day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        WebElement Month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        WebElement Year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));

        Select select = new Select(Day);
        select.selectByVisibleText("10");

        Select select1 = new Select(Month);
        select1.selectByVisibleText(("June"));

        Select select2 = new Select(Year);
        select2.selectByVisibleText("1984");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("aadi12345@gmail.com");
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("ABC");
        Thread.sleep(3000);

         driver.findElement(By.xpath("//label[@for='Newsletter']"));
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("aadi1234@");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("aadi1234@");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        driver.quit();


    }
}