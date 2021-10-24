package mk.sedc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {


    @Test
    public void registerNewUserTests() {

        myRegistrationPage.NavigateToPage(URL);
        myRegistrationPage.ClickSignIn();
        myRegistrationPage.EnterEmailCreate(emailAddress);
        myRegistrationPage.ClickSubmit();
        myRegistrationPage.ClickGender();
        myRegistrationPage.TypeFirstName(firstName);
        myRegistrationPage.TypeLastName(lastName);
        myRegistrationPage.TypePassword(password);
        myRegistrationPage.SelectDateOfBirth(19);
        myRegistrationPage.SelectMonth(10);
        myRegistrationPage.SelectYear(39);
        myRegistrationPage.selectSignUpForNewsletter();
        myRegistrationPage.selectSignUpForSpecialOffers();
        myRegistrationPage.TypeCompanyName(companyName);
        myRegistrationPage.TypeAddress1(address1);
        myRegistrationPage.TypeAddress2(address2);
        myRegistrationPage.TypeCityName(city);
        myRegistrationPage.TypeStateName(1);
        myRegistrationPage.TypeZipCode(zipCode);
        myRegistrationPage.SelectCountry(1);
        myRegistrationPage.TypeAdditionalInfo(additionalInfo);
        myRegistrationPage.TypeHomePhone(homePhoneNum);
        myRegistrationPage.TypeMobPhone(phoneNum);
        myRegistrationPage.TypeAliasAddress();
        myRegistrationPage.TypeAliasAdd(aliasAdd);
        myRegistrationPage.ClickRegisterAccount();
        myRegistrationPage.ClickMyPersonalInformation();
        Assert.assertTrue(myRegistrationPage.ReturnGender(0).contains("checked"));
        Assert.assertTrue(myRegistrationPage.ReturnPersonalInformation(0).contains(firstName));
        Assert.assertTrue(myRegistrationPage.ReturnPersonalInformation(1).contains(lastName));
        Assert.assertTrue(myRegistrationPage.ReturnPersonalInformation(2).contains(emailAddress));
        js.executeScript("window.scrollBy(0,500)");
        Assert.assertTrue(myRegistrationPage.ReturnDateOfBirth(0).contains(dayOfBirth));
        Assert.assertTrue(myRegistrationPage.ReturnDateOfBirth(1).contains(monthOfBirth));
        Assert.assertTrue(myRegistrationPage.ReturnDateOfBirth(2).contains(yearOfBirth));
        Assert.assertTrue(myRegistrationPage.ReturnCheckBoxes(0).contains("checked"));
        Assert.assertTrue(myRegistrationPage.ReturnCheckBoxes(1).contains("checked"));
        myRegistrationPage.ClickBackToYourAccount();
        myRegistrationPage.ClickMyAddresses();
        Assert.assertTrue(myRegistrationPage.ReturnMyAddresses(1).contains(firstName + " " + lastName));
        Assert.assertTrue(myRegistrationPage.ReturnMyAddresses(2).contains(companyName));
        Assert.assertTrue(myRegistrationPage.ReturnMyAddresses(3).contains(address1 + " " + address2));
        Assert.assertTrue(myRegistrationPage.ReturnMyAddresses(4).contains(city + ", " + state + " " + zipCode));
        Assert.assertTrue(myRegistrationPage.ReturnMyAddresses(5).contains(country));
        Assert.assertTrue(myRegistrationPage.ReturnMyAddresses(6).contains(homePhoneNum));
        Assert.assertTrue(myRegistrationPage.ReturnMyAddresses(7).contains(phoneNum));
        myRegistrationPage.clickBackToHOmePage();
        myRegistrationPage.ClickLogOut();

    }

}
