import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver", "/Users/walter/Code/98selenium/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        // driver.get("https://www.google.com");
        // driver.quit();
    }
}
