package mk.sedc.pages.automationpractice;

import mk.sedc.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ShoppingPage {

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


    public ShoppingPage(WebDriver driver, WebDriverWait wait) {
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


}