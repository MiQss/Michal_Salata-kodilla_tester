package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleSteps implements En {

    private int number;
    private String answer;

    public IsItDivisibleSteps() {
        Given("the number is 3", () -> {
            this.number = 3;
        });

        Given("the number is 5", () -> {
            this.number = 5;
        });

        Given("the number is 7", () -> {
            this.number = 7;
        });

        Given("the number is 9", () -> {
            this.number = 9;
        });

        Given("the number is 10", () -> {
            this.number = 10;
        });

        Given("the number is 15", () -> {
            this.number = 15;
        });

        Given("the number is 17", () -> {
            this.number = 17;
        });

        Given("the number is 30", () -> {
            this.number = 30;
        });

        When("I check if number is divisible", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);
        });

        Then("The answer is {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });


    }
}
