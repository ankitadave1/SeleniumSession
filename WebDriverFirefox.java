package SeleniumSession;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFirefox {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.gecko.driver","C:\\Users\\hetal\\IdeaProjects\\JavaLearning\\Software\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        //3. navigate to webpage.
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //4. Get page title name.
        String title = driver.getTitle();
        Thread.sleep(3000);
        System.out.println(title);

        //5. Expected vs Actual
        if(title.equals("nopCommerce demo store")){
            System.out.println("The title is correct");
        }
        else{
            System.out.println("The title is incorrect");

        }
        // closing webpage
        driver.quit();






    }
}
