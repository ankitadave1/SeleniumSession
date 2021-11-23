package SeleniumSession;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {
    public static void main(String[] args) throws InterruptedException {

        //2. Setup chrome driver - it's path.
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\hetal\\IdeaProjects\\JavaLearning\\Software\\chromedriver.exe");

        //1. Create instance of webdriver.
        WebDriver driver = new ChromeDriver(); //Topcasting - Child class object referred by parent interface reference variable.

        //3. Navigate to webpage.
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000); //1000 milliseconds is 1 second.
        driver.manage().window().maximize();

        //4. Get page title (Tab Name)

        String title = driver.getTitle();
        Thread.sleep(3000);
        System.out.println(title);

        //5. Expected vs Actual - Validation
        if(title.equals("nopCommerce dem store")){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title is incorrect");
        }
     // closing webpage
        driver.quit();

    }
}
