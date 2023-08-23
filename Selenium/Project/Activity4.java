package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

        public static void main(String[] args)
{
    // Set up Firefox driver
    WebDriverManager.firefoxdriver().setup();
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();

    // Open the page
    driver.get("https://alchemy.hguy.co/lms/");
    // Print the title of the page
    System.out.println("Home page title: " + driver.getTitle());
    //  Read the heading of the website and verify the text
    String   SecondCourse   = driver.findElement(By.xpath("//*[@id=\"post-71\"]/div[2]/h3")).getAttribute("class");
    System.out.println( "SecondCourse title: "+ driver.getTitle());
    // Close the browser
    driver.close();
}
}

