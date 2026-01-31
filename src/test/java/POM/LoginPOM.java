package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {

    WebDriver driver;

    public LoginPOM(WebDriver driver)
    {
        this.driver = driver;
    }

    //Basic POM --> Locators
    private By username_loc = By.name("username");
    private By password_loc = By.name("password");
    private  By signin_btn = By.xpath("//button[@type='submit']");

    //PageFactory -> locator + element
    private @FindBy(name="username") WebElement username_txt;
    private @FindBy(name = "password") WebElement password_txt;
    private @FindBy(xpath = "//button[@type='submit']") WebElement signInBtn;


    //Actions
    public void enterTheValidUsername(String user)
    {
       // driver.findElement(username_loc).sendKeys(user); //basic
        username_txt.sendKeys(user); //pageFactory
    }

    public void enterTheValidPassword(String pwd)
    {
       // driver.findElement(password_loc).sendKeys(pwd); //Basic
        password_txt.sendKeys(pwd);
    }

    public void clickSigninButton()
    {
       // driver.findElement(signin_btn).click(); //basic
        signInBtn.click();
    }

    public void login()
    {
//        driver.findElement(username_loc).sendKeys("Admin");
//        driver.findElement(password_loc).sendKeys("admin123");
//        driver.findElement(signin_btn).click();

        //pagefactory
        username_txt.sendKeys("Admin");
        password_txt.sendKeys("admin123");
        signInBtn.click();
    }


}
