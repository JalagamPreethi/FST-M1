package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        // Find the MyAccount  button and click it
        driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]/a")).click();
        // Print the confirmation message
        String message = driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]/a")).getText();
        System.out.println("MyAccount: " + message);



        // Close the browser
        driver.close();
    }
}
