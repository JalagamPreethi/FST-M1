package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        // Find the All Courses  button and click it
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).click();
        // Print the confirmation message
        String message = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).getText();
        System.out.println("AllCourses: " + message);

        // Find the All Courses  button
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]")).getText();
        // Find the All Courses  button
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[2]")).getText();
        // Find the All Courses  button
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[3]")).getText();
        // Print the confirmation message
        String numberOfPages = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div")).getText();
        System.out.println("numberOfPages: " + message);


        // Close the browser
        driver.close();
    }
}


