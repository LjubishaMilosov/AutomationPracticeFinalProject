package mk.sedc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {

    @Test
    public void checkOutTest() {
        myCheckoutPage.navigateToPage(URL);
        myCheckoutPage.ClickSignIn();
        myCheckoutPage.TypeEmailSingIn(emailAddress);
        myCheckoutPage.TypePassword(password);
        myCheckoutPage.ClickLogIn();
        myCheckoutPage.hoverOverThumbnail();
        myCheckoutPage.ClickSummerDresses();
        js.executeScript("window.scrollBy(0,200)");
        myCheckoutPage.ClickViewByList();
        js.executeScript("window.scrollBy(0,800)");
        myCheckoutPage.SelectChiffonDress();
        js.executeScript("window.scrollBy(0,200)");
        myCheckoutPage.ClickIncreaseQuantity(1);
        myCheckoutPage.ClickIncreaseQuantity(1);
        myCheckoutPage.ClickDecreaseQuantity(0);
        myCheckoutPage.SelectSize(2);
        myCheckoutPage.SelectColor(1);
        myCheckoutPage.ClickAddToCart();
        Assert.assertTrue(myCheckoutPage.ReturnCartProductAttributes().contains(color1 + ", " + size1));
        Assert.assertTrue(myCheckoutPage.ReturnCartProductQuantity().contains(product1Qty));
        Assert.assertTrue(myCheckoutPage.ReturnCartProductPrice().contains(products1Price));
        myCheckoutPage.SelectContinueShopping();
        js.executeScript("window.scrollBy(0,1000)");
        myCheckoutPage.SelectBestSellers();
        myCheckoutPage.SelectShortSleeve();
        myCheckoutPage.ClickIncreaseQuantity(1);
        myCheckoutPage.SelectSize(1);
        myCheckoutPage.SelectColor(1);
        myCheckoutPage.ClickAddToCart();
        Assert.assertTrue(myCheckoutPage.ReturnCartProductAttributes().contains(color2 + ", " + size2));
        Assert.assertTrue(myCheckoutPage.ReturnCartProductQuantity().contains(product2Qty));
        Assert.assertTrue(myCheckoutPage.ReturnCartProductPrice().contains(products2Price));
        myCheckoutPage.SelectContinueShopping();
        js.executeScript("window.scrollBy(0,-500)");
        myCheckoutPage.hoverOverThumbnail();
        myCheckoutPage.ClickBlouses();
        myCheckoutPage.SelectBlouse(2);
        myCheckoutPage.ClickIncreaseQuantity(1);
        myCheckoutPage.ClickIncreaseQuantity(1);
        myCheckoutPage.ClickIncreaseQuantity(1);
        myCheckoutPage.SelectSize(0);
        myCheckoutPage.SelectColor(1);
        myCheckoutPage.ClickAddToCart();
        Assert.assertTrue(myCheckoutPage.ReturnCartProductAttributes().contains(color3 + ", " + size3));
        Assert.assertTrue(myCheckoutPage.ReturnCartProductQuantity().contains(product3Qty));
        Assert.assertTrue(myCheckoutPage.ReturnCartProductPrice().contains(products3Price));
        Assert.assertTrue(myCheckoutPage.ReturnCartTotalPriceWithoutShipping().contains(price3WithoutShipping));
        Assert.assertTrue(myCheckoutPage.ReturnShippingPrice().contains(shippingPrice));
        Assert.assertTrue(myCheckoutPage.ReturnCartTotalPriceWithShipping().contains(price3WithShipping));
        myCheckoutPage.SelectContinueShopping();
        myCheckoutPage.ViewMyCart();
        Assert.assertTrue(myCheckoutPage.ReturnProductName(0).contains(productName1));
        Assert.assertTrue(myCheckoutPage.ReturnCartRefNum(0).contains(cart1RefNum));
        Assert.assertTrue(myCheckoutPage.ReturnColorSize(1).contains(colorSize1));
        Assert.assertTrue(myCheckoutPage.ReturnInStock(0).contains(inStock));
        Assert.assertTrue(myCheckoutPage.ReturnOldPrice(2).contains(oldPrice));
        Assert.assertTrue(myCheckoutPage.ReturnDiscountPercent(1).contains(discount));
        Assert.assertTrue(myCheckoutPage.ReturnDiscountPrice(0).contains(specialPrice));
        Assert.assertTrue(myCheckoutPage.ReturnTotalProductPrice(0).contains(totalProducts1Price));
        Assert.assertTrue(myCheckoutPage.ReturnProductName(1).contains(productName2));
        Assert.assertTrue(myCheckoutPage.ReturnCartRefNum(2).contains(cartRefNum2));
        Assert.assertTrue(myCheckoutPage.ReturnColorSize(3).contains(colorSize2));
        Assert.assertTrue(myCheckoutPage.ReturnInStock(1).contains(inStock));
        Assert.assertTrue(myCheckoutPage.ReturnProduct2Price(3).contains(product2UnitPrice));
        Assert.assertTrue(myCheckoutPage.ReturnTotalProductPrice(1).contains(totalProducts2Price));
        myCheckoutPage.CartIncreaseQuantity(2);
        myCheckoutPage.DeleteProductInCart(2);
        Assert.assertTrue(myCheckoutPage.ReturnOldPrice(2).contains(oldPrice));
        Assert.assertFalse(myCheckoutPage.ReturnDiscountReductionPercent(1).contains(reductionDiscount));
        Assert.assertTrue(myCheckoutPage.ReturnDiscountPrice(0).contains(specialPrice));
        Assert.assertTrue(myCheckoutPage.ReturnTotalPriceWithoutShipping().contains(totalWithoutShipping));
        Assert.assertTrue(myCheckoutPage.ReturnTotalShippingPrice().contains(totalShipping));
        Assert.assertTrue(myCheckoutPage.ReturnTotalPriceWithoutTax().contains(totalWithoutTax));
        Assert.assertTrue(myCheckoutPage.ReturnTotalTax().contains(totalTax));
        Assert.assertTrue(myCheckoutPage.ReturnTotalPriceWithTax().contains(totalWithTax));
        Assert.assertTrue(myCheckoutPage.ReturnProductDeliveryAddress(1).contains(firstName + " " + lastName));
        Assert.assertTrue(myCheckoutPage.ReturnProductDeliveryAddress(2).contains(companyName));
        Assert.assertTrue(myCheckoutPage.ReturnProductDeliveryAddress(3).contains(address1 + " " + address2));
        Assert.assertTrue(myCheckoutPage.ReturnProductDeliveryAddress(4).contains(city + ", " + state + " " + zipCode));
        Assert.assertTrue(myCheckoutPage.ReturnProductDeliveryAddress(5).contains(country));
        Assert.assertTrue(myCheckoutPage.ReturnProductDeliveryAddress(6).contains(homePhoneNum));
        Assert.assertTrue(myCheckoutPage.ReturnProductDeliveryAddress(7).contains(phoneNum));
        Assert.assertTrue(myCheckoutPage.ReturnInvoiceAddress(9).contains(firstName + " " + lastName));
        Assert.assertTrue(myCheckoutPage.ReturnInvoiceAddress(10).contains(companyName));
        Assert.assertTrue(myCheckoutPage.ReturnInvoiceAddress(11).contains(address1 + " " + address2));
        Assert.assertTrue(myCheckoutPage.ReturnInvoiceAddress(12).contains(city + ", " + state + " " + zipCode));
        Assert.assertTrue(myCheckoutPage.ReturnInvoiceAddress(13).contains(country));
        Assert.assertTrue(myCheckoutPage.ReturnInvoiceAddress(14).contains(homePhoneNum));
        Assert.assertTrue(myCheckoutPage.ReturnInvoiceAddress(15).contains(phoneNum));
        myCheckoutPage.ProceedToAddressCheckout();
        myCheckoutPage.UpdateAddresses(0);
        myCheckoutPage.SaveUpdatedAddress();
        Assert.assertTrue(myCheckoutPage.ReturnDeliveryAddress(1).contains(firstName + " " + lastName));
        Assert.assertTrue(myCheckoutPage.ReturnDeliveryAddress(2).contains(companyName));
        Assert.assertTrue(myCheckoutPage.ReturnDeliveryAddress(3).contains(address1 + " " + address2));
        Assert.assertTrue(myCheckoutPage.ReturnDeliveryAddress(4).contains(city + ", " + state + " " + zipCode));
        Assert.assertTrue(myCheckoutPage.ReturnDeliveryAddress(5).contains(country));
        Assert.assertTrue(myCheckoutPage.ReturnDeliveryAddress(6).contains(homePhoneNum));
        Assert.assertTrue(myCheckoutPage.ReturnDeliveryAddress(7).contains(phoneNum));
        myCheckoutPage.UpdateAddresses(1);
        myCheckoutPage.SaveUpdatedAddress();
        Assert.assertTrue(myCheckoutPage.ReturnBillingAddress(10).contains(firstName + " " + lastName));
        Assert.assertTrue(myCheckoutPage.ReturnBillingAddress(11).contains(companyName));
        Assert.assertTrue(myCheckoutPage.ReturnBillingAddress(12).contains(address1 + " " + address2));
        Assert.assertTrue(myCheckoutPage.ReturnBillingAddress(13).contains(city + ", " + state + " " + zipCode));
        Assert.assertTrue(myCheckoutPage.ReturnBillingAddress(14).contains(country));
        Assert.assertTrue(myCheckoutPage.ReturnBillingAddress(15).contains(homePhoneNum));
        Assert.assertTrue(myCheckoutPage.ReturnBillingAddress(16).contains(phoneNum));
        myCheckoutPage.ProceedToCheckOut();
        myCheckoutPage.SelectDeliveryNextDay(0);
        Assert.assertTrue(myCheckoutPage.ReturnDeliveryNextDay(0).contains("checked"));
        myCheckoutPage.ClickReadTermsOfService();
        myCheckoutPage.ClickCloseTermsOfService();
        myCheckoutPage.AgreeToTermsOfService();
        Assert.assertTrue(myCheckoutPage.ReturnAgreedTermsOfService(0).contains("checked"));
        myCheckoutPage.ClickProceedToPayment();
        Assert.assertTrue(myCheckoutPage.ReturnProductName(0).contains(productName1));
        Assert.assertTrue(myCheckoutPage.ReturnCartRefNum(0).contains(cart1RefNum));
        Assert.assertTrue(myCheckoutPage.ReturnColorSize(1).contains(colorSize1));
        Assert.assertTrue(myCheckoutPage.ReturnInStock(0).contains(inStock));
        Assert.assertTrue(myCheckoutPage.ReturnOldPrice(2).contains(oldPrice));
        Assert.assertTrue(myCheckoutPage.ReturnDiscountPercent(1).contains(discount));
        Assert.assertTrue(myCheckoutPage.ReturnDiscountPrice(0).contains(specialPrice));
        Assert.assertTrue(myCheckoutPage.ReturnQuantitiesWanted(0).contains(product1Qty));
        Assert.assertTrue(myCheckoutPage.ReturnTotalProductPrice(0).contains(totalProducts1Price));
        Assert.assertTrue(myCheckoutPage.ReturnProductName(1).contains(productName2));
        Assert.assertTrue(myCheckoutPage.ReturnCartRefNum(2).contains(cartRefNum2));
        Assert.assertTrue(myCheckoutPage.ReturnColorSize(3).contains(colorSize2));
        Assert.assertTrue(myCheckoutPage.ReturnInStock(1).contains(inStock));
        Assert.assertTrue(myCheckoutPage.ReturnProduct2Price(3).contains(product2UnitPrice));
        Assert.assertTrue(myCheckoutPage.ReturnQuantitiesWanted(1).contains(product2Qty));
        Assert.assertTrue(myCheckoutPage.ReturnTotalProductPrice(1).contains(totalProducts2Price));
        Assert.assertTrue(myCheckoutPage.ReturnTotalPriceWithoutShipping().contains(totalWithoutShipping));
        Assert.assertTrue(myCheckoutPage.ReturnTotalShippingPrice().contains(totalShipping));
        Assert.assertTrue(myCheckoutPage.ReturnTotalTax().contains(totalTax));
        Assert.assertTrue(myCheckoutPage.ReturnTotalPriceWithTax().contains(totalWithTax));
        myCheckoutPage.ClickPayByBankWire();
        Assert.assertTrue(myCheckoutPage.ReturnBankWire(0).contains("You have chosen to pay by bank wire. Here is a short summary of your order:"));
        Assert.assertTrue(myCheckoutPage.ReturnBankWire(1).contains("- The total amount of your order comes to: $70.53 (tax incl.)"));
        Assert.assertTrue(myCheckoutPage.ReturnBankWire(2).contains("- We allow the following currency to be sent via bank wire: Dollar"));
        Assert.assertTrue(myCheckoutPage.ReturnBankWire(3).contains("- Bank wire account information will be displayed on the next page.\n" +
                "- Please confirm your order by clicking \"I confirm my order.\"."));
        myCheckoutPage.ClickOtherPaymentMethods();
        myCheckoutPage.ClickPayByCheque();
        Assert.assertTrue(myCheckoutPage.ReturnPayByCheque(0).contains("You have chosen to pay by check. Here is a short summary of your order:"));
        Assert.assertTrue(myCheckoutPage.ReturnPayByCheque(1).contains("- The total amount of your order comes to: $70.53 (tax incl.)"));
        Assert.assertTrue(myCheckoutPage.ReturnPayByCheque(2).contains("- We allow the following currencies to be sent by check: Dollar"));
        Assert.assertTrue(myCheckoutPage.ReturnPayByCheque(3).contains("- Check owner and address information will be displayed on the next page.\n" +
                "- Please confirm your order by clicking 'I confirm my order'."));
        myCheckoutPage.ClickConfirmMyOrder();
        Assert.assertTrue(myCheckoutPage.ReturnOrderAlertSuccess().contains("Your order on My Store is complete."));
        Assert.assertTrue(myCheckoutPage.ReturnPaymentAmount().contains("$70.53"));
        Assert.assertTrue(myCheckoutPage.ReturnYourChequeMustInclude(0).contains("pradeep"));
        Assert.assertTrue(myCheckoutPage.ReturnYourChequeMustInclude(1).contains("xyz"));
        Assert.assertTrue(myCheckoutPage.ReturnYourChequeMustInclude(2).contains("Your order will be sent as soon as we receive your payment."));
        myCheckoutPage.ClickLogOut();
    }

}
