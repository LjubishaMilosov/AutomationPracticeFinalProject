package mk.sedc.pages.automationpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage {
    private WebDriver driver;
    private WebDriverWait wait;


    private By signIn = By.className("login");
    private By emailCreate = By.id("email_create");
    private By submitEmail = By.id("SubmitCreate");
    private By inputGender = By.id("id_gender1");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By enterPassword = By.id("passwd");
    private By dateOfBirth = By.xpath("//*[@id='uniform-days']/select/option");
    private By month = By.xpath("//*[@id='uniform-months']/select/option");
    private By year = By.xpath("//*[@id='uniform-years']/select/option");
    private By newsletter = By.xpath("//*[@id='uniform-newsletter']");
    private By specialOffers = By.xpath("//*[@id='uniform-optin']");
    private By companyName = By.id("company");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By cityName = By.id("city");
    private By stateName = By.xpath("//*[@id='uniform-id_state']/select/option");
    private By zipCode = By.id("postcode");
    private By country = By.xpath("//*[@id='uniform-id_country']/select/option");
    private By addInfo = By.id("other");
    private By homePhone = By.id("phone");
    private By mobPhone = By.id("phone_mobile");
    private By aliasAddress = By.id("alias");
    private By registerAccount = By.id("submitAccount");

    private By myPersonalInformation = By.xpath("//*[@title='Information']");
    private By returnGender = By.xpath("//*[@class='radio']/span");
    private By returnPersonalInfo = By.xpath("//*[@class='is_required validate form-control']");
    private By returnDateOfBirth = By.xpath("//*[@class='col-xs-4']/div/span");
    private By returnCheckBoxes = By.xpath("//*[@class='checker']/span");
    private By backToYourAccount = By.xpath("//*[@id='center_column']/ul/li[1]/a/span");
    private By myAddresses = By.xpath("//*[@title='Addresses']");
    private By returnMyAddresses = By.xpath("//*[@class='last_item item box']/li");
    private By returnToHomePage = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/a/span");
    private By logOut = By.xpath("//*[@title='Log me out']");


    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void NavigateToPage(String URL) {
        driver.get(URL);
    }


    public void ClickSignIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).click();
    }

    public void EnterEmailCreate(String emailAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailCreate)).sendKeys(emailAddress);
    }

    public void ClickSubmit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitEmail)).click();
    }

    public void ClickGender() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputGender)).click();
    }

    public void TypeFirstName(String firstname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(firstname);
    }

    public void TypeLastName(String lastname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(lastname);
    }

    public void TypePassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterPassword)).sendKeys(password);
    }

    public void SelectDateOfBirth(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dateOfBirth)).get(index).click();
    }

    public void SelectMonth(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(month)).get(index).click();
    }

    public void SelectYear(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(year)).get(index).click();
    }

    public void selectSignUpForNewsletter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newsletter)).click();
    }

    public void selectSignUpForSpecialOffers() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(specialOffers)).click();
    }

    public void TypeCompanyName(String company) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyName)).sendKeys(company);
    }

    public void TypeAddress1(String address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(address1)).sendKeys(address);
    }

    public void TypeAddress2(String address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(address2)).sendKeys(address);
    }

    public void TypeCityName(String city) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityName)).sendKeys(city);
    }

    public void TypeStateName(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(stateName)).get(index).click();
    }

    public void TypeZipCode(String postcode) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipCode)).sendKeys(postcode);
    }

    public void SelectCountry(int index) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(country)).get(index).click();
    }

    public void TypeAdditionalInfo(String additionalInfo) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addInfo)).sendKeys(additionalInfo);
    }

    public void TypeHomePhone(String homephone) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePhone)).sendKeys(homephone);
    }

    public void TypeMobPhone(String mobile) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobPhone)).sendKeys(mobile);
    }


    public void TypeAliasAddress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(aliasAddress)).clear();
    }

    public void TypeAliasAdd(String aliasAdd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(aliasAddress)).sendKeys(aliasAdd);
    }


    public void ClickRegisterAccount() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerAccount)).click();
    }

    public void ClickMyPersonalInformation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myPersonalInformation)).click();
    }

    public String ReturnGender(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnGender)).get(index).getAttribute("class");
    }

    public String ReturnPersonalInformation(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnPersonalInfo)).get(index).getAttribute("value");
    }

    public String ReturnDateOfBirth(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnDateOfBirth)).get(index).getText();
    }

    public String ReturnCheckBoxes(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnCheckBoxes)).get(index).getAttribute("class");
    }

    public void ClickBackToYourAccount() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(backToYourAccount)).click();
    }

    public void ClickMyAddresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAddresses)).click();
    }

    public String ReturnMyAddresses(int index) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnMyAddresses)).get(index).getText();
    }

    public void clickBackToHOmePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(returnToHomePage)).click();
    }

    public void ClickLogOut() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(logOut)).click();
    }


}




