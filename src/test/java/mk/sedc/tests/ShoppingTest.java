package mk.sedc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest {

    @Test
    public void shoppingTests() {

        myShoppingPage.navigateToPage(URL);
        myShoppingPage.ClickSignIn();
        myShoppingPage.TypeEmailSingIn(emailAddress);
        myShoppingPage.TypePassword(password);
        myShoppingPage.ClickLogIn();
        myShoppingPage.hoverOverThumbnail();
        myShoppingPage.ClickSummerDresses();
        js.executeScript("window.scrollBy(0,200)");
        myShoppingPage.ClickViewByList();
        js.executeScript("window.scrollBy(0,800)");
        myShoppingPage.SelectChiffonDress();
        js.executeScript("window.scrollBy(0,200)");
        myShoppingPage.ClickIncreaseQuantity(1);
        myShoppingPage.ClickIncreaseQuantity(1);
        myShoppingPage.ClickDecreaseQuantity(0);
        myShoppingPage.SelectSize(2);
        myShoppingPage.SelectColor(1);
        myShoppingPage.ClickAddToCart();
        Assert.assertTrue(myShoppingPage.ReturnCartProductAttributes().contains(color1 + ", " + size1));
        Assert.assertTrue(myShoppingPage.ReturnCartProductQuantity().contains(product1Qty));
        Assert.assertTrue(myShoppingPage.ReturnCartProductPrice().contains(products1Price));
        myShoppingPage.SelectContinueShopping();
        js.executeScript("window.scrollBy(0,1000)");
        myShoppingPage.SelectBestSellers();
        myShoppingPage.SelectShortSleeve();
        myShoppingPage.ClickIncreaseQuantity(1);
        myShoppingPage.SelectSize(1);
        myShoppingPage.SelectColor(1);
        myShoppingPage.ClickAddToCart();
        Assert.assertTrue(myShoppingPage.ReturnCartProductAttributes().contains(color2 + ", " + size2));
        Assert.assertTrue(myShoppingPage.ReturnCartProductQuantity().contains(product2Qty));
        Assert.assertTrue(myShoppingPage.ReturnCartProductPrice().contains(products2Price));
        myShoppingPage.SelectContinueShopping();
        js.executeScript("window.scrollBy(0,-500)");
        myShoppingPage.hoverOverThumbnail();
        myShoppingPage.ClickBlouses();
        myShoppingPage.SelectBlouse(2);
        myShoppingPage.ClickIncreaseQuantity(1);
        myShoppingPage.ClickIncreaseQuantity(1);
        myShoppingPage.ClickIncreaseQuantity(1);
        myShoppingPage.SelectSize(0);
        myShoppingPage.SelectColor(1);
        myShoppingPage.ClickAddToCart();
        Assert.assertTrue(myShoppingPage.ReturnCartProductAttributes().contains(color3 + ", " + size3));
        Assert.assertTrue(myShoppingPage.ReturnCartProductQuantity().contains(product3Qty));
        Assert.assertTrue(myShoppingPage.ReturnCartProductPrice().contains(products3Price));
        Assert.assertTrue(myShoppingPage.ReturnCartTotalPriceWithoutShipping().contains(price3WithoutShipping));
        Assert.assertTrue(myShoppingPage.ReturnShippingPrice().contains(shippingPrice));
        Assert.assertTrue(myShoppingPage.ReturnCartTotalPriceWithShipping().contains(price3WithShipping));
        myShoppingPage.SelectContinueShopping();
        myShoppingPage.ViewMyCart();


    }
}
