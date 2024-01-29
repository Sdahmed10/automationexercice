


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://automationexercise.com/");

        WebElement Signup;
        Signup = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        Signup.click();

        WebElement Name;
        Name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        Name.sendKeys("tedod");
        Name.click();

        WebElement email;
        email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        email.sendKeys("tedod38263@bitofee.com");
        email.click();

        WebElement Signup1;
        Signup1 = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
        Signup1.click();

        Thread.sleep(2000);

        String actualURL = driver.getCurrentUrl();

        // Define the expected URL
        String expectedURL = "https://automationexercise.com/signup";

        // Compare the expected URL with the actual URL
        if (actualURL.equals(expectedURL)) {
            System.out.println("URLs match. Test passed!");
        } else {
            System.out.println("URLs do not match. Test failed!");
            System.out.println("Expected URL: " + expectedURL);
            System.out.println("Actual URL: " + actualURL);


        }


        WebElement Mr;
        Mr = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        Mr.click();

        WebElement password;
        password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("12345Aa@");
        password.click();

        WebElement day;
        day = driver.findElement(By.xpath("//select[@id='days']"));
        Select select = new Select(day);
        select.selectByValue("11");
        day.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();

        WebElement month;
        month = driver.findElement(By.xpath("//select[@id='months']"));
        Select select1 = new Select(month);
        select1.selectByValue("6");
        month.click();
        Actions actions1 = new Actions(driver);
        actions1.sendKeys(Keys.ENTER).perform();

        WebElement year;
        year = driver.findElement(By.xpath("//select[@id='years']"));
        Select select2 = new Select(year);
        select2.selectByValue("1988");
        year.click();
        Actions actions2 = new Actions(driver);
        actions2.sendKeys(Keys.ENTER).perform();

        WebElement newsletter;
        newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        newsletter.click();

        WebElement firstname;
        firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
        firstname.sendKeys("Ahmed");
        firstname.click();


        WebElement lastname;
        lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
        lastname.sendKeys("sdiri");
        lastname.click();



        WebElement adress ;

        adress = driver.findElement(By.xpath("//input[@id='address1']"));
        //int deltaY = adress.getRect().y;
        //new Actions(driver).scrollByAmount(20, deltaY).perform();
        adress.sendKeys("96 rue de la justice sousse");
        adress.click();

        WebElement country;
        country = driver.findElement(By.xpath("//select[@id='country']"));
        Select select3 = new Select(country);
        select3.selectByValue("Canada");
        country.click();
        Actions actions3 = new Actions(driver);
        actions3.sendKeys(Keys.ENTER).perform();


        WebElement state;
        state = driver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys("quebec");
        state.click();

        WebElement city;
        city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("quebecois");
        city.click();


        WebElement zip;
        zip = driver.findElement(By.xpath("//input[@id='zipcode']"));
        zip.sendKeys("94");
        zip.click();

        WebElement phone;
        phone = driver.findElement(By.xpath("//input[@id='mobile_number']"));
        phone.sendKeys("(431) 304-8903");
        phone.click();


        WebElement create;
        create = driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
        create.click();


        Thread.sleep(2000);

        String actualURL1 = driver.getCurrentUrl();

        // Define the expected URL
        String expectedURL1 = "https://automationexercise.com/account_created";

        // Compare the expected URL with the actual URL
        if (actualURL1.equals(expectedURL1)) {
            System.out.println("URLs match. Test passed!");
        } else {
            System.out.println("URLs do not match. Test failed!");
            System.out.println("Expected URL1: " + expectedURL1);
            System.out.println("Actual URL1: " + actualURL1);


        }

        Thread.sleep(2000);
        WebElement continues;
        continues = driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
        continues.click();

        Thread.sleep(2000);
        driver.quit();









    }
}
