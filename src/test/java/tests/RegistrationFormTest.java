package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class RegistrationFormTest extends BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    void successfulFillingFormTest() {

        registrationPage.openPage()
                .removeBanner()
                .setName(testData.userName)
                .setLastName(testData.lastName)
                .setUserEmail(testData.userEmail)
                .setUserGender(testData.userGender)
                .setUserNumber(testData.userPhone)
                .setUserBirthday(testData.dayOfBirth, testData.monthOfBirth, testData.yearOfBirth)
                .setUserSubjects(testData.userSubject)
                .setUserHobbies(testData.userHobbies)
                .uploadUserPicture(testData.userImage)
                .setUserAddress(testData.userAddress)
                .setUserState(testData.userState)
                .setUserCity(testData.userCity)
                .submitRegistrationForm()
                .checkUserData("Student Name", String.format("%s %s", testData.userName, testData.lastName))
                .checkUserData("Student Email", testData.userEmail)
                .checkUserData("Gender", testData.userGender)
                .checkUserData("Mobile", testData.userPhone)
                .checkUserData("Date of Birth", String.format("%s %s,%s", testData.dayOfBirth, testData.monthOfBirth, testData.yearOfBirth))
                .checkUserData("Subjects", testData.userSubject)
                .checkUserData("Hobbies", testData.userHobbies)
                .checkUserData("Picture", testData.userImage)
                .checkUserData("Address", testData.userAddress)
                .checkUserData("State and City", String.format("%s %s", testData.userState, testData.userCity));
    }

    @Test
    void fillFormWithNecessaryFieldsTest() {

        registrationPage.openPage()
                .setName(testData.userName)
                .setLastName(testData.lastName)
                .setUserGender(testData.userGender)
                .setUserNumber(testData.userPhone)
                .submitRegistrationForm()
                .checkUserData("Student Name", String.format("%s %s", testData.userName, testData.lastName))
                .checkUserData("Gender", testData.userGender)
                .checkUserData("Mobile", testData.userPhone);

    }

    @Test
    void fillFormWithoutNecessaryFieldsTest() {

        registrationPage.openPage()
                .setUserEmail(testData.userEmail)
                .setUserBirthday(testData.dayOfBirth, testData.monthOfBirth, testData.yearOfBirth)
                .setUserSubjects(testData.userSubject)
                .setUserHobbies(testData.userHobbies)
                .uploadUserPicture(testData.userImage)
                .setUserAddress(testData.userAddress)
                .setUserState(testData.userState)
                .setUserCity(testData.userCity)
                .submitRegistrationForm()
                .checkTableExist();
    }
    
}
