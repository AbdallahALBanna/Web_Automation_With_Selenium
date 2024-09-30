package AddProductToCart;

import basics.openBrowser;
import org.testng.annotations.Test;
import pages.ProductPage;

import static org.testng.Assert.assertEquals;

public class AddProductToCartTest extends openBrowser {

    @Test

    public void  testSuccessfulAddProductToCart(){

        ProductPage productPage = homePage.clickProductTitle();

        driver.findElement(productPage.addProductToCartButton).click();

        assertEquals(productPage.getProductAddedToCartSuccessText(),
                 "You added Push It Messenger Bag to your shopping cart.",
                "Product Added To Cart Test Failed");
    }
}
