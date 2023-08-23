package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        // Find the MyAccount  button and click it
        driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]/a")).click();
        // Print the confirmation message
        String message = driver.findElement(By.xpath("//*[@id=\"menu-item-1507\"]/a")).getText();
        System.out.println("MyAccount: " + message);
        // Find the MyAccount  button and click it
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
        // Find the username field and enter the username
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/p[1]/input")).sendKeys("root");
        // Find the password field and enter the password
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/p[2]/input")).sendKeys("pa$$w0rd");
        // Find the login button and click it
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/form/p[4]")).click();
        //wait for new page to open
        // Wait for the second tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(1));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());


        // Close the browser
        driver.close();
    }
}
