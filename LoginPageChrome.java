package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageChrome {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetal\\IdeaProjects\\Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.get("https://demo.nopcommerce.com/login");

        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("aadi.dave123@gmail.com");

        Thread.sleep(3000);
        driver.findElement(By.id("Password")).sendKeys("aadi123");

        Thread.sleep(3000);
        driver.findElement(By.className("login-button")).click();

        Thread.sleep(3000);
        driver.findElement(By.className("ico-logout")).click();

        Thread.sleep(3000);
        driver.close();

    }
}
