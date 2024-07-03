package basicweb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Regestration {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        // Select gender (assuming it's already selected in your case)
        // WebElement genderFemale = driver.findElement(By.id("gender-female"));
        // genderFemale.click();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Nada");

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Emad");

        // Select date of birth
        WebElement dayDropdown = driver.findElement(By.name("DateOfBirthDay"));
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByValue("12");

        WebElement monthDropdown = driver.findElement(By.name("DateOfBirthMonth"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByValue("8");

        WebElement yearDropdown = driver.findElement(By.name("DateOfBirthYear"));
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByValue("1997");

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("Nadaemadtahoun@gmail.com");

        WebElement company = driver.findElement(By.id("Company"));
        company.sendKeys("Your Company");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Nad123@123");

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Nad123@123");

        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();

        // Close the browser
        driver.quit();
    }
}