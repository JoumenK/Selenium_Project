package PagesPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pproducts {
    WebDriver driver;

    public Pproducts(WebDriver driver) {
        this.driver = driver;
    }

    public void ProductTitle() {

        WebElement product = driver.findElement(By.xpath("//*[contains (text(), 'Products')]"));
        Assert.assertTrue(product.isDisplayed(),"titre incorrect");
    }

    public void ajoutProduit1() {
        WebElement sauceback1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        sauceback1.click();
    }
    public void ajoutProduit2() {
        WebElement sauceback2 =driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        sauceback2.click();
    }
    public void clickPanier() {
        WebElement clickPan =driver.findElement(By.id("shopping_cart_container"));
        clickPan.click();


}



    }


