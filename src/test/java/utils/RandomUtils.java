package utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    Faker faker = new Faker();

    public String getRandomName() {
        return faker.name().firstName();
    }

    public String getRandomLastName() {
        return faker.name().lastName();
    }

    public String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public String getRandomGender() {
        String[] gender = {"Male", "Female", "Other"};

        return faker.options().option(gender);
    }

    public int getRandomDay() {
        return faker.number().numberBetween(10, 28);
    }


    public String getRandomMonth() {
        String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November", "December"};

        return faker.options().option(months);
    }

    public int getRandomYear() {
        return faker.number().numberBetween(1920, 2020);
    }

    public String getRandomPhone() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomSubject() {
        String[] subjects = {"Hindi", "English", "Maths", "Physics", "Chemistry", "Biology",
                "Computer Science", "Commerce", "Accounting", "Economics", "Arts", "Social Studies", "History",
                "Civics"};

        return faker.options().option(subjects);
    }

    public String getRandomHobby() {
        String[] hobbies = {"Sports", "Reading", "Music"};

        return faker.options().option(hobbies);
    }

    public String getRandomImage() {
        String[] files = {"sample-pic.jpg", "sample-2.jpg"};

        return faker.options().option(files);
    }

    public String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        return faker.options().option(states);
    }

    public String getRandomCity(String state) {
        return selectCity(state);
    }


    private String selectCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };
    }

}
