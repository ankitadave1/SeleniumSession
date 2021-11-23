package SeleniumSession;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMsEdge {
    public static void main(String[] args) throws InterruptedException{

        //2. Setup edgedriver - it's path.
        System.setProperty("webdriver.edge.driver","C:\\Users\\hetal\\IdeaProjects\\JavaLearning\\Software\\msedgedriver.exe");

        //1. Create instance of webdriver
        WebDriver driver = new EdgeDriver(); //Topcasting - Child class object referred by parent interface reference variable.

        //3. navigate to webpage.
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //4. Get page title name.
        String title = driver.getTitle();
        Thread.sleep(3000);
        System.out.println(title);

        //5. Expected vs Actual
        if(title.equals("nopcommerce demo store")){
            System.out.println("The title is correct");
        }
        else{
            System.out.println("The title is incorrect");

        }
        // closing webpage
        driver.quit();

    }
}
