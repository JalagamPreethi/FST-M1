package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
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
        // Find the Contact  button and click it
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[4]/a")).click();
        // Print the confirmation message
        String message = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[4]/a")).getText();
        System.out.println("Contact: " + message);
        // Find the fullname field and enter the fullname
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div[2]/div[2]/div[2]/form/div[1]/div[1]/input")).sendKeys("Jalagam Preethi");
        // Find the Email field and enter the Email
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div[2]/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("preethijalagam15@gmail.com");
        // Find the message field and enter the message
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div[2]/div[2]/div[2]/form/div[1]/div[4]/textarea")).sendKeys("Submit");
        // Find the sendMessage button and click it
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div[2]/div[2]/div[2]/form/div[3]/button")).click();
        //wait for new page to open
        //Wait for the second tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(1));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());


        // Close the browser
        driver.close();
    }
}

