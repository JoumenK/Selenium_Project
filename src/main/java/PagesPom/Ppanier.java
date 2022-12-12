package PagesPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Ppanier {
    WebDriver driver;

    public Ppanier(WebDriver driver) {
        this.driver = driver;
    }

    public void titrePanier() {

        WebElement titre =driver.findElement(By.xpath("//*[contains(text(), 'Your Cart')]"));
        Assert.assertTrue(titre.isDisplayed(),"titre non affiché");
    }
    public void nbrProdPanier(){
        WebElement nbr=driver.findElement(By.xpath("//*[contains(text(), '2')]"));
        Assert.assertTrue(nbr.isDisplayed(), "nbr non conforme");
    }
    public void boutonCheck(){
        WebElement checkout=driver.findElement(By.id("checkout"));
        checkout.click();
    }
}
