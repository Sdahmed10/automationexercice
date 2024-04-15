import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Loginfailedandpassed {
    private WebDriver driver;
    private String baseUrl= "https://devlinkfoot.softylines.com/auth/jwt/login";


    @BeforeClass
    public void setUp(){
        // Set up WebDriver and navigate to the login page

        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test
    public void testInvalidlogin() throws InterruptedException {
        Thread.sleep(2000);

        //Unseccessfull login scenario
        WebElement Email = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > main:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
        Email.sendKeys(Keys.chord(Keys.META,"q"));
        Email.sendKeys(Keys.BACK_SPACE);
        Email.sendKeys(("super123@super.com"));
        Email.click();

        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("(//input[@id=':r1:'])[1]"));
        password.sendKeys(Keys.chord(Keys.META,"q"));
        password.sendKeys(Keys.BACK_SPACE);
        password.sendKeys(("super123"));
        password.click();

        WebElement Login = driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]"));
        Login.click();

        System.out.println("unseccssefull login");

    }

        @Test
        public void testvalidLogin() throws InterruptedException {
            // Failed login scenario
            WebElement Email = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > main:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
            Email.sendKeys(Keys.chord(Keys.META, "q"));
            Email.sendKeys(Keys.BACK_SPACE);
            Email.sendKeys("super@super.com");
            Email.click();

            Thread.sleep(2000);

            WebElement Password = driver.findElement(By.xpath("(//input[@id=':r1:'])[1]"));
            Password.sendKeys(Keys.chord(Keys.META, "q"));
            Password.sendKeys(Keys.BACK_SPACE);
            Password.sendKeys("super123");
            Password.click();

            WebElement Login = driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]"));
            Login.click();
            //WebElement errorMessage = driver.findElement(By.id("errorMessage"));
            // Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed for invalid login");

            Thread.sleep(2000);
            WebElement profil = driver.findElement(By.xpath("//img[@alt='super']"));
            profil.click();


            WebElement Logout1 = driver.findElement(By.cssSelector(".MuiButtonBase-root.MuiMenuItem-root.MuiMenuItem-gutters.MuiMenuItem-root.MuiMenuItem-gutters.css-83fk8a"));
            Logout1.click();


            Thread.sleep(3000);
        }

        @AfterClass
        public void tearDown() {
            // Close the browser
            driver.quit();
        }


    }




