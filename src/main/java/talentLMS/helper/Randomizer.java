package talentLMS.helper;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;

public class Randomizer {
    public Faker faker = new Faker();

    public String fakeLoginGenerate() {
        return faker.name().fullName();
    }

    public String fakePasswordGenerate() {
        return faker.internet().password();
    }

    public String fakeEmailGenerate() {
        return faker.internet().emailAddress();
    }

}
