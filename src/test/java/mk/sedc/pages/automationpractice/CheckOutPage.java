package mk.sedc.pages.automationpractice;

import mk.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class CheckOutPage {

    private WebDriver driver;
    private WebDriverWait wait;


    private By signIn = By.className("login");
    private By provideEmail = By.id("email");
    private By enterPassword = By.id("passwd");
    private By logIn = By.id("SubmitLogin");
    private By thumbnail = By.xpath("(//*[@title='Women'])[1]");
    private By sumDresses = By.xpath("(//*[@title='Summer Dresses'])[1]");
    private By viewByList = By.xpath("//*[@id='list']/a/i");
    private By chiffonDress = By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div/div[2]/h5/a");
    private By changeQuantity = By.xpath("//*[@id=\"quantity_wanted_p\"]/a/span");
    private By selectSize = By.xpath("//*[@id='group_1']/option");
    private By colorSelect = By.xpath("//*[@id='color_to_pick_list']/li");
    private By addToCart = By.xpath("//*[@id='add_to_cart']/button/span");
    private By returnCartProductAttributes = By.xpath("//*[@id='layer_cart_product_attributes']");
    private By returnQuantityWanted = By.xpath("//*[@id='layer_cart_product_quantity']");
    private By returnTotalCartPrice = By.xpath("//*[@id=\"layer_cart_product_price\"]");
    private By returnCartTotalPriceWithoutShipping = By.xpath("//*[@class=\"ajax_block_products_total\"]");
    private By returnShippingPrice = By.xpath("//*[@class='ajax_cart_shipping_cost']");
    private By returnCartTotalPriceWithShipping = By.xpath("//*[@class=\"ajax_block_cart_total\"]");
    private By continueShopping = By.xpath("//*[@title='Continue shopping']");
    private By bestSellers = By.xpath("//*[@id='block_various_links_footer']/ul/li[3]/a");
    private By fadedShortSleeve = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div/div[2]/h5/a");
    private By blouses = By.xpath("(//*[@title='Blouses'])[1]");
    private By selectBlouse = By.xpath("//*[@title=\"Blouse\"]");
    private By viewMyCart = By.xpath("//*[@title='View my shopping cart']");
    private By returnProductName = By.xpath("//*[@class=\"cart_description\"]/p");
    private By returnCartDescription = By.xpath("//*[@class=\"cart_description\"]/small");
    private By returnInStock = By.xpath("//*[@class=\"label label-success\"]");
    private By returnTotalProductPrice = By.xpath("//*[@class=\"cart_total\"]/span");
    private By returnUnitPrices = By.xpath("//*[@class=\"cart_unit\"]/span/span");
    private By returnTotalPriceWithoutShipping = By.xpath("//*[@id=\"total_product\"]");
    private By returnTotalShippingPrice = By.xpath("//*[@id=\"total_shipping\"]");
    private By returnTotalPriceWithoutTax = By.xpath("//*[@id=\"total_price_without_tax\"]");
    private By returnTotalTax = By.xpath("//*[@id='total_tax']");
    private By returnTotalPriceWithTax = By.xpath("//*[@id='total_price_container']");
    private By updateAddresses = By.xpath("//*[@title=\"Update\"]");
    private By submitAddress = By.xpath("//*[@id=\"submitAddress\"]");
    private By processAddress = By.xpath("//*[@class=\"button btn btn-default button-medium\"]");
    private By shippingChecker = By.xpath("//*[@class=\"checked\"]");
    private By termsOfService = By.xpath("//*[@class=\"iframe\"]");
    private By closeTermsOfService = By.xpath("//*[@class=\"fancybox-item fancybox-close\"]");
    private By agreeToTermsOfService = By.xpath("//*[@class=\"checker\"]/span");
    private By returnAgreedTermsOfService = By.xpath("//*[@class=\"checked\"]");
    private By proceedToPayment = By.xpath("//*[@class=\"button btn btn-default standard-checkout button-medium\"]");
    private By payByBankWire = By.xpath("//*[@class=\"bankwire\"]");
    private By returnCheckPayment = By.xpath("//*[@class=\"box cheque-box\"]/p");
    private By otherPaymentMethods = By.xpath("//*[@class=\"button-exclusive btn btn-default\"]");
    private By payByCheque = By.xpath("//*[@class=\"cheque\"]");
    private By returnQuantitiesWanted = By.xpath("//*[@class=\"cart_quantity text-center\"]/span");
    private By confirmMyOrder = By.xpath("//*[@class=\"button btn btn-default button-medium\"]");
    private By orderAlertSuccess = By.xpath("//*[@class=\"alert alert-success\"]");
    private By returnPaymentAmount = By.xpath("//*[@id=\"center_column\"]/div/span/strong");
    private By returnYourChequeMustInclude = By.xpath("//*[@class=\"center_column col-xs-12 col-sm-12\"]/div/strong");
    private By addQtyInCart = By.xpath("//*[@class='cart_quantity_up btn btn-default button-plus']");
    private By deleteProductInCart = By.xpath("//*[@class='cart_quantity_delete']");
    private By proceedToAddressCheckout = By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']");
    private By returnDeliveryAndInvoiceAddress = By.xpath("//*[@class=\"col-xs-12 col-sm-6\"]/ul/li");
    private By returnDeliveryAndBillingAddress = By.xpath("//*[@class=\"col-xs-12 col-sm-6\"]/ul/li");
    private By logOut = By.xpath("//*[@title='Log me out']");

    public CheckOutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public void navigateToPage(String URL) {
        driver.get(URL);
    }

    public void ClickSignIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).click();
    }

    public void TypeEmailSingIn(String emailAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(provideEmail)).sendKeys(emailAddress);
    }

    public void TypePassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterPassword)).sendKeys(password);
    }

    public void ClickLogIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(logIn)).click();
    }

    public void hoverOverThumbnail() {
        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(thumbnail));
        for (WebElement element : list) {
            BaseTest.hoverOver(element);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void ClickSummerDresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sumDresses)).click();
    }

    public void ClickViewByList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewByList)).click();
    }

    public void SelectChiffonDress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chiffonDress)).click();
    }

    public void ClickIncreaseQuantity(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(changeQuantity)).get(index).click();
    }

    public void ClickDecreaseQuantity(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(changeQuantity)).get(index).click();
    }

    public void SelectSize(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectSize)).get(index).click();
    }

    public void SelectColor(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(colorSelect)).get(index).click();
    }

    public void ClickAddToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart)).click();
    }

    public String ReturnCartProductAttributes() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnCartProductAttributes)).getText();
    }

    public String ReturnCartProductQuantity() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnQuantityWanted)).getText();
    }

    public String ReturnCartProductPrice() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnTotalCartPrice)).getText();
    }

    public String ReturnCartTotalPriceWithoutShipping() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnCartTotalPriceWithoutShipping)).getText();
    }

    public String ReturnShippingPrice() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnShippingPrice)).getText();
    }

    public String ReturnCartTotalPriceWithShipping() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnCartTotalPriceWithShipping)).getText();
    }

    public void SelectContinueShopping() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping)).click();
    }

    public void SelectBestSellers() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(bestSellers)).click();
    }

    public void SelectShortSleeve() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fadedShortSleeve)).click();
    }

    public void ClickBlouses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(blouses)).click();
    }

    public void SelectBlouse(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectBlouse)).get(index).click();
    }

    public void ViewMyCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewMyCart)).click();
    }

    public String ReturnProductName(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnProductName)).get(index).getText();
    }

    public String ReturnCartRefNum(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnCartDescription)).get(index).getText();
    }

    public String ReturnColorSize(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnCartDescription)).get(index).getText();
    }

    public String ReturnInStock(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnInStock)).get(index).getText();
    }

    public String ReturnOldPrice(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnUnitPrices)).get(index).getText();
    }

    public String ReturnDiscountPercent(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnUnitPrices)).get(index).getText();
    }

    public String ReturnDiscountPrice(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnUnitPrices)).get(index).getText();
    }

    public void CartIncreaseQuantity(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(addQtyInCart)).get(index).click();
    }

    public void DeleteProductInCart(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(deleteProductInCart)).get(index).click();
    }

    public String ReturnDiscountReductionPercent(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnUnitPrices)).get(index).getText();
    }

    public String ReturnTotalProductPrice(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnTotalProductPrice)).get(index).getText();
    }

    public String ReturnProduct2Price(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnUnitPrices)).get(index).getText();
    }

    public String ReturnTotalPriceWithoutShipping() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnTotalPriceWithoutShipping)).getText();
    }

    public String ReturnTotalShippingPrice() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnTotalShippingPrice)).getText();
    }

    public String ReturnTotalPriceWithoutTax() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnTotalPriceWithoutTax)).getText();
    }

    public String ReturnTotalTax() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnTotalTax)).getText();
    }

    public String ReturnTotalPriceWithTax() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnTotalPriceWithTax)).getText();
    }

    public String ReturnDeliveryAddress(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnDeliveryAndBillingAddress)).get(index).getText();
    }

    public String ReturnBillingAddress(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnDeliveryAndBillingAddress)).get(index).getText();
    }

    public void UpdateAddresses(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(updateAddresses)).get(index).click();
    }

    public void SaveUpdatedAddress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitAddress)).click();
    }

    public void ProceedToCheckOut() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(processAddress)).click();
    }

    public void ClickReadTermsOfService() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(termsOfService)).click();
    }

    public void ClickCloseTermsOfService() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeTermsOfService)).click();
    }

    public void AgreeToTermsOfService() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(agreeToTermsOfService)).click();
    }

    public void SelectDeliveryNextDay(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(shippingChecker)).get(index).click();
    }

    public String ReturnDeliveryNextDay(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(shippingChecker)).get(index).getAttribute("class");
    }

    public String ReturnAgreedTermsOfService(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnAgreedTermsOfService)).get(index).getAttribute("class");
    }

    public void ClickProceedToPayment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToPayment)).click();
    }

    public String ReturnQuantitiesWanted(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnQuantitiesWanted)).get(index).getText();
    }

    public void ClickPayByBankWire() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(payByBankWire)).click();
    }

    public String ReturnBankWire(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnCheckPayment)).get(index).getText();
    }

    public void ClickOtherPaymentMethods() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(otherPaymentMethods)).click();
    }

    public void ClickPayByCheque() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(payByCheque)).click();
    }

    public String ReturnPayByCheque(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnCheckPayment)).get(index).getText();
    }

    public void ClickConfirmMyOrder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmMyOrder)).click();
    }


    public String ReturnOrderAlertSuccess() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(orderAlertSuccess)).getText();
    }

    public String ReturnYourChequeMustInclude(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnYourChequeMustInclude)).get(index).getText();
    }

    public void ProceedToAddressCheckout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToAddressCheckout)).click();
    }

    public String ReturnProductDeliveryAddress(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnDeliveryAndInvoiceAddress)).get(index).getText();
    }

    public String ReturnInvoiceAddress(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnDeliveryAndInvoiceAddress)).get(index).getText();
    }

    public String ReturnPaymentAmount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnPaymentAmount)).getText();

    }

    public void ClickLogOut() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(logOut)).click();
    }
}
