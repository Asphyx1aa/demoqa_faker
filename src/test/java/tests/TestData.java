package tests;

import utils.RandomUtils;

public class TestData {
    RandomUtils randomUtils = new RandomUtils();

    public String userName = randomUtils.getRandomName();
    public String lastName = randomUtils.getRandomLastName();
    public String userEmail = randomUtils.getRandomEmail();
    public String userGender = randomUtils.getRandomGender();
    public String dayOfBirth = String.format("%s", randomUtils.getRandomDay());
    public String monthOfBirth = String.format("%s", randomUtils.getRandomMonth());
    public String yearOfBirth = String.format("%s", randomUtils.getRandomYear());
    public String userPhone = randomUtils.getRandomPhone();
    public String userAddress = randomUtils.getRandomAddress();
    public String userSubject = randomUtils.getRandomSubject();
    public String userHobbies = randomUtils.getRandomHobby();
    public String userImage = randomUtils.getRandomImage();
    public String userState = randomUtils.getRandomState();
    public String userCity = randomUtils.getRandomCity(userState);
}
