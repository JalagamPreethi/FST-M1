package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        //  Read the heading of the website and verify the text
        String  LearnFromIndustryExpertsClass  = driver.findElement(By.xpath("//*[@id=\"uagb-infobox-74cd79b6-b855-4e72-81bc-e70591de1896\"]/div/div/div/div[1]")).getAttribute("class");
        System.out.println(LearnFromIndustryExpertsClass);
        // Close the browser
        driver.close();
    }
}
