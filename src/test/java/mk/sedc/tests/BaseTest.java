package mk.sedc.tests;

import mk.sedc.pages.automationpractice.CheckOutPage;
import mk.sedc.pages.automationpractice.ShoppingPage;
import mk.sedc.pages.automationpractice.RegistrationPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private static Actions action;
    public String browser = "Chrome";
    public static final int TIMEOUT = 10;
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public RegistrationPage myRegistrationPage;
    public ShoppingPage myShoppingPage;
    public CheckOutPage myCheckoutPage;
    public JavascriptExecutor js;

    public static void hoverOver(WebElement element) {
        action.moveToElement(element).perform();
    }

    public static final String URL = "http://automationpractice.com/index.php";
    String emailAddress = "lwiii.milosov@gmail.com";
    String companyName = "Automated Testing";
    String address1 = "801 Tom Martin";
    String address2 = "12/4";
    String city = "Birmingham";
    String state = "Alabama";
    String zipCode = "35211";
    String country = "United States";
    String homePhoneNum = "0038932496441";
    String phoneNum = "00381631626658";
    String dayOfBirth = "19";
    String monthOfBirth = "October";
    String yearOfBirth = "1983";
    String additionalInfo = "Additional Info";
    String aliasAdd = "ljubisa.milosov@gmail.com";
    String firstName = "Ljubisha";
    String lastName = "Milosov";
    String password = "Automation2021";
    String color1 = "Yellow";
    String size1 = "L";
    String product1Qty = "2";
    String products1Price = "$32.80";
    String color2 = "Blue";
    String size2 = "M";
    String product2Qty = "2";
    String products2Price = "$33.02";
    String color3 = "Black";
    String size3 = "S";
    String product3Qty = "4";
    String products3Price = "$108.00";
    String price3WithoutShipping = "$173.82";
    String shippingPrice = "$2.00";
    String price3WithShipping = "$175.82";
    String productName1 = "Printed Chiffon Dress";
    String cart1RefNum = "SKU : demo_7";
    String colorSize1 = "Color : Yellow, Size : L";
    String inStock = "In stock";
    String oldPrice = "$20.50";
    String discount = "-20%";
    String reductionDiscount = "-16.78%";
    String specialPrice = "$16.40";
    String totalProducts1Price = "$32.80";
    String productName2 = "Faded Short Sleeve T-shirts";
    String cartRefNum2 = "SKU : demo_1";
    String colorSize2 = "Color : Blue, Size : M";
    String product2UnitPrice = "$16.51";
    String totalProducts2Price = "$33.02";
    String totalWithoutShipping = "$65.82";
    String totalShipping = "$2.00";
    String totalWithoutTax = "$67.82";
    String totalTax = "$2.71";
    String totalWithTax = "$70.53";


    @BeforeMethod
    public void set_up() {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/edgedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.out.println("Browser not supported");
        }
        wait = new WebDriverWait(driver, TIMEOUT);
        myRegistrationPage = new RegistrationPage(driver, wait);
        myShoppingPage = new ShoppingPage(driver, wait);
        myCheckoutPage = new CheckOutPage(driver, wait);
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tear_down() {
        driver.quit();


    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
