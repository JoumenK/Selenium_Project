package PagesPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageRemerciement {
    WebDriver driver;

    public PageRemerciement (WebDriver driver){
        this.driver=driver;
    }
    public void lastmessage(){
        WebElement lastMessage=driver.findElement(By.xpath("//*[contains(text(), 'THANK YOU FOR YOUR ORDER')]"));
        Assert.assertTrue(lastMessage.isDisplayed(),"le message est erroné");
    }

}
