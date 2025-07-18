package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.SecureRandom;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath= "//*[@id=\"submit\"]")
    WebElement loginButton;

   // private By username = By.id("username");
   // private By password = By.id("password");
   // private By loginButton = By.xpath("//*[@id=\"submit\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String student){
        username.sendKeys(student);
        //driver.findElement(username).sendKeys(student);
    }

    public void enterPassword(String Password123) {
        password.sendKeys(Password123);
        //driver.findElement(password).sendKeys(Password123);
    }
    public void clickLogin(){
        loginButton.click();
       // driver.findElement(loginButton).click();

    }

}
