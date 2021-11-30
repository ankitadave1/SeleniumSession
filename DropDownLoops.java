package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownLoops {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("ico-register")).click();

        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(Day);
        List<WebElement> dayList = select.getOptions();

        for (int i = 0; i < dayList.size(); i++) {
            String value = dayList.get(i).getText();
            System.out.println(value);
        }

        Select select1 = new Select(Month);
        List<WebElement> MonthList = select1.getOptions();

        for (int a = 0; a < MonthList.size(); a++) {
            String value1 = MonthList.get(a).getText();
            System.out.println(value1);
        }

        Select select2 = new Select(Year);
        List<WebElement> YearList = select2.getOptions();

        for (int b = 0; b < YearList.size(); b++) {
            String value2 = YearList.get(b).getText();
            System.out.println(value2);


        }
    }
}
