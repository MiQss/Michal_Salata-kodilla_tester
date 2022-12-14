package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps2 implements En {

    private String answer;
    private String alert;

    private int balance;
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    public WalletSteps2() {

        Given ("There is $100 in my wallet", ()-> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When ("I check the balance of my wallet", ()-> {
            this.balance = wallet.getBalance();
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        Then("I should see that the balance is $100", ()-> {
            this.answer = wallet.displayBalance();
            Assert.assertEquals("The balance of yor wallet is: $"+this.balance, this.answer);
        });

        // ---------------------------------------------------------------------------------------------

        Given ("There is $150 in my wallet", ()-> {
            wallet.deposit(150);
            Assert.assertEquals("Incorrect wallet balance", 150, wallet.getBalance());
        });

        When ("I withdraw $200", ()-> {
            this.alert = cashier.withdraw(wallet, 200);
        });

        Then("Nothing should be dispensed", ()-> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet", ()-> {
            Assert.assertEquals("You don't have enough money",  this.alert);
        });
    }
}

