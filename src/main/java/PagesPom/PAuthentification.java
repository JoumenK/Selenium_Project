package PagesPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PAuthentification {
    WebDriver driver;
    public PAuthentification(WebDriver driver) {
        this.driver=driver;
    }
    public void saisirLogin(String val1){
    WebElement champlogin= driver.findElement(By.id("user-name"));
    champlogin.sendKeys(val1);
}
    public void saisirMdp(String val2 ){
    WebElement champsMdp=driver.findElement(By.id("password"));
    champsMdp.sendKeys(val2);
    }
    public void boutonLogin(){
        WebElement btnLogin =driver.findElement(By.id("login-button"));
        btnLogin.click();
    }
    public void errorMessage(){
        WebElement Logerror =driver.findElement(By.id("login_button_container"));
        String errormsg = Logerror.getText();
        System.out.println(errormsg);

        if ( errormsg.equals("Epic sadface: Username and password do not match any user in this service"))
        {
            System.out.println("Message d'erreur affiché");
        }
        else{
            System.out.println("Message d'erreur non affiché");
        }
    }


}