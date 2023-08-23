package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9 {
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

        // Find the Any one  Courses  button and click it
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]")).click();
        //Click on anyLesson in the Courses  button
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]")).click();
        // Close the browser
        driver.close();
    }
}


