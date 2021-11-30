package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class RegisterPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("gender-female")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("FirstName")).sendKeys("Ankita");
        driver.findElement(By.id("LastName")).sendKeys("Dave");
        Thread.sleep(3000);

      WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
      WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
      WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(Day);
        select.selectByVisibleText("10");

        Select select1 = new Select(Month);
        select1.selectByVisibleText(("June"));

        Select select2 =new Select(Year);
        select2.selectByVisibleText("1984");

        driver.findElement(By.id("Email")).sendKeys("aadi123@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("ABC");
        Thread.sleep(3000);

       // driver.findElement(By.name("NewsLetter"));
        // driver.findElement(By.id("CheckBox")).click();
        driver.findElement(By.id("Password")).sendKeys("aadi123@");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("aadi123@");
        Thread.sleep(3000);

        driver.findElement(By.id("register-button")).click();

        driver.quit();





    }
}
